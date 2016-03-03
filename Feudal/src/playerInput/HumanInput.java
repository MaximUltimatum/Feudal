package playerInput;

import java.awt.Point;
import java.util.Scanner;

public class HumanInput {
	static Scanner replaceLaterScanner = new Scanner(System.in);
	private int x;
	private int y;
	
	public Point getXandY(){
		System.out.println("What x coordinate?");
		x = replaceLaterScanner.nextInt();
		System.out.println("What y coordinate?");
		y = replaceLaterScanner.nextInt();
		System.out.println(printCoords() + "Thank you!");
		Point xAndy = new Point(x,y);
		return xAndy;
	}
	
	public String printCoords(){
		String coords = "(" + x + "," + y + ")";
		return coords;
	}
}
