package lib.src.echec;


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
    
    /**
     * Retourne le mode du joueur    
     * @return	mode du joueur
     */
    public int getMode() 
    {
    	return this.mode;
    }    
}
