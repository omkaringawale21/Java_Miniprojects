package Java_Miniproject_15_1;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class BrickBreaker {

	public static void main(String[] args) {
		
		JFrame obj = new JFrame();
		GamePlay gamePlay = new GamePlay();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker Game");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);

	}

}