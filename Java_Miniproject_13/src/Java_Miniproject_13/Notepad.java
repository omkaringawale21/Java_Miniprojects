package Java_Miniproject_13;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Problem Statement : Build a Simple Notepad Application using Java.
 * @Author : Omkar Ingawale
 */

public class Notepad extends JFrame implements ActionListener, WindowListener {

	JTextArea jta = new JTextArea();
	File fnameContainer;
	
	public Notepad(){
		
		Font fnt = new Font("Arial", Font.PLAIN, 15);
		Container con = getContentPane();
		JMenuBar jmb = new JMenuBar();
		JMenu jmfile = new JMenu("File");
		JMenu jmedit = new JMenu("Edit");
		JMenu jmhelp = new JMenu("Help");
		
		con.setLayout(new BorderLayout());
		JScrollPane sbrText = new JScrollPane(jta);
		sbrText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sbrText.setVisible(true);
		
		jta.setFont(fnt);
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);
		
		con.add(sbrText);
		
//		For File Menu
		createMenuItem(jmfile, "New");
		createMenuItem(jmfile, "Open");
		createMenuItem(jmfile, "Save");
		jmfile.addSeparator();
		createMenuItem(jmfile, "Exit");
		setVisible(true);
		
//		For Edit Menu
		createMenuItem(jmedit, "Cut");
		createMenuItem(jmedit, "Copy");
		createMenuItem(jmedit, "Paste");
		
//		For Help Menu
		createMenuItem(jmhelp, "About Notepad");
		
//		Add Options Like File, Edit, Help In MenuBar.
		jmb.add(jmfile);
		jmb.add(jmedit);
		jmb.add(jmhelp);
		
//		Setting of MenuBar
		setJMenuBar(jmb);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/USER/workspace/Java_Miniproject_13/image"));
		
//		Add Window Listener
		addWindowListener(this);
		
//		Setting the size
		setSize(500, 500);
		setLocation(550, 200);
		setTitle("Untitled.txt - Notepad");
		setVisible(true);
		
	}

	public void createMenuItem(JMenu jm, String string) {
		
		JMenuItem jmi = new JMenuItem(string);
		jmi.addActionListener(this);
		jm.add(jmi);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) { }
	
	@Override
	public void windowActivated(WindowEvent e) { }

	@Override
	public void windowDeiconified(WindowEvent e) { }
	
	@Override
	public void windowIconified(WindowEvent e) { }
	
	@Override
	public void windowClosed(WindowEvent e) { }

	@Override
	public void windowClosing(WindowEvent e) { Exiting(); }

	@Override
	public void windowOpened(WindowEvent e) { }

	@Override
	public void actionPerformed(ActionEvent e) {

		JFileChooser jfc = new JFileChooser();
		
		if(e.getActionCommand().equals("New")){
			this.setTitle("Untitled.txt - Notepad");
			jta.setText("");
			fnameContainer = null;
		}else if(e.getActionCommand().equals("Open")){
			int ret = jfc.showOpenDialog(this);
			
			if(ret == JFileChooser.APPROVE_OPTION){
				
				try{
					File fyl = jfc.getSelectedFile();
					OpenFile(fyl.getAbsolutePath());
					this.setTitle(fyl.getName() + " - Notepad");
					fnameContainer = fyl;
				}catch(IOException ie){
					ie.printStackTrace();
				}
				
			}
		}else if(e.getActionCommand().equals("Save")){
			if(fnameContainer != null){
				jfc.setCurrentDirectory(fnameContainer);
			}else{
				jfc.setSelectedFile(new File("Untitle.txt - Notepad"));
			}
			jfc.setSelectedFile(fnameContainer);
		}
		
		int ret = jfc.showSaveDialog(this);
		
		if(ret == JFileChooser.APPROVE_OPTION){
			
			try{
				File fyl = jfc.getSelectedFile();
				SaveFile(fyl.getAbsolutePath());
				this.setTitle(fyl.getName() + " - Notepad");
				fnameContainer = fyl;
			}catch(IOException ie){
				ie.printStackTrace();
			}
			
		}else if(e.getActionCommand().equals("Exit")){
			Exiting();
		}else if(e.getActionCommand().equals("Copy")){
			jta.copy();
		}else if(e.getActionCommand().equals("Paste")){
			jta.paste();
		}else if(e.getActionCommand().equals("Cut")){
			jta.cut();
		}else if(e.getActionCommand().equals("About Help")){
			JOptionPane.showMessageDialog(this, "Created By Omkar Ingawale", "Notepad", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

	public void Exiting() {
		System.exit(0);
	}

	public void SaveFile(String fname) throws IOException {
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		DataOutputStream ot = new DataOutputStream(new FileOutputStream(fname));
		ot.writeBytes(jta.getText());
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}

	public void OpenFile(String fname) throws IOException {
		BufferedReader d = new BufferedReader(new InputStreamReader(new FileInputStream(fname)));
		String l;
		jta.setText("");
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		while((l = d.readLine()) != null){
			jta.setText(jta.getText() + 1 + "\r\n");
		}
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		d.close();
	}

}