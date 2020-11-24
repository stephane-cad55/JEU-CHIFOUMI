package jeuChifoumi;
/*
 * TP Java
 */

import java.io.*; // nécessaire pour utiliser le scanner

/**
 * Classe fournissant des fonctions de lecture au clavier
 *
 * @author agnes
 */

public class Clavier {

	/**
	 * Lecture d'une chaine
	 *
	 * @return
	 */
	public static String lireString() {
		String ligne_lue = null;
		try {
			InputStreamReader lecteur = new InputStreamReader(System.in);
			BufferedReader entree = new BufferedReader(lecteur);
			ligne_lue = entree.readLine();
		} catch (IOException err) {
			System.err.println("Error lire String");
			System.exit(0);
		}
		return ligne_lue;
	}

	/**
	 * Lecture d'un nombre d�cimal
	 *
	 * @return
	 */
	public static float lireFloat() // lecture d'un float
	{
		float x = 0;
		// Essaye de valeur a lire
		try {
			String ligne_lue = lireString();
			x = Float.parseFloat(ligne_lue);
			// S'il a attraper une erreur :
		} catch (NumberFormatException err) {
			System.out.println("*** Erreur de donnee ***");
			System.exit(0);
		}
		return x;
	}

	/**
	 * Lecture d'un nombre décimal à double précision
	 * 
	 * @return
	 *
	 * @return
	 */
	public static double lireDouble() {
		double x = 0;
		try {
			String ligne_lue = lireString();
			x = Double.parseDouble(ligne_lue);
		} catch (NumberFormatException err) {
			System.out.println("*** Erreur de donnee ***");
			System.exit(0);
		}
		return x;
	}

	/**
	 * Lecture d'un entier
	 *
	 * @return
	 */

	public static int lireInt() {
		int n = 0;
		try {
			String ligne_lue = lireString();
			n = Integer.parseInt(ligne_lue);
		} catch (NumberFormatException err) {

		}
		return n;
	}

	public static String lire() {
		// TODO Auto-generated method stub
		return null;
	}
}