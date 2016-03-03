package piecesProperties;

import java.awt.Color;
import java.awt.Point;

public class StandardPiece {
	public enum PieceType {
		PIKEMAN,
		SERGEANT,
		KNIGHT,
		DUKE,
		PRINCE,
		SQUIRE,
		KING
	}
	
	private Color pieceColor;
	private PieceType pieceType;
	private Point pieceLocation;
	private boolean hasMoved;
	
	public StandardPiece(Color colorA, PieceType typeA, Point pointType){
		pieceColor = colorA;
		pieceType = typeA;
		pieceLocation = pointType;
	}
	
	
}
