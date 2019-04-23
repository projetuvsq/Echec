import lib.src.echec.*;
import java.awt.Color;
import java.io.IOException;
//import lib.src.pieces.*;
//import java.awt.Color;
import java.util.Scanner;

/**
 * 
 * @author 	SERHAN Wissam 
 * 			PITTIS Thomas 
 * 			ELHABAR Moussa
 * @version Avr. 2019
 */
 
// Mainclass du projet
public class Chess
{	
	public static void main(String[] args) 
	{
		String coup;
		Scanner sr = new Scanner (System.in);
		Joueur J1 = new Joueur(1, 1), J2;
		Terrain plateau = new Terrain();
		System.out.println("Choisissez votre adversaire:\n1. Joueur\n2. IA");
		int mode = sr.nextInt(), i=0, retour;
		boolean echecMat = false;
		
		if (mode == 1 || mode == 2) {
			J2 = new Joueur(mode, 2);
		}
		else {
			System.out.println("Saisie invalide, mode IA choisit");
			J2 = new Joueur(2, 2);
		}
		sr.nextLine();
		
		while (true) {
			Joueur Player;
			plateau.afficher();
			
			if (i % 2 == 0) Player = J1;
			else Player = J2;
			
			if (Player .getID() == 1) {
				echecMat = plateau .echecEtMat(plateau .getCaseKing(Color.white), Color.white);
			}
			else {
				echecMat = plateau .echecEtMat(plateau .getCaseKing(Color.black), Color.black);
			}
			
			if (echecMat) {
				System.out.printf("Echec et Mat:\nJoueur %d a gagné\n", (Player.getID()%2)+1);
				break;
			}
			
			System.out.printf ("Joueur %d, entrer votre coup de la forme (a1a2):\n", Player.getID());
			coup = sr.nextLine();
			retour = plateau .mouvement(coup, Player.getID(), Player .getPile());
			if (retour == -1 || retour == -2 || retour == -3)	{
				System.out.println("Réessayez");
				continue;
			}
			i++;
		}
		sr.close();
		
	}
}
