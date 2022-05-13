package Java_MiniProject7;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;

/* Problem Statement : Creating Contact Us Page With Google Map Through Java */

public class Google_Map extends javax.swing.JFrame{

	public Google_Map(){
		initComponents();
		init();
	}
	
	private void init(){
		
		TileFactoryInfo info = new OSMTileFactoryInfo();
		DefaultTileFactory tileFactory = new DefaultTileFactory(info);
		jXMapViewer.setTileFactory(tileFactory);
		GeoPosition geo = new GeoPosition(18.4512318,73.8513744);
		jXMapViewer.setAddressLocation(geo);
		jXMapViewer.setZoom(12);
		
		// Create event mouse move
		MouseInputListener mm = new PanMouseInputListener(jXMapViewer);
		jXMapViewer.addMouseListener(mm);
		jXMapViewer.addMouseMotionListener(mm);
		jXMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer));
		
	}
	
	@SuppressWarnings("unchecked")
//	<editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents(){
		
		jXMapViewer = new org.jxmapviewer.JXMapViewer();
		comboMapType = new javax.swing.JComboBox<>();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		comboMapType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open Stree", "Virtual Earth", "Hybrid", "Satellite" }));
		comboMapType.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				comboMapTypeActionPerformed(evt);
			}
		});
		
		javax.swing.GroupLayout jXMapViewerLayout = new javax.swing.GroupLayout(jXMapViewer);
		jXMapViewer.setLayout(jXMapViewerLayout);
		jXMapViewerLayout.setHorizontalGroup(
			jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXMapViewerLayout.createSequentialGroup()
					.addContainerGap(992, Short.MAX_VALUE)
					.addComponent(comboMapType, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		jXMapViewerLayout.setVerticalGroup(
			jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jXMapViewerLayout.createSequentialGroup()
					.addComponent(comboMapType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(0, 640, Short.MAX_VALUE))
		);
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		jXMapViewer = new org.jxmapviewer.JXMapViewer();
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		pack();
		setLocationRelativeTo(null);
		
	}//</editor-fold>//GEN-End:initComponents
	
	private void comboMapTypeActionPerformed(java.awt.event.ActionEvent evt){// GEN-FRIST:event_comboMapTypeActionPerformed
		
		TileFactoryInfo info;
		int index = comboMapType.getSelectedIndex();
		if(index == 0){
			info = new OSMTileFactoryInfo();
		}else if(index == 1){
			info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
		}else if(index == 2){
			info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.HYBRID);
		}else{
			info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.SATELLITE);
		}
		DefaultTileFactory tileFactory = new DefaultTileFactory(info);
		jXMapViewer.setTileFactory(tileFactory);
		
	}// GEN-LAST:event_comboMapTypeActionPerformed
	
	public static void main(String[] args) {
		
		/* Set the Nimbus look and feel */
//		<editor-fold defaultstate="collapsed" desc="look and feel setting code (option) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		
		try{
			for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
				if("Nimbus".equals(info.getName())){
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}catch(ClassNotFoundException ex){
			java.util.logging.Logger.getLogger(Google_Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}catch(InstantiationException ex){
		    java.util.logging.Logger.getLogger(Google_Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }catch(IllegalAccessException ex){
		    java.util.logging.Logger.getLogger(Google_Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }catch(javax.swing.UnsupportedLookAndFeelException ex){
		    java.util.logging.Logger.getLogger(Google_Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
//		</editor-fold>
		
		/* Create and display the Form */
		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run(){
				new Google_Map().setVisible(true);
			}
		});
		
	}
	
//	Variables declaration - do not modify//GEN-BEGIN:variables
	
	private javax.swing.JComboBox<String> comboMapType;
	private org.jxmapviewer.JXMapViewer jXMapViewer;
	
//	End of variables declaration??GEN-END:variables
	
}
