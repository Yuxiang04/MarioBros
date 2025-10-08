package tp1.logic.gameobjects;

import tp1.logic.Action;
import tp1.logic.Game;
import tp1.logic.Position;
import tp1.view.Messages;

public class Mario {
	
	private boolean big = false;
	private Position pos;
	

	//TODO fill your code
	
	public Mario(Game game, Position position) {
		this.pos = position;
	}

	public Mario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *  Implements the automatic update	
	 */
	public void update() {
		//TODO fill your code
	}
	
	public String getIcon() {
		
		return Messages.MARIO_RIGHT;
	}
	public String toString() {
		return null;
		
	}
	
	public Position getPos() {
		return this.pos;
	}
	
	
	/*Intento movimiento
	public void move(Action action) {
		this.pos.setCol(action.getX());
		this.pos.setRow(action.getY());
	}*/
}
