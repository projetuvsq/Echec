package lib.src.echec;

import java.awt.Color;
import lib.src.pieces.*;

/**
 * Cette classe représente le terrain (et ses méthodes), qui est unique et contient un tableau de type Case, 
 * c'est par lui que tout se fera.
 *
 */
public class Terrain
{
    private final int nb_case = 8;
    private Case terrain[][];    

    /**
     * Constructeur d'objets de classe Terrain
     * Créé le terrain de jeu
     */
    public Terrain()
    {
    	int i, j;
        // initialisation des variables d'instance
    	this.terrain = new Case[nb_case][nb_case];
    	// Initialisation des pions blancs (en bas)
    	for (i = 0; i<nb_case; i++) {
    		this .terrain [i][1] = new Case (new Pion(Color.white), i, 1);
    	}
    	
    	this .terrain [0][7] = new Case (new Tour(Color.black), 0, 7);
    	this .terrain [7][7] = new Case (new Tour(Color.black), 7, 7);
    	this .terrain [1][7] = new Case (new Cavalier(Color.black), 1, 7);
    	this .terrain [6][7] = new Case (new Cavalier(Color.black), 6, 7);
    	this .terrain [2][7] = new Case (new Fou(Color.black), 2, 7);
    	this .terrain [5][7] = new Case (new Fou(Color.black), 5, 7);
    	this .terrain [3][7] = new Case (new Roi(Color.black), 3, 7);
    	this .terrain [4][7] = new Case (new Reine(Color.black), 4, 7);
    			
    	// Initialisation des pions noirs
    	for (i = 0; i<nb_case; i++) {
    	 	this .terrain [i][6] = new Case (new Pion(Color.black), i, 6);
       	}
    	
    	this .terrain [0][0] = new Case (new Tour(Color.white), 0, 0);
    	this .terrain [7][0] = new Case (new Tour(Color.white), 7, 0);
    	this .terrain [1][0] = new Case (new Cavalier(Color.white), 1, 0);
    	this .terrain [6][0] = new Case (new Cavalier(Color.white), 6, 0);
    	this .terrain [2][0] = new Case (new Fou(Color.white), 2, 0);
    	this .terrain [5][0] = new Case (new Fou(Color.white), 5, 0);
    	this .terrain [3][0] = new Case (new Roi(Color.white), 3, 0);
    	this .terrain [4][0] = new Case (new Reine(Color.white), 4, 0);
    	
    	// Initialisation du reste
    	for(j=2; j<nb_case-2; j++)
    	{
    		for(i=0; i<nb_case; i++)
    		{
    			this.terrain [i][j] = new Case (i, j);
    		}
    	}
    	// ajouter initialisation des pièces
    	
    }
   
    /**
     * Affiche une interface graphique dans le shell 
     */
     public void afficher() {
    	
    	for (int j=nb_case; j>0; --j) 
    	{
    		System.out.printf("%d|",j);// afficher les chiffres a gauche 
    		for (int i=0; i<nb_case; ++i)
    		{
    			if( this .terrain [i][j-1] .retourneContenu() == null) 
    			{
    				System.out.printf ("\t |");
    			}
    			else {
    				if (terrain [i][j-1] .retourneContenu() .getColor() == Color.white) {
    					//System.out.printf ("\u001B[33m|%10s:1\u001B[0m", this .terrain[i][j-1] .retourneContenu() .getName());
    					if ( this .terrain[i][j-1] .retourneContenu() .getName() == "pion" ){ 
							System.out.printf ("\t\u2659|");
						}
						if (this .terrain[i][j-1] .retourneContenu() .getName() == "roi"){
							System.out.printf ("\t\u2654|");
						}
						if (this .terrain[i][j-1] .retourneContenu() .getName() == "reine"){
							System.out.printf ("\t\u2655|");
						}
						if (this .terrain[i][j-1] .retourneContenu() .getName() == "fou"){
							System.out.printf ("\t\u2657|");
						}
						if (this .terrain[i][j-1] .retourneContenu() .getName() == "tour"){
							System.out.printf ("\t\u2656|");
						}
						if (this .terrain[i][j-1] .retourneContenu() .getName() == "cavalier"){
							System.out.printf ("\t\u2658|");
						}
    				}
    				else {
    					//System.out.printf ("\u001B[34m|%10s:2\u001B[0m", this .terrain[i][j-1] .retourneContenu() .getName());
    					if ( this .terrain[i][j-1] .retourneContenu() .getName() == "pion" ){ 
							System.out.printf ("\t\u001B[31m\u2659\u001B[0m|");
						}
						if (this .terrain[i][j-1] .retourneContenu() .getName() == "roi"){
							System.out.printf ("\t\u001B[31m\u2654\u001B[0m|");
						}
						if (this .terrain[i][j-1] .retourneContenu() .getName() == "reine"){
							System.out.printf ("\t\u001B[31m\u2655\u001B[0m|");
						}
						if (this .terrain[i][j-1] .retourneContenu() .getName() == "fou"){
							System.out.printf ("\t\u001B[31m\u2657\u001B[0m|");
						}
						if (this .terrain[i][j-1] .retourneContenu() .getName() == "tour"){
							System.out.printf ("\t\u001B[31m\u2656\u001B[0m|");
						}
						if (this .terrain[i][j-1] .retourneContenu() .getName() == "cavalier"){
							System.out.printf ("\t\u001B[31m\u2658\u001B[0m|");
						}
    				}
    			}
    		}
    		System.out.println ("\n");
    	}
    	
    	System.out.print("  ");
    	for(int i=0;i<nb_case;i++ )
    	{
    		System.out.print("|\t"+(char)('a'+i)); // afficher les lettres en bas 
    	}
    	System.out.println("|\n");
    }
    /*public void afficher() {
    	//System.out.println("\n\n\n\n\n\n\n\n\n\n");
    	for (int j=nb_case; j>0; --j) 
    	{
    		System.out.print(j);// afficher les chiffres a gauche 
    		for (int i=0; i<nb_case; ++i)
    		{
    			if( this .terrain [i][j-1] .retourneContenu() == null) 
    			{
    				System.out.printf ("|%12s","");
    			}
    			else {
    				if (terrain [i][j-1] .retourneContenu() .getColor() == Color.white) {
    					System.out.printf ("|%10s:1", this .terrain[i][j-1] .retourneContenu() .getName());
    				}
    				else {
    					System.out.printf ("|%10s:2", this .terrain[i][j-1] .retourneContenu() .getName());
    				}
    			}
    		}
    		System.out.println ("|\n");
    	}
    	
    	System.out.print(" ");
    	for(int i=0;i<nb_case;i++ )
    	{
    		System.out.print("|     "+(char)('a'+i)+"      "); // afficher les lettres en bas 
    	}
    	System.out.println("|\n");
    }*/
    
    /**
     * Fonction permettant de tester l'existence d'un obstacle sur le déplacement d'une pièce
     * @param		c_initial	case de départ de la pièce
     * @param		c_final		case d'arrivée de la pièce
     * @return 					Vrai si il y a un obstacle sur le déplacement de la pièce Faux sinon
     */
   public boolean existeObstacle (Case c_initial, Case c_final)
    {
	    int i;
	    String pieceName = c_initial.retourneContenu().getName();
	    
	    if (!(c_final.estVide()) && c_final.retourneContenu().getColor() == c_initial.retourneContenu().getColor()) 
	    {
    		return true;
    	}
	    
	    if (pieceName == "cavalier") {
	    	return false;
	    }
	    
	    else if (pieceName == "pion") {
	    	if ((c_initial.getX()+1 == c_final.getX() || c_final.getX() == c_initial.getX()-1) && c_final.getY() == c_initial.getY()+1)
				return false;
			
			for (i=c_initial.getY()+1; i<c_final.getY()+1; ++i)
			{
				if(this.terrain [c_initial.getX()][i] .retourneContenu() != null)
					return true;
			}
			return false;
	    	
	    }
	    
	    else if (pieceName == "tour") {
	    	// Déplacement vertiacle case finale au-dessus de la case initiale
   			if(c_initial.getX() == c_final.getX() && c_final.getY() > c_initial.getY())
			{
				for(i=c_initial.getY()+1; i<c_final.getY(); ++i)
    			{
    				if(this.terrain [c_final.getX()] [i].retourneContenu() != null)
    				{
    					return true;
    				}
    			}
			}
   			// Déplacement verticale case finale en-dessous de la case initiale
   			else if(c_initial.getX() == c_final.getX() && c_final.getY() < c_initial.getY())
			{
				for(i=c_initial.getY()-1; i>c_final.getY(); --i)
    			{
    				if(this.terrain [c_final.getX()] [i].retourneContenu() != null)
    				{
    					return true;
    				}
    			}
			}
   			// Déplacement horizontale case finale à droite de la case initiale
			else if(c_initial.getY() == c_final.getY() && c_final.getX() > c_initial.getX())
			{
				for(i=c_initial.getX()+1; i<c_final.getX(); ++i)
    			{
    				if(this.terrain [i] [c_initial.getY()].retourneContenu() != null)
    				{
    					return true;
    				}
    			}	
			}
   			// Déplacement horizontale case finale à gauche de la case initiale
			else if(c_initial.getY() == c_final.getY() && c_final.getX() < c_initial.getX())
			{
				for(i=c_initial.getX()-1; i>c_final.getX(); --i)
    			{
    				if(this.terrain [i] [c_initial.getY()].retourneContenu() != null)
    				{
    					return true;
    				}
    			}	
			} 	
			return false;
	    }
	    
	    else if (pieceName == "roi") {
	    	return (c_final.retourneContenu() != null && c_final.retourneContenu().getColor() == c_initial.retourneContenu().getColor());
	    }
	    
	    else if (pieceName == "reine") {
	    	// DEPLACEMENT VERS LA GAUCHE
	    	if (c_initial.getX() > c_final.getX()) 
	    	{
	    		// DEPLACEMENT HORIZONTALE 
	    		if (c_initial.getY() == c_final.getY()) 
	    		{
	    			for (i=c_initial.getX() - 1; i>c_final.getX(); --i) 
	    			{
	    				if (this .terrain [i][c_final.getY()].retourneContenu() != null) 
	    				{
	    					return true;
	    				}
	    			}
	    		}
	    		// DEPLACEMENT DIAGONALE BASSE
	    		else if(c_initial.getY() > c_final.getY()) 
	    		{
	    			for (i=1; i<(c_initial.getX()-c_final.getX()); i++)
	    			{
	    				if (this .terrain[c_initial.getX()-i][c_initial.getY()-i].retourneContenu() != null) 
	    				{
	    					return true;
	    				}
	    			}
	    		}
	    		// DEPLACEMENT DIAGONALE HAUTE
	    		else if(c_initial.getY() < c_final.getY())
	    		{
	    			for (i=1; i<(c_initial.getX()-c_final.getX()); i++)
	    			{
	    				if (this .terrain[c_initial.getX()-i][c_initial.getY()+i].retourneContenu() != null) 
	    				{
	    					return true;
	    				}
	    			}
	    		}
	    		return false;
	    	}
	    	// DEPLACEMENT VERS LA DROITE
	    	else if (c_initial.getX() < c_final.getX())
	    	{
	    		// DEPLACEMENT HORIZONTALE
	    		if (c_initial.getY() == c_final.getY()) 
	    		{
	    			for (i=c_initial.getX() + 1; i<c_final.getX(); ++i) 
	    			{
	    				if (this .terrain [i][c_final.getY()].retourneContenu() != null) 
	    				{
	    					return true;
	    				}
	    			}
	    		}
	    		// DEPLACEMENT DIAGONALE BASSE
	    		else if(c_initial.getY() > c_final.getY()) 
	    		{
	    			for (i=1; i<(c_final.getX()-c_initial.getX()); i++)
	    			{
	    				if (this .terrain[c_initial.getX()+i][c_initial.getY()-i].retourneContenu() != null) 
	    				{
	    					return true;
	    				}
	    			}
	    		}
	    		// DEPLACEMENT DIAGONALE HAUTE	
	    		else if(c_initial.getY() < c_final.getY())
	    		{
	    			for (i=1; i<(c_final.getX()-c_initial.getX()); i++)
	    			{
	    				if (this .terrain[c_initial.getX()+i][c_initial.getY()+i].retourneContenu() != null) 
	    				{
	    					return true;
	    				}
	    			}
	    		}
	    		else return false;
	    	}
	    	else return false;
	    }
	    
	    else if (pieceName == "fou") {
	    	if (c_final.retourneContenu().getColor() == c_initial.retourneContenu().getColor()) {
	    		return true;
	    	}
	    	//Déplacement vers le haut (...) ^
	    	if (c_final .getY() > c_initial.getY()) {
	    		// (...) et vers la droite >
	    		if (c_final.getX() > c_initial.getX()) {
	    			for (i = 1; i < (c_final.getX() - c_initial.getX()); ++i) {
	    				if ( !(this .terrain [c_initial.getX()+i][c_final.getY()+i] .estVide()) ) {
	    					return true;
	    				}
	    			}
	    		}
	    		// (...) et vers la gauche <
	    		else {
	    			for (i = 1; i > (c_initial.getX() - c_final.getX()); ++i) {
	    				if ( !(this .terrain [c_initial.getX()-i][c_final.getY()+i] .estVide()) ) {
	    					return true;
	    				}
	    			}
	    		}
	    	}
	    	// Déplacement vers le bas (...) v
	    	else {
	    		// (...) et vers la droite >
	    		if (c_final.getX() > c_initial.getX()) 
	    		{
	    			for (i = 1; i > (c_final.getX() - c_initial.getX()); ++i) 
	    			{
	    				if ( !(this .terrain [c_initial.getX()+i][c_final.getY()-i] .estVide()) ) 
	    				{
	    					return true;
	    				}
	    			}
	    		}
	    		// (...) et vers la gauche <
	    		else 
	    		{
	    			for (i = 1; i < (c_initial.getX() - c_final.getX()); ++i) 
	    			{
	    				if ( !(this .terrain [c_initial.getX()-i][c_final.getY()-i] .estVide()) ) 
	    				{
	    					return true;
	    				}
	    			}
	    		}
	    	}
	    	return false;
	    }	    
	   	return false;
	    
    }
   	
   /**
    * Test si le déplacement d'une pièce est possivle (présence d'obstacle + déplacement approprié)
    * @param		c_initial	Case de départ de la pièce
    * @param		c_final		Case d'arrivé de la pièce
    * @return		Retourne vrai si le déplacement est possible
    */
   public void deplaceunepiece (Case c_initial, Case c_final) 
   {
		  this .terrain [c_final .getX()][c_final .getY()] .changeContenu(c_initial .retourneContenu());
		  this .terrain [c_initial.getX()][c_initial.getY()] .changeContenu(null);
   }
   
   /**
    * Prend en parametre une chaine de caractère repésentant le coup du joueur
    * et effectue le mouvement adequat si possible retourne un code suite à l'action effectuée
    * @param coup		coup du joeur de la forme (a1a2)
    * @param ID			id du joeur appelant au mouvement
    * @return			le code de fin de la methode (0, 1 : pas de probleme, idem et mange une piece ,2: idem undo) (-1, -2,-3: code d'erreurs)
    * 
    */
   
   public int mouvement (String coup, int ID, Pile pile) {
	   if (coup.length() != 4 && ((coup.length() != 1) || (coup.length() == 1 && coup.charAt(0) != 'u'))) 
	   {
		   System.out.println("Coup invalide");
		   return -1;
	   }
	   int xi, yi, xf, yf;
	 
	   if (coup.charAt(0) == 'u') {
		   Undo undo = pile .depile();
		   if (undo == null) {
			   System.out.println("Aucune action à annuler");
			   return -2;
		   }
		   coup = undo.coup;
		   
		   xf = ((int) coup .charAt(0)) - 'a';
		   yf = ((int) coup .charAt(1)) - '1';
		   
		   xi = ((int) coup .charAt(2)) - 'a';
		   yi = ((int) coup .charAt(3)) - '1' ;
		   		   
		   this .deplaceunepiece(terrain [xi][yi], terrain [xf][yf]);
		   if (undo.piece != null) {
			   terrain [xi][yi] .changeContenu(undo.piece);
		   }
		   return 2;
	   }
	   xi = ((int) coup .charAt(0)) - 'a';
	   yi = ((int) coup .charAt(1)) - '1';
		   
	   xf = ((int) coup .charAt(2)) - 'a';
	   yf = ((int) coup .charAt(3)) - '1' ;
	   
	   
	   
	   if (this .terrain [xi][yi] .retourneContenu() == null) {
		   System.out.println("Aucune pièce à deplacer\n\n");
		   return -2;
	   }
	   else if (ID == 1 && this .terrain [xi][yi] .retourneContenu() .getColor() != Color.white) {
		   System.out.println("Pièces de l'adversaire");
		   return -3;
	   }
	   else if (ID == 2 && this .terrain [xi][yi] .retourneContenu() .getColor() != Color.black) {
		   System.out.println("Pièces de l'adversaire");
		   return -3;
	   }
	   else if (this .terrain [xi][yi] .retourneContenu() .deplacement(terrain [xi][yi], terrain [xf][yf])
			   	 && !(this .existeObstacle(terrain [xi][yi], terrain [xf][yf]))) 
	   {
		   if (terrain [xf][yf].retourneContenu() != null) {
			   pile .addPile (coup, terrain [xf][yf].retourneContenu());
			   this .deplaceunepiece(terrain [xi][yi], terrain [xf][yf]);
			   return 1;
		   }
		   else {
			   pile .addPile (coup);
			   this .deplaceunepiece(terrain [xi][yi], terrain [xf][yf]);
			   return 0;
		   }
	   }
	   else {
		   System.out.println("Déplacement impossible\n\n");
		   return -2;
	   }
			
   }

   public Case getCaseKing (Color couleur) {
	   int i,j;
	   Piece piece;
	   for (i=0; i<this.nb_case; ++i) {
		   for (j=0; j<this.nb_case; ++j) {
			   piece = this.terrain [i][j].retourneContenu();
			   if (piece != null && piece.getName() == "roi" && piece.getColor() == couleur) {
				   return this .terrain [i][j];
			   }
		   }
	   }
	   return null;
	   
   }
   
   /**
    * Detecte une situation d'echec
    * @param c_roi		case où se trouve le roi 
    * @return		boolean
    */
   public boolean echecRoi (Case c_roi, Color couleur) {
	   int changement = 0;
	   if (c_roi.retourneContenu() == null) {
		   	c_roi .changeContenu(new Roi (couleur));
		   	changement = 1;
	   }
	   int i, j;
	   boolean test = false;
	   Piece piece;
	   for (i=0; i<this.nb_case; ++i) {
		   if (test) break;
		   for (j=0; j<this.nb_case; ++j) {
			   piece = this.terrain[i][j].retourneContenu();
			   if (piece != null && piece .getColor() != c_roi .retourneContenu().getColor()) {
				   test = (piece.deplacement(this.terrain[i][j], c_roi) && !(this.existeObstacle(this.terrain[i][j], c_roi)));
			   }
			   if (test) break;
		   }
	   }
	   if (changement == 1) c_roi.changeContenu(null);
	   return test;
   }
   
   /**
    * Detecte une situation d'echec et mat
    * @param c_roi 
    * @return boolean
    */
   public boolean echecEtMat(Case c_roi, Color couleur) {
	   //int i, j;
	   int xr, yr;
	   
	   xr = c_roi.getX();
	   yr = c_roi.getY();
	   
	   boolean test = false;
	   test = echecRoi (c_roi, couleur);
	   if (test == false) return false;
	   
	   // a droite en x
	   if (xr == this.nb_case -1) {
		   //en haut en y
		   if (yr == this.nb_case -1) { 
			   if (this.terrain [xr-1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr], couleur);
			   }
			   if (this.terrain [xr-1][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr-1], couleur);
			   }
			   if (this.terrain [xr][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr-1], couleur);
			   }
		   }
		   // en bas en y
		   else if (yr == 0) {
			   if (this.terrain [xr-1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr], couleur);
			   }
			   if (this.terrain [xr-1][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr+1], couleur);
			   }
			   if (this.terrain [xr][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr+1], couleur);
			   }
		   }
		   // ailleurs en y
		   else {
			   if (this.terrain [xr-1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr], couleur);
			   }
			   if (this.terrain [xr-1][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr+1], couleur);
			   }
			   if (this.terrain [xr][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr+1], couleur);
			   }
			   if (this.terrain [xr-1][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr-1], couleur);
			   }
			   if (this.terrain [xr][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr-1], couleur);
			   }
		   }
	   }
	   // a gauche en x
	   else if (xr == 0) {
		 //en haut en y
		   if (yr == this.nb_case -1) { 
			   if (this.terrain [xr+1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr], couleur);
			   }
			   if (this.terrain [xr+1][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr-1], couleur);
			   }
			   if (this.terrain [xr][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr-1], couleur);
			   }
		   }
		   // en bas en y
		   else if (yr == 0) {
			   if (this.terrain [xr+1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr], couleur);
			   }
			   if (this.terrain [xr+1][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr+1], couleur);
			   }
			   if (this.terrain [xr][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr+1], couleur);
			   }
		   }
		   // ailleurs en y
		   else {
			   if (this.terrain [xr][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr+1], couleur);
			   }
			   if (this.terrain [xr][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr-1], couleur);
			   }
			   if (this.terrain [xr+1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr], couleur);
			   }
			   if (this.terrain [xr+1][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr-1], couleur);
			   }
			   if (this.terrain [xr+1][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr+1][yr+1], couleur);
			   }
		   }
	   }
	  // ailleurs en x
	   else {
		 //en haut en y
		   if (yr == this.nb_case -1) { 
		
			   if (this.terrain [xr-1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr], couleur);
			   }
			   if (this.terrain [xr-1][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr-1], couleur);
			   }
			   if (this.terrain [xr][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr-1], couleur);
			   }
			   if (this.terrain [xr+1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr], couleur);
			   }
			   if (this.terrain [xr+1][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr-1], couleur);
			   }
		   }
		   // en bas en y
		   else if (yr == 0) {
			   if (this.terrain [xr+1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr], couleur);
			   }
			   if (this.terrain [xr+1][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr+1], couleur);
			   }
			   if (this.terrain [xr][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr+1], couleur);
			   }
			   if (this.terrain [xr-1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr], couleur);
			   }
			   if (this.terrain [xr-1][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr+1], couleur);
			   }
		   }
		   // ailleurs en y
		   else {
			   if (this.terrain [xr-1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr], couleur);
			   }
			   if (this.terrain [xr-1][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr+1], couleur);
			   }
			   if (this.terrain [xr][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr+1], couleur);
			   }
			   if (this.terrain [xr-1][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr -1][yr-1], couleur);
			   }
			   if (this.terrain [xr][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr][yr-1], couleur);
			   }
			   if (this.terrain [xr+1][yr]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr], couleur);
			   }
			   if (this.terrain [xr+1][yr-1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr +1][yr-1], couleur);
			   }
			   if (this.terrain [xr+1][yr+1]. retourneContenu() == null)
			   {
				   test = test && echecRoi (this.terrain [xr+1][yr+1], couleur);
			   }
		   }
	   }
	   return test;
	}
}
