package studio4;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

public class Flag {
	private static void flag() {
		
			   StdDraw.clear();
			   StdDraw.setPenColor(255, 0, 0);
			   StdDraw.filledRectangle(3, 3, 3, 3);
			   StdDraw.filledRectangle(3, 13, 3, 3);
			   StdDraw.filledRectangle(16, 3, 6, 3);
			   StdDraw.filledRectangle(16, 13, 6, 3);
			   StdDraw.setPenColor(0, 0, 127);
			   StdDraw.filledRectangle(11, 8, 11, 1);
			   StdDraw.filledRectangle(8, 8, 1, 8);
			}

			public static void norway() {
			   StdDraw.setXscale(0, 22);
			   StdDraw.setYscale(0, 16);
			   
			}
	
public static void main(String[] args) {
	SwingUtilities.invokeLater(() -> {
		int canvasHeight = 512;
		int canvasWidth = 22 * canvasHeight / 16;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		
	
			norway();
			
				
									
									
									
								
							
					
					
				
			
			
		
	
}
}

