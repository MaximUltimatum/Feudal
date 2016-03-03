package playerInput;

import java.awt.Point;
import java.util.Scanner;

public class HumanInput {
	static Scanner replaceLaterScanner = new Scanner(System.in);
	
	public static Point getXandY(){
		System.out.println("What x coordinate?");
		int x = replaceLaterScanner.nextInt();
		int y = replaceLaterScanner.nextInt();
		Point xAndy = new Point(x,y);
		return xAndy;
	}
}
