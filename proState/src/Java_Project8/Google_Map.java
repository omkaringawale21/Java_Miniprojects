package Java_Project8;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;

public class Google_Map extends javax.swing.JFrame{

	private final Set<MyWaypoint> waypoints = new HashSet<>();
	private EventWaypoint event;
	
	public Google_Map(){
		initComponents();
		init();
	}
	
	private void init(){
		
		TileFactoryInfo info = new OSMTileFactoryInfo();
		DefaultTileFactory tileFactory = new DefaultTileFactory(info);
		jXMapViewer.setTileFactory(tileFactory);
		GeoPosition geo = new GeoPosition(18.4494217,73.8594742);
		jXMapViewer.setAddressLocation(geo);
		jXMapViewer.setZoom(12);
		
		MouseInputListener mm = new PanMouseInputListener(jXMapViewer);
		jXMapViewer.addMouseListener(mm);
		jXMapViewer.addMouseMotionListener(mm);
		jXMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer));
		event = getEvent();
		
	}

	private void addWaypoint(MyWaypoint waypoint){
		
		for(MyWaypoint d : waypoints){
			jXMapViewer.remove(d.getButton());
		}
		waypoints.add(waypoint);
		initWaypoint();
		
	}
	
	private void initWaypoint() {
		
		WaypointPainter<MyWaypoint> wp = new WaypointRender();
		wp.setWaypoints(waypoints);
		jXMapViewer.setOverlayPainter(wp);
		for(MyWaypoint d : waypoints){
			jXMapViewer.add(d.getButton());
		}
		
	}

	private void clearWaypoint(){
		
		for(MyWaypoint d : waypoints){
			jXMapViewer.remove(d.getButton());
		}
		waypoints.clear();
		initWaypoint();
		
	}
	
	private EventWaypoint getEvent() {
		
		return new EventWaypoint(){
			@Override
			public void selected(MyWaypoint waypoint){
				JOptionPane.showMessageDialog(Google_Map.this, waypoint.getName());
			}
		};
		
	}
	
	@SuppressWarnings("unchecked")
	private void initComponents(){
		
		jXMapViewer = new org.jxmapviewer.JXMapViewer();
		comboMapType = new javax.swing.JComboBox<>();
		cmdAdd = new javax.swing.JButton();
		cmdClear = new javax.swing.JButton();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		comboMapType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Open Stree", "Virtual Earth", "Hybrid", "Satellite"} ));
		comboMapType.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				comboMapTypeActionPerformed(evt);
			}
		});
		
		cmdAdd.setText("Add Waypoint");
		cmdAdd.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				cmdAddActionPerformed(evt);
			}
		});
		
		cmdClear.setText("Clear Waypoint");
		cmdClear.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				cmdClearActionPerformed(evt);
			}
		});
		
		javax.swing.GroupLayout jXMapViewerLayout = new javax.swing.GroupLayout(jXMapViewer);
		jXMapViewer.setLayout(jXMapViewerLayout);
		jXMapViewerLayout.setHorizontalGroup(
			jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXMapViewerLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(cmdAdd)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(cmdClear)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 767, Short.MAX_VALUE)
					.addComponent(comboMapType, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		jXMapViewerLayout.setVerticalGroup(
			jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jXMapViewerLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
							.addComponent(comboMapType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(cmdAdd)
							.addComponent(cmdClear))
					.addContainerGap(632, Short.MAX_VALUE))
		);
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
					.addGap(0, 0, 0)
					.addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(0, 0, 0))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
					.addGap(0, 0, 0)
					.addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(0, 0, 0))
		);
		
		pack();
		setLocationRelativeTo(null);
		
	}
	
	private void comboMapTypeActionPerformed(java.awt.event.ActionEvent evt){
		
		TileFactoryInfo info;
		int index = comboMapType.getSelectedIndex();
		if(index == 0){
			info = new OSMTileFactoryInfo();
		}
		else if(index == 1){
			info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
		}
		else if(index == 2){
			info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.HYBRID);
		}
		else{
			info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.SATELLITE);
		}
		
		DefaultTileFactory tileFactory = new DefaultTileFactory(info);
		jXMapViewer.setTileFactory(tileFactory);
		
	}
	
	public void cmdAddActionPerformed(java.awt.event.ActionEvent evt){
		waypoints.add(new MyWaypoint("Test 001", event, new GeoPosition(18.448058, 73.858533)));
		addWaypoint(new MyWaypoint("Test 002", event, new GeoPosition(18.446195, 73.809675)));
	}
	
	public void cmdClearActionPerformed(java.awt.event.ActionEvent evt){
		clearWaypoint();
	}

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

	private javax.swing.JButton cmdAdd;
	private javax.swing.JButton cmdClear;
	private javax.swing.JComboBox<String> comboMapType;
	private org.jxmapviewer.JXMapViewer jXMapViewer;
	
}
