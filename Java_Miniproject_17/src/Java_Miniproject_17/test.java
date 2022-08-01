package Java_Miniproject_17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class test extends javax.swing.JFrame {
	
	public test(){
		ActionListener avt = null;
		jButtonActionPerformed(avt);
		setIconImage(new ImageIcon(getClass().getResource("../test/test.jpg")).getImage());
	}
	
	@SuppressWarnings("unchecked")
	private void jButtonActionPerformed(java.awt.event.ActionListener avt){
		JFileChooser jFileChooser = new JFileChooser();
		int action = jFileChooser.showOpenDialog(this);
		if(action == 1){
			System.out.println(jFileChooser.getSelectedFile().getName());
		}
	}

	public static void main(String[] args) {
		
		java.awt.EventQueue.invokeLater(new Runnable(){
			@Override
			public void run() {
				new test().setVisible(true);
			}
		});

	}

	private javax.swing.JButton jButton;
	
}
