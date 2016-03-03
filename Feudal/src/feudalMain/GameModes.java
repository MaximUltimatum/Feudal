package feudalMain;

import java.awt.Point;
import piecesProperties.StandardPiece;
import playerInput.HumanInput;

public class GameModes {
	HumanInput newInput = new HumanInput();
	private int playerCount;
	private String playerColor;
	private Object pikeman;

	public void setUp(){
		playerCount = 1;
		playerColor = "Blue";
		pikeman = null;
		
		initializePieces();
	}
	
	void initializePieces(){
		for(int i = 0; i < playerCount; i++){
			System.out.println("Placing Pikeman");
			Point playerpikeManPlace1 = newInput.getXandY();
			/*
			StandardPiece pikeMan1 = new StandardPiece(playerColor, pikeman, playerpikeManPlace1);
			Point playerpikeManPlace2 = newInput.getXandY();
			StandardPiece pikeMan2 = new StandardPiece(playerColor, pikeman, playerpikeManPlace2);
			Point playerpikeManPlace3 = newInput.getXandY();
			StandardPiece pikeMan3 = new StandardPiece(playerColor, pikeman, playerpikeManPlace3);
			Point playerpikeManPlace4 = newInput.getXandY();
			StandardPiece pikeMan4 = new StandardPiece(playerColor, pikeman, playerpikeManPlace4);
			*/
			// Activate this when finished with testing
			System.out.println("Placing Knights");
			Point playerKnightPlace1 = newInput.getXandY();
			StandardPiece knight1 = new StandardPiece(playerColor, pikeman, playerKnightPlace1);
			//Point playerKnightPlace2 = newInput.getXandY();
			//StandardPiece knight2 = new StandardPiece(playerColor, pikeman, playerKnightPlace2);
			// ACTIVATE THIS WHEN FINISHED WITH TESTING
		}
	}
	
	public void welcome(){
		System.out.println("Welcome to Feudal");
		System.out.println("Please Place your pieces");
	}
	
}
