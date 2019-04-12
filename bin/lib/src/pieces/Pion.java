package lib.src.pieces;
import lib.src.echec.Case;
import lib.src.echec.Piece;
import java.awt.Color;

public class Pion extends Piece {
	boolean initial;
	/**
	 * Constructeur de la classe Pion
	 */
	public Pion (Color couleur)
	{
		super(couleur, "pion");
		this.initial = true;
		
	}
	 
	public boolean getStatus()
	{
		return this.initial;
	}
	 
	@Override
	public boolean estValide(Case c_initial, Case c_final)
	{
		if (this.couleur == Color.white) {
			// deplacement normal
			if( (c_final.getX() == c_initial.getX() && ( c_final.getY() == c_initial.getY()+1 
					|| (c_final.getY() == c_initial.getY()+2 && this.initial) ) ) )
			{
				return true;
			} // mange un pion
			else if(c_final .retourneContenu() !=null && (c_final.getX() == c_initial.getX()+1 || c_final.getX() == c_initial.getX()-1) 
					&& c_final.getY() == c_initial.getY()+1 && (c_final.retourneContenu().getColor() != this.couleur && !(c_final.estVide() ) ) )
			{
				return true;
			}
			else return false;
		}
		else
		{
			// deplacement normal
			if( (c_final.getX() == c_initial.getX() && ( c_final.getY() == c_initial.getY()-1 
				|| (c_final.getY() == c_initial.getY()-2 && this.initial) ) ) )
			{
				return true;
			} // mange un pion
			else if( (c_final.getX() == c_initial.getX()+1 || c_final.getX() == c_initial.getX()-1) 
					&& c_final.getY() == c_initial.getY()-1 && (c_final.retourneContenu().getColor() != this.couleur && !(c_final.estVide() ) ) )
			{
				return true;
			}
			else return false;
		}
	}
}
