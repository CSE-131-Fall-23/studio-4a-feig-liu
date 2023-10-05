package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		int n = 0;
		double[] parameter = new double[7];
		while (in.hasNext())
		{
			 
			parameter[n] = in.nextDouble();
			n++;
		}
		
		

		StdDraw.setPenColor(red, green, blue);
		if (shape == "ellipse")
		{
			if (filled)
			{
				StdDraw.filledEllipse(parameter[1],parameter[2],parameter[3],parameter[4]);
			}
			else
			{
				StdDraw.ellipse(parameter[1],parameter[2],parameter[3],parameter[4]);
			}
		}
		if (shape == "rectangle")
		{
			if (filled)
			{
				StdDraw.filledRectangle(parameter[1],parameter[2],parameter[3],parameter[4]);
			}
			else
			{
				StdDraw.rectangle(parameter[1],parameter[2],parameter[3],parameter[4]);
			}
		}
		if (shape == "rectangle")
		{
			if (filled)
			{
				StdDraw.filledRectangle(parameter[1],parameter[2],parameter[3],parameter[4]);
			}
			else
			{
				StdDraw.rectangle(parameter[1],parameter[2],parameter[3],parameter[4]);
			}
		}
		if (shape == "triangle")
		{
			if (filled)
			{
				StdDraw.filledPolygon(new double[] {parameter[1],parameter[2], parameter[3]}, new double[] {parameter[1],parameter[2], parameter[3]});
			}
			else {
				StdDraw.filledPolygon(new double[] {parameter[1],parameter[2], parameter[3]}, new double[] {parameter[1],parameter[2], parameter[3]});
			}
		}
		
		
	}
}
