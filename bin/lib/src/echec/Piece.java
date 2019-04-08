package lib.src.echec;
import java.awt.Color;
/**
 * Cette classe concerne les pieces du jeu d'échec et leurs méthodes.
 *
 * @author Serhan Wissam
 * @version 18/03/2019
 */
public abstract class Piece
{
    // Couleur des pièces (noire ou blanche)
    protected Color couleur;
    protected String name;
    
    /**
     * Constructeur d'objets de classe Pieces
     * Attribue une couleur (noir/blanc) à la pièce
     */
    public Piece(Color couleur, String name)
    {
        // initialisation des variables d'instance
        this.couleur = couleur;
        this.name = name;
    }
    
    public String getName()
    {
    	return this.name;
    }
    /**
     * @return			La couleur de la pièce
     */
    public Color getColor() 
    {
    	return this.couleur;
    }
    /**
     * Permet de tester si le déplacement est valide en fonction de la pièce à bouger (sans prendre en compte la présence de pièce alliée)
     * 
	 * @param			c_initial, c_final respectivement la case où se situe la pièce et la case où elle souhaite aller
	 * @return			Vrai si le deplacement est juste et que la case ne contient pas une piece de la même équipe
	 */
    public boolean deplacement (Case c_initial, Case c_final) 
	{
    	boolean valide = this.estValide(c_initial, c_final);
    	
		return ( (c_final.estVide() && valide)
				|| ((c_final.retourneContenu().getColor()!= this.couleur) && valide) );
	}
     
    public abstract boolean estValide(Case c_initial, Case c_final);
  
}
