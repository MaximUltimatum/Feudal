/**
 * 
 */
package piecesProperties;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * @author WMcD
 *
 */
public class Board {
	private String FEUDAL_TITLE = "Feudal-lite";
	private int FRAME_X = 10;
	private int FRAME_Y = 10;
	private int FRAME_WIDTH = 200;
	private int FRAME_HEIGHT = 150;
	
	private int LINE_THICKNESS = 2;				// thickness of grid lines
	private boolean ROUNDED_CORNERS = true;		// rounded corners on cell grid lines
	
	private JFrame displayFrame;
	
	private Dimension boardDimension;
	private JPanel[][] boardGrid;
	
	/**
	 * 
	 */
	public Board(Dimension aBoardDimension) {
		displayFrame = null;
		
		boardDimension = aBoardDimension;
		boardGrid = null;		
	}
	
	/**
	 * Creates the frame if it does not already exist, and displays the given pieces.
	 * 
	 * @param pieceList
	 */
	public void redisplayBoard(List<StandardPiece> aPieceList) {
		if (displayFrame == null) {	// ensure we have a frame
			initializeFrame();
		}
		
		// clear the board and then add the new list of pieces
		clearBoard();
		for (StandardPiece onePiece : aPieceList) {
			displayPiece(onePiece);
		}
		
		// prepare the frame for display
		displayFrame.pack();
		
		// ensure the frame is visible
		displayFrame.setVisible(true);
	}

	/**
	 * construct the frame with its grid of squares and the references to later put pieces in chosen cells
	 */
	private void initializeFrame() {
		displayFrame = new JFrame(FEUDAL_TITLE);
		displayFrame.setBounds(FRAME_X, FRAME_Y, FRAME_WIDTH, FRAME_HEIGHT);	// location and size of frame
		displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// exit program when this frame closes
		
		// learn about layout managers at this link https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
		displayFrame.getContentPane().setLayout(new BorderLayout());	
		
		// create a grid, and store a reference to each cell for later use in setting / removing piece displays
		final JPanel gridWrapper = new JPanel(new GridLayout(boardDimension.height, boardDimension.width));	// layout sets evenly sized grid squares			
		boardGrid = new JPanel[boardDimension.height][boardDimension.width];	// array to store reference to each cell for later use
		
		for(int row = 0; row < boardDimension.height; row++) {
		   for(int col = 0; col < boardDimension.width; col++) {
			   boardGrid[row][col] = new JPanel();		// create the cell storage objects
			   boardGrid[row][col].setBorder(new LineBorder(Color.BLACK, LINE_THICKNESS, ROUNDED_CORNERS));
		       gridWrapper.add(boardGrid[row][col]);	// gridWrapper's GridLayout assumes objects are added IN ORDER, first to each column of the first row, and then resuming across the next row
		   }
		}
		displayFrame.add(gridWrapper, BorderLayout.CENTER);	// fill any space in the Frame not used later by Java Swing components in NORTH, SOUTH, EAST, and WEST					
	}

	/**
	 * remove all objects displayed in the board
	 */
	private void clearBoard() {
		for(int row = 0; row < boardDimension.height; row++) {
		   for(int col = 0; col < boardDimension.width; col++) {
			   boardGrid[row][col].removeAll();
		   }
		}
	}
	
	/**
	 * Add a piece onto the board
	 * @param aPiece
	 */
	private void displayPiece(StandardPiece aPiece) {
		final Point pieceLocation = aPiece.getLocation();
		final JPanel cellPanel = boardGrid[pieceLocation.y][pieceLocation.x];
		
		// for now, display a piece as a text label with the name of the piece in the chosen color
		final JLabel pieceLabel = new JLabel(aPiece.getType().toString());
		pieceLabel.setForeground(aPiece.getColor());
		cellPanel.add(pieceLabel);
	}
	
	/**
	 * Set the board visible or hidden.
	 * 
	 * @param isVisible
	 */
	public void setBoardVisible(boolean isVisible) {
		displayFrame.setVisible(isVisible);
	}
}
