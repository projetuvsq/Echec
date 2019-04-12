import lib.src.echec.*;
import lib.src.pieces.*;
import java.awt.Color;
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
		Terrain plateau = new Terrain();
		while (true) {
			plateau.afficher();
			System.out.println ("Entrer votre coup de la forme (a1a2): ");
			plateau .mouvement(sr.nextLine());
		}
	}
}
