package BoardGame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		super();
		this.board = board;
		position = null; //<- desnecessário, por padrão java ja poe como nulo
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
