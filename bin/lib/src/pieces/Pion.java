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
			if(c_final.getX() == c_initial.getX())
			{
				if(c_final.getY() == c_initial.getY()+1) {
					return true;
				}
				else if (c_final.getY() == c_initial.getY()+2 && this.initial) {
					this.initial = false;
					return true;
				}
				else return false;
			} 
			// mange un pion
			else if(!(c_final.estVide())
					&& (c_final.getX() == c_initial.getX()+1 || c_final.getX() == c_initial.getX()-1) 
					&& c_final.getY() == c_initial.getY()+1 
					&& (c_final.retourneContenu().getColor() != this.couleur) )
			{
				return true;
			}
			else return false;
		}
		else
		{
			// deplacement normal
			if(c_final.getX() == c_initial.getX())
			{
				if(c_final.getY() == c_initial.getY()-1) {
					return true;
				}
				else if (c_final.getY() == c_initial.getY()-2 && this.initial) {
					this.initial = false;
					return true;
				}
				else return false;
			} // mange un pion
			else if(!(c_final.estVide())
					&& (c_final.getX() == c_initial.getX()+1 || c_final.getX() == c_initial.getX()-1) 
					&& c_final.getY() == c_initial.getY()-1 
					&& (c_final.retourneContenu().getColor() != this.couleur) )
			{
				return true;
			}
			else return false;
		}
	}
}
