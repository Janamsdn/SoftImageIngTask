/**
 * 
 */
package mainExercise;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;


import javax.swing.JApplet;
import javax.swing.JFrame;


/**
 * @author AllstateUser(Jana)
 *
 */
public class Exercise3_CubicBezierCurve extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Task 3 
	//time (t) given the 4 points that define the Bezier Curve
	private static Point PlotPoint;
	private static Point p0=new Point (0,0);
	private static Point p1=new Point (10,10);
	private static Point p2=new Point (0,10);
	private static Point p3=new Point (10,0);
	
	public void paint(Graphics g) {
		//curve between t = 0.0 and t=1.0 with an increment in t of 0.05.
		for (float t = 0;  t <= 1.0f; t += 0.05f)
		{
			////Cubic Bezier Function
			PlotPoint = GetPoint(t, p0, p1, p2, p3);
			g.setColor(Color.RED);
			//g.drawLine(p1.x-1,p1.y-1,p2.x-1,p2.y-1);
			g.drawLine(PlotPoint.x-1, PlotPoint.y-1,PlotPoint.x*10, PlotPoint.y*10); //Cubic Bezier curve to display the x, y 
			
		}

	}
	//Cubic Bezier Function
	//Multiplying (adding) points in this case, means that you multiply (add) each component. That is, 3 P = [3 * P.x, 3 * p.y] and P1 + P2 = [P1.x + P2.x, P1.y + P2.y]. 
	//Finally, to square something, you multiply it with itself: xsquere = x * x. The last part, "t - [1,0]", means that t is supposed to be between 0 and 1. 
	public static Point GetPoint(float t, Point p0, Point p1, Point p2, Point p3)
	{
		
				
		double cx = 3 * (p1.x - p0.x);
		double cy = 3 * (p1.y - p0.y);

		double bx = 3 * (p2.x - p1.x) - cx;
		double by = 3 * (p2.y - p1.y) - cy;

		double ax = p3.x - p0.x - cx - bx;
		double ay = p3.y - p0.y - cy - by;

		float Cube = t * t * t;
		float Square = t * t;

		double resX = (ax * Cube) + (bx * Square) + (cx * t) + p0.x;
		double resY = (ay * Cube) + (by * Square) + (cy * t) + p0.y;

		return new Point( (int)Math.round(resX),(int)Math.round(resY));
	}
}
// class to load applet
class StartApplet {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Draw the line");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		JApplet applet = new JApplet();
		frame.getContentPane().add(applet);
		applet.init();
		frame.pack();
		frame.setSize(new Dimension(300, 300));
		frame.setVisible(true);
	}


}
