package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		// blue
		StdDraw.setPenColor(19, 115, 166);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);

		// red
		StdDraw.setPenColor(183, 42, 68);
		StdDraw.filledRectangle(0.3, 0.75, 0.3, 0.25);

		double[] x = { 0.599, 1.0, 0.599 };
		double[] y = { 1.0, 1.0, 0.5 };
		StdDraw.filledPolygon(x, y);
		
		// yellow
		StdDraw.setPenColor(255, 196, 50);
		double[] x2 = { 1.0, 1.0, 0.6, 0.2 };
		double[] y2 = { 0.0, 0.5, 0.5, 0.0 };
		StdDraw.filledPolygon(x2, y2);



	}
}