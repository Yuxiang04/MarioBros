package tp1.logic;

import java.util.ArrayList;
import java.util.List;

import tp1.logic.gameobjects.ExitDoor;
import tp1.logic.gameobjects.Goomba;
import tp1.logic.gameobjects.Land;
import tp1.logic.gameobjects.Mario;

public class GameObjectContainer {
	//TODO fill your code

	private List<Land> landList;
	private List<Goomba> goombaList;
	private ExitDoor exit;
	private Mario mario;
	
	public GameObjectContainer() {
		
		landList = new ArrayList<>();
		goombaList = new ArrayList<>();
		exit = new ExitDoor();
		mario = new Mario();
	}
	
	public void add(Land land) {
		landList.add(land);
	}
	
	public void add(Goomba goomba) {
		goombaList.add(goomba);
	}
	
	public void add(ExitDoor exit) {
		this.exit = exit;
	    
	}
	
	public void add(Mario mario) {
		this.mario = mario;
	}
	
	//bucle to string
	public String positionToString(Position posi) {
		
		// Mario
	    if (mario != null && mario.isInPosition(posi)) {
	            return mario.getIcon();
	    }

	    // ExitDoor
	    if (exit != null && exit.isInPosition(posi)) {
	            return exit.getIcon();
	    }

	    // Goombas
	    for (Goomba g : goombaList) {
	    	if(g.isInPosition(posi)) {
	            return g.getIcon();
	        }
	    }
	    // Land
	    for (Land l : landList) {
	    	if(l.isInPosition(posi)) {
	            return l.getIcon();
	        }
	    }

	    // Si no hay ningún objeto en esta celda
	    return " ";
	}
}
