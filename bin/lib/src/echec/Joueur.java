package lib.src.echec;
/**
 * Cette classe concerne les joueurs et leurs méthodes
 *
 * @author Serhan Wissam
 * @version Mars 2019
 */
public class Joueur
{
    // mode == 0 ? : IA || mode == 1 ? : Player
    private int mode;
   
    /**
     * Constructeur d'objets de classe Joueur
     */
    public Joueur(int mode)
    {
        // Joueur ou IA ?
        this.mode = mode;
    }
    
    public int getMode() 
    {
    	if(this.mode == 1) System.out.println("Player");
    	else System.out.println("IA");
    	return this.mode;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    
}
