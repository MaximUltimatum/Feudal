package piecesProperties;

import java.awt.Point;

public class StandardPiece {
	private String pieceColor;
	private Object pieceType;
	private Point pieceLocation;
	private boolean hasMoved;
	
	public StandardPiece(String colorA, Object typeA, Point pointType){
		pieceColor = colorA;
		pieceType = typeA;
		pieceLocation = pointType;
	}
	
	
}
