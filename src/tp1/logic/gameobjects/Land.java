package tp1.logic.gameobjects;

import tp1.logic.Position;
import tp1.view.Messages;

public class Land {

	private Position pos;
	
	public Land(Position pos) {
		this.pos = pos;
	}
	
	public Land(int col, int row) {
        this.pos = new Position(col, row);
    }

	public String getIcon() {
		return Messages.LAND;
		
	}
	
	public boolean isInPosition(Position posi) {
		return this.pos.equals(posi);
	}
	//metodo isInPosition
}
