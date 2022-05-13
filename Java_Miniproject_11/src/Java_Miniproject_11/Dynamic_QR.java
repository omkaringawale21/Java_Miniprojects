package Java_Miniproject_11;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class Dynamic_QR {

	public static void generate_qr(String image_name, String qrCodeData) {
		
		try{
			String qrCodeData1 = "www.google.com map";
			String filePath = "F:\\QR-Code\\" + image_name +".png";
			String charset = "UTF-8";    // Or "ISO-8859-1"
			Map< EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel >();
			hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
			BitMatrix matrix = new MultiFormatWriter().encode(
					new String(qrCodeData1.getBytes(charset), charset),
					BarcodeFormat.QR_CODE, 200, 200, hintMap);
			MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf(".") + 1), 
					new File(filePath));
			System.out.println("Qr Code image created succesfully!");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		try{
			DBConnection obj_DBConnection = new DBConnection();
			Connection connection = obj_DBConnection.getConnection();
			String query = "SELECT * FROM qrcode.qrlinks";
			Statement state = connection.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()){
				Dynamic_QR.generate_qr(rs.getString("srno"), rs.getString("links"));
			}
			connection.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
