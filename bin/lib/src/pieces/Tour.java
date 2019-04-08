package lib.src.pieces;
import lib.src.echec.Case;
import lib.src.echec.Piece;
import java.awt.Color;

public class Tour extends Piece {
	
	public Tour(Color couleur) 
	{
		super(couleur, "tour");
	}
	
	@Override
	public boolean estValide (Case c_initial, Case c_final) 
	{
		//boolean valide;
	
		if(c_initial.getX() == c_final.getX() || c_initial.getY() == c_final.getY())
		{
			return true;
		}
			 
		return false;	
	}

}
