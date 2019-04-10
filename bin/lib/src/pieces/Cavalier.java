package lib.src.pieces;
import lib.src.echec.Case;
import lib.src.echec.Piece;
import java.awt.Color;

public class Cavalier extends Piece {

	public Cavalier(Color couleur) {
		super(couleur, "cavalier");
	}
 
	@Override
	public boolean estValide(Case c_initial, Case c_final) {
		
		if (Math.abs (c_final.getX() - c_initial.getX()) == 2 && Math.abs (c_final.getY() - c_initial.getY()) == 1) {
			return true;
		}
		else if (Math.abs (c_final.getY() - c_initial.getY()) == 2 && Math.abs (c_final.getX() - c_initial.getX()) == 1) {
			return true;
		}
		else return false; 
	}
	
}
