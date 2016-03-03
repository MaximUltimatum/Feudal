package playerInput;

import java.awt.Point;
import java.util.Scanner;

public class HumanInput {
	static Scanner replaceLaterScanner = new Scanner(System.in);
	private int x;
	private int y;
	private int playerNumber;
	
	public Point getXandY(){
		System.out.println("What x coordinate?");
		x = replaceLaterScanner.nextInt();
		System.out.println("What y coordinate?");
		y = replaceLaterScanner.nextInt();
		Point xAndy = new Point(x,y);
		System.out.println(printCoords() + "Thank you!");
		return xAndy;
	}
	
	public String printCoords(){
		String coords = "(" + x + "," + y + ")";
		return coords;
	}
	
	public void playerSetup(){
		System.out.println("How many players?");
		playerNumber = replaceLaterScanner.nextInt();
	}
}
