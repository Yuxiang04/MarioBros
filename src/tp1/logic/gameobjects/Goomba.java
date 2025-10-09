package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Position;
import tp1.view.Messages;

public class Goomba {
	
	private Position pos;
	
	public Goomba(Game game, Position position) {
		this.pos = position;
	}

	public String getIcon() {
		return Messages.GOOMBA;
		
	}
	
	public boolean isInPosition(Position posi) {
		return this.pos.equals(posi);
	}

}
