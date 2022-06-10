package com.ferragnez.party;

import java.util.Scanner;

public class BonusCheckGuest {

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
		
		// chiedo ad utente di inserire il suo nome
		String nomeInvitato;
		System.out.println("Inserisci il tuo nome: ");
		nomeInvitato = scan.nextLine();
		
		// verifico se utente è tra gli invitati
		int totaleInvitati = invitati.length;
		boolean flag = false;
		
		for(int i = 0; i < totaleInvitati; i++) {
			if(nomeInvitato.equalsIgnoreCase(invitati[i])) {
				System.out.println("Sei tra gli invitati. Puoi entrare!");
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Non sei tra gli invitati. Vai via!");
		}
		scan.close();

	}

}
