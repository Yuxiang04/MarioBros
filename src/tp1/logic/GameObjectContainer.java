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

	public Mario getMario() {
		// TODO Auto-generated method stub
		return this.mario;
	}

	public ExitDoor getExit() {
		// TODO Auto-generated method stub
		return this.exit;
	}

	public List<Goomba> getGoombas() {
		// TODO Auto-generated method stub
		return this.goombaList;
	}

	public List<Land> getLands() {
		// TODO Auto-generated method stub
		return this.landList;
	}
}
