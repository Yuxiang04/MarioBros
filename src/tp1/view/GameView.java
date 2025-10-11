package tp1.view;

import tp1.logic.Game;

public abstract class GameView implements ViewInterface{

	protected Game game;
	
	public GameView(Game game) {
		this.game = game;
	}
	
	public void showWelcome() {
		
	}
	public void showGame() {
		
	}
	public void showEndMessage() {
		
	}
	public void showError(String message) {
		
	}
	public void showMessage(String message) {
		
	}
	
	public String[] getPrompt() {
		return null;
	}
	
}
