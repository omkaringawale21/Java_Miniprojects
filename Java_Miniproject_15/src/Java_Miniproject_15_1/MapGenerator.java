package Java_Miniproject_15_1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {

	public int map[][];
	public int bricksWidth;
	public int bricksHeight;
	
	public MapGenerator(int row, int col){
		map = new int[row][col];
		for(int[] map1 : map){
			for(int j = 0; j < map[0].length; j++){
				map1[j] = 1;
			}
		}
		bricksWidth = 540 / col;
		bricksHeight = 150 / row;
	}
	
	public void draw(Graphics2D g){
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[0].length; i++){
				if(map[i][j] > 0){
					g.setColor(Color.RED);
					g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);
					
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.BLACK);
					g.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);
				}
			}
		}
	}
	
	public void setBrickValue(int value, int row, int col){
		map[row][col] = value;
	}
	
}
