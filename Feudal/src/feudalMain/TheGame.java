package feudalMain;

import java.awt.Dimension;

import piecesProperties.Board;

public class TheGame {
	final GameModes newGame;
	final Board myBoard = null;	// created in Swing event dispatching thread via createAndShowGUI method
	
	TheGame() {
		newGame = new GameModes();		
	}

	public static void main(String[] args) {
		final TheGame myGame = new TheGame();
		
		myGame.newGame.welcome();
		myGame.newGame.setUp();
		
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                myGame.createAndShowGUI();
            }
        });
		
	}
	
	/**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
	private void createAndShowGUI() {
		final Board myBoard = new Board(new Dimension(30,30));
		myBoard.redisplayBoard(newGame.getPieceList());		
	}
}
