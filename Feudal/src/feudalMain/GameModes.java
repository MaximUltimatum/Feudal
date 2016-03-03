package feudalMain;

import java.awt.Point;
import piecesProperties.StandardPiece;
import playerInput.HumanInput;

public class GameModes {
	private int playerCount;
	private String playerColor;
	private Object pikeman;

	public void setUp(){
		playerCount = 2;
		playerColor = "Blue";
		pikeman = null;
		
		initializePieces();
	}
	
	void initializePieces(){
		for(int i = 0; i < playerCount; i++){
			Point playerpikeManPlace1 = HumanInput.getXandY();
			StandardPiece pikeMan1 = new StandardPiece(playerColor, pikeman, playerpikeManPlace1);
			Point playerpikeManPlace2 = HumanInput.getXandY();
			StandardPiece pikeMan2 = new StandardPiece(playerColor, pikeman, playerpikeManPlace2);
			Point playerpikeManPlace3 = HumanInput.getXandY();
			StandardPiece pikeMan3 = new StandardPiece(playerColor, pikeman, playerpikeManPlace3);
			Point playerpikeManPlace4 = HumanInput.getXandY();
			StandardPiece pikeMan4 = new StandardPiece(playerColor, pikeman, playerpikeManPlace4);
			
			Point playerKnightPlace1 = HumanInput.getXandY();
			StandardPiece knight1 = new StandardPiece(playerColor, pikeman, playerKnightPlace1);
			Point playerKnightPlace2 = HumanInput.getXandY();
			StandardPiece knight2 = new StandardPiece(playerColor, pikeman, playerKnightPlace2);
		}
	}
	
	public void welcome(){
		System.out.println("Welcome to Feudal");
	}
	
}
