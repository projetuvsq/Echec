package lib.src.pieces;

import java.awt.Color;
import lib.src.echec.Case;
import lib.src.echec.Piece;

public class Fou extends Piece {

	public Fou(Color couleur) {
		super (couleur, "fou");
	}
	
	@Override
	public boolean estValide(Case c_initial, Case c_final) {
		if (Math.abs (c_final.getX() - c_initial.getX()) == Math.abs (c_final.getY() - c_initial.getY()))
		{
			return true;
		}
		else return false;
	} 
}
