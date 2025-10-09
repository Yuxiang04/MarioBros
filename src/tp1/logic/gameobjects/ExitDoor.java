package tp1.logic.gameobjects;

import tp1.logic.Position;
import tp1.view.Messages;

public class ExitDoor {

	private Position pos;
	
	public ExitDoor(Position position) {
		this.pos = position;
	}

	public ExitDoor() {
		// TODO Auto-generated constructor stub
	}

	public String getIcon() {
		return Messages.EXIT_DOOR;
		
	}
	
	public boolean isInPosition(Position posi) {
		return this.pos.equals(posi);
	}
	
}
