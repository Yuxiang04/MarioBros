package tp1.control;

import tp1.logic.Game;
import tp1.view.GameView;

/**
 *  Accepts user input and coordinates the game execution logic
 */
public class Controller {

	private Game game;
	private GameView view;

	public Controller(Game game, GameView view) {
		this.game = game;
		this.view = view;
	}


	/**
	 * Runs the game logic, coordinate Model(game) and View(view)
	 * 
	 */
	public void run() {
		view.showWelcome();
		
		
		view.showGame();
		while (!game.isFinished()) {
			// Pedir una línea al usuario
			// Ejecutar el comando del usuario (método)
			}
		
		view.showEndMessage();
	}

}
