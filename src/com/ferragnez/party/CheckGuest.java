package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	/* creare e inizializzare l’array contenente i nomi degli invitati
	 * chiedere all’utente come si chiama verificare che il nome sia presente nell’array
	 * lasciarlo entrare o rispedirlo cortesemente da dove è venuto
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// dichiaro array da 11
		String[] invitati = new String[11];
		
		// assegno valore alle posizioni dell'array
		invitati[0] = "Dua Lipa";
		invitati[1] = "Paris Hilton";
		invitati[2] = "Manuel Agnelli";
		invitati[3] = "J-Ax";
		invitati[4] = "Francesco Totti";
		invitati[5] = "Ilary Blasi";
		invitati[6] = "Bebe Vio";
		invitati[7] = "Luis";
		invitati[8] = "Pardis Zarei";
		invitati[9] = "Martina Maccherone";
		invitati[10] = "Rachel Zeilic";
		
		scan.close();
		
	}

}
