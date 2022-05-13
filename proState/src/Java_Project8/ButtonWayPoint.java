package Java_Project8;

import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonWayPoint extends JButton {

	String resource = "../proState/imagejava8/Location_Img.png";

	public ButtonWayPoint(){
		setContentAreaFilled(false);
//		if(new ImageIcon(getClass().getResource(resource)) == null){
//			System.out.println("Resource null");
//		}
//		setIcon(new ImageIcon(getClass().getResource(resource)));
		setIcon(new ImageIcon(resource));
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setSize(new Dimension(24, 24));
		setVisible(true);
	}
	
}
