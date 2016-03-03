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
	
	/**
	 * 
	 * @return copy of current location of this piece
	 */
	public Point getLocation() {return new Point(pieceLocation);}

	/**
	 * 
	 * @return piece color
	 */
	public Color getColor() {return pieceColor;}	// immutable
	
	/**
	 * 
	 * @return type of piece to display
	 */
	public PieceType getType() {return pieceType;}	// immutable
}
