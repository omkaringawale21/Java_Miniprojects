package Java_Project9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Test extends javax.swing.JFrame{

	public Test(){
		
		initComponents();
		getContentPane().setBackground(new Color(250, 250, 250));
		
	}
	
	@SuppressWarnings(value = { "unchecked" })
	private void initComponents() {
		
		panelRound1 = new PanelRound();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		panelRound1.setBackground(new java.awt.Color(84, 137, 242));
		panelRound1.setRoundBottomRight(100);
		panelRound1.setRoundTopLeft(100);
		
		javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
		panelRound1.setLayout(panelRound1Layout);
		panelRound1Layout.setHorizontalGroup(
				panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 350, Short.MAX_VALUE)
		);
		panelRound1Layout.setVerticalGroup(
				panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 161, Short.MAX_VALUE)
		);
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(234, 234, 234)
						.addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(235, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(119, 119, 119)
						.addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(192, Short.MAX_VALUE))
		);

		pack();
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		
		try{
			
			for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
				
				if("Nimbus".equals(info.getName())){
					
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
					
				}
				
			}
			
		}catch(ClassNotFoundException ex){
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}catch(InstantiationException ex){
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}catch(IllegalAccessException ex){
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}catch(javax.swing.UnsupportedLookAndFeelException ex){
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable(){
			
			public void run(){
				new Test().setVisible(true);
			}
			
		});
		
	}

	private javax.swing.JComboBox<String> comboType;
	private PanelRound panelRound1;
	
}
