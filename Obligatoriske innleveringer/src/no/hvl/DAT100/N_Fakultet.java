package no.hvl.DAT100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class N_Fakultet {

	public static void main(String[] args) {
		
		// Innlesing av heltall og deklarasjon av variabler
		int n = parseInt(showInputDialog("Tast inn heltall:"));
		
		int fak = 1;
		
		// Valgsetning med for-løkke
		if (n > 0) {
			for ( ; n > 0; n--) {
				fak *= n;
		}
			
		showMessageDialog(null, "Fakultetet til inntastet heltall er : " + fak);
			
		
		} else {
			
			showMessageDialog(null, "Ikke et gyldig heltall");
		}

	}

}

