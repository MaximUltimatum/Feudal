package feudalMain;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;

import piecesProperties.StandardPiece;
import playerInput.HumanInput;

public class GameModes {
	HumanInput newInput = new HumanInput();
	private int playerCount;
	private Color playerColor;
	private List<StandardPiece> playerPieces;

	/**
	 * default initialization of class attributes
	 */
	GameModes() {
		playerCount = 1;
		playerColor = Color.BLUE;
		playerPieces = new ArrayList<StandardPiece>();		
	}
	
	/**
	 * set up the game
	 */
	public void setUp(){		
		initializePieces();
	}
	
	/**
	 * create and store the pieces (with user input) 
	 */
	void initializePieces(){
		for(int i = 0; i < playerCount; i++){
			System.out.println("Placing Pikeman");
			final Point playerpikeManPlace1 = newInput.getXandY();
			final StandardPiece pikeman1 = new StandardPiece(playerColor, StandardPiece.PieceType.PIKEMAN, playerpikeManPlace1);
			playerPieces.add(pikeman1);
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
			final Point playerKnightPlace1 = newInput.getXandY();
			final StandardPiece knight1 = new StandardPiece(playerColor, StandardPiece.PieceType.KNIGHT, playerKnightPlace1);
			playerPieces.add(knight1);
			//Point playerKnightPlace2 = newInput.getXandY();
			//StandardPiece knight2 = new StandardPiece(playerColor, pikeman, playerKnightPlace2);
			// ACTIVATE THIS WHEN FINISHED WITH TESTING
		}
	}
	
	public void welcome(){
		System.out.println("Welcome to Feudal");
		System.out.println("Please Place your pieces");
	}
	
	/**
	 * 
	 * @return a list (that can not be modified) of pieces (which might not be immutable)
	 */
	public List<StandardPiece> getPieceList() {
		return Collections.unmodifiableList(playerPieces);
	}

}
