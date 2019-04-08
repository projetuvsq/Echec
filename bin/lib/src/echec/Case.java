package lib.src.echec;
/**
 * Cette classe représente les cases contenu et leurs méthodes.
 *
 * @author Serhan Wissam
 * @version 18/03/2019
 */
public class Case
{
    // contenu de la case
    private Piece contenu;
    // abscisse
    private int x;
    // ordonné
    private int y;
   
    /**
     * Constructeur d'objets de classe Case
     * Attribue les coordonnées de la case et son contenu
     */
    public Case(int x, int y)
    {
        this.contenu = null;
        this.x = x;
        this.y = y;
    } 
    
    public Case(Piece contenu, int x, int y)
    {
        // initialisation des variables d'instance
        this.contenu = contenu;
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
    	return this.x;
    }
    
    public int getY()
    {
    	return this.y;
    }
    /**
     * Change le contenu d'une case
     * 
     * @param 		contenu de type Piece
     */
    public void changeContenu(Piece contenu)
    {
    	this.contenu = contenu;
    }
    
    /**
     * Retourne le contenu de la case de type piece ou null
     * @return 		contenu de la case
     */
    public Piece retourneContenu()
    {
    	if(this.contenu != null) System.out.println("La case contient la pièce" + this.contenu. getName());
    	return this.contenu;
    }
    /**
     * Test si la case est vide
     * 
     * @return     true si la case est vide faux sinon
     */
    public boolean estVide()
    {
        return (this.contenu == null);
    }
}
