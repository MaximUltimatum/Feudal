package feudalMain;

import piecesProperties.StandardPiece;

public class GameModes {
	public static void startGame(){
		int playerCount = 2;
		String playerColor = "Blue";
		Object pikeman = null;
		int playerPlaceX = 0;
		int playerPlaceY = 0;
		for(int i = 0; i < playerCount; i++){
			
			StandardPiece pikeMan1 = new StandardPiece(playerColor, pikeman, playerPlaceX, playerPlaceY);
		}
	}
}
