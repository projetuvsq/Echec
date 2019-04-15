package lib.src.echec;


public class Joueur
{
    // mode == 1 ? : Player || mode == 2 ? : IA
    private int mode; 
    private int ID;
    /**
     * Constructeur d'objets de classe Joueur
     */
    public Joueur(int mode, int ID)
    {
        // Joueur ou IA ?
        this.mode = mode;
        this.ID = ID;
    }
     
    
    /**
     * Retourne le mode du joueur    
     * @return	mode du joueur
     */
    public int getMode() 
    {
    	return this.mode;
    }    
    
    public int getID() 
    {
    	return this.ID;
    }
}
