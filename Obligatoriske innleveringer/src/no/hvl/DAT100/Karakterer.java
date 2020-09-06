package no.hvl.DAT100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakterer {

	public static void main(String[] args) {
		
		// for-løkke (b.)
		for (int i = 0; i < 10; i++) {
		int poeng = parseInt(showInputDialog("Tast inn poengsum:"));

		
		// Karakter A
		if (poeng >= 90 && poeng <= 100) {
			showMessageDialog(null, "Karakter A");
		}
		
		// Karakter B
		else if (poeng >= 80 && poeng <= 89) {
			showMessageDialog(null, "Karakter B");
		}
		
		// Karakter C
		else if (poeng >= 60 && poeng <= 79) {
			showMessageDialog(null, "Karakter C");
		}
		
		// Karakter D
		else if (poeng >= 50 && poeng <= 59) {
			showMessageDialog(null, "Karakter D");
		}
		
		// Karakter E
		else if (poeng >= 40 && poeng <= 49) {
			showMessageDialog(null, "Karakter E");
		}
		
		// Karakter F
		else if (poeng >= 0 && poeng <= 39) {
			showMessageDialog(null, "Karakter F");
		}
		
		// Ingen karakter
		else {
			showMessageDialog(null, "Ikke en valid poengsum, vennligst prøv på nytt:");
			i--;
		}
		
		}
	}

}
