package tp1.control;

import java.util.Scanner;
import tp1.logic.Game;
import tp1.view.GameView;

/**
 *  Accepts user input and coordinates the game execution logic
 */
public class Controller {
	private Game game;
	private GameView view;
	private Scanner scanner;

	public Controller(Game game, GameView view) {
		this.game = game;
		this.view = view;
		this.scanner = new Scanner(System.in);
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
			System.out.print("Introduce un comando: ");
			String command = scanner.nextLine().trim().toLowerCase();
			// Ejecutar el comando del usuario (método)
			exeCommand(command);
			}
		
		view.showEndMessage();
	}
	
	private void exeCommand(String command) {
		switch (command) {
		case "a[r]", "action[r]", "a[right]", "action[right]":
			System.out.println("You chose: action right");

			break;

		case "a[l]", "action[l]", "a[left]", "action[left]":
			System.out.println("You chose: action left");

			break;

		case "a[u]", "action[u]", "a[up]", "action[up]":
			System.out.println("You chose: action up");
		
			break;

		case "a[d]", "action[d]", "a[down]", "action[down]":
			System.out.println("You chose: action down");
		
			break;

		case "a[s]", "action[s]", "a[stop]", "action[stop]":
			System.out.println("You chose: action stop");
		
			break;

		case "u", "update", "":
			System.out.println("You chose: update");
			//skip turn
			break;

		case "r", "reset": //no sé como hacer para introducir el comando y el numero a la vez
			System.out.println("You chose: reset");
			game = new Game(game.getLevel());  // Create a new Game with same level
			view.showGame();                   // Refresh the display
			break;

		case "h", "help":
			System.out.println("Available Commands:");
			System.out.println("   [a]ction [[R]IGHT | [L]EFT | [U]P | [D]OWN | [S]TOP]+: user performs actions");
			System.out.println("   [u]pdate | \"\": user does not perform any action");
			System.out.println("   [r]eset [numLevel]: reset the game to initial configuration if not numLevel else load the numLevel map");
			System.out.println("   [h]elp: print this help message");
			System.out.println("   [e]xit: exits the game");
			
			break;

		case "e", "exit":
			System.out.println("You chose: exit");
			game.setFinished(true);
			break;

		default:
			System.out.println("Error: Unknown command: comandoTecleadoPorElUsuario.");
			break;
		}
	}
}
