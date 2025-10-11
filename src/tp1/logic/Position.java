package tp1.logic;

/**
 * 
 * TODO: Immutable class to encapsulate and manipulate positions in the game board
 * 
 */
public class Position {

	private int col;
	private int row;

	public Position(int row, int col) {
		this.col = col;
		this.row = row;
	}
	
	public boolean equals(Position posi) {
		if(this.row == posi.row) {
			return (this.col == posi.col);
		}
		else {
			return false;
		}
	}
	//Implementar metodo equals + hashcode para no usar el equals heredado de Object
	//TODO fill your code
}
