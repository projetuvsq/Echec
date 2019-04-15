import lib.src.echec.*;

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
		Scanner sr = new Scanner (System.in);
		Joueur J1 = new Joueur(1, 1), J2;
		Terrain plateau = new Terrain();
		System.out.println("Choisissez votre adversaire:\n1. Joueur\n2. IA");
		int mode = sr.nextInt(), i=0, retour;
		
		if (mode == 1 || mode == 2) {
			J2 = new Joueur(mode, 2);
		}
		else {
			System.out.println("Saisie invalide, mode IA choisit");
			J2 = new Joueur(2, 2);
		}
		sr.nextLine();
		
		while (i != 300) {
			Joueur Player;
			plateau.afficher();
			if (i % 2 == 0) Player = J1;
			else Player = J2;
			
			System.out.printf ("Joueur %d, entrer votre coup de la forme (a1a2):\n", Player.getID());
			retour = plateau .mouvement(sr.nextLine(), Player.getID());
			if (retour == -1 || retour == 1 || retour == 2)	{
				System.out.println("Réessayez");
				continue;
			}
			i++;
		}
		sr.close();
	}
}
