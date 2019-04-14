package lib.src.echec;

public class Undo {
	String coup;
	Piece piece;
	
	public Undo(String coup) {
		this.coup = coup;
		this.piece = null;
	}
	
	public Undo(String coup, Piece piece) {
		this.coup = coup;
		this.piece = piece;
	}
}
