package BoardGame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		super();
		this.board = board;
		position = null; //<- desnecess�rio, por padr�o java ja poe como nulo
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
