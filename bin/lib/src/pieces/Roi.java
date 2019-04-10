package lib.src.pieces;
import lib.src.echec.Case;
import lib.src.echec.Piece;
import java.awt.Color;

public class Roi extends Piece {

	public Roi(Color couleur) {
		super(couleur, "roi");
	}
 
	@Override
	public boolean estValide(Case c_initial, Case c_final) {
		
		return ( (c_initial.getX() == c_final.getX() && (c_final.getY() == c_initial.getY()+1 || c_final.getY() == c_initial.getY()-1)) 
				|| (c_initial.getY() == c_final.getY() && (c_final.getX() == c_initial.getX()+1 || c_final.getX() == c_initial.getX()-1)) 
				|| (c_initial.getX()+1 == c_final.getX() && (c_initial.getY()+1 == c_final.getY() || c_initial.getY()-1 == c_final.getY()))
				|| (c_initial.getX()-1 == c_final.getX() && (c_initial.getY()+1 == c_final.getY() || c_initial.getY()-1 == c_final.getY())) );
	}

}
