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
		String rectangle = "rectangle";
		String ellipse = "ellipse";
		int red = in.nextInt();
		int green = in.nextIn();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = 0;
		double g = 0;
		
		if (shape.equals(triangle) == true) {
			e = in.nextDouble();
			g = in.nextDouble();
		}
		StdDraw.setPenColor(red, green, blue);
		if (shape.equals(rectangle) == true) {
			e = in.nextDouble();
			g = in.nextDouble();
		}
		
			
		}
		
		
	}

