package no.hvl.DAT100; 

import static javax.swing.JOptionPane.*; 
import static java.lang.Double.*;

public class Trinnskatt {

	public static void main(String[] args) {
	
		double tall = parseDouble(showInputDialog("Tast inn bruttoinntekt"));
		
		double Trinn0 = tall;
		double Trinn1 = (tall - 180_800) * 0.019;
		double Trinn2 = (254_500 - 180_800) * 0.019 + (tall - 254_500) * 0.042; 
		double Trinn3 = (254_500 - 180_800) * 0.019 + (639_750 - 254_500) * 0.042 + (tall - 639_750) * 0.132;
		double Trinn4 = (254_500 - 180_800) * 0.019 + (639_750 - 254_500) * 0.042 + (999_550 - 639_750) * 0.132 + 
				(tall - 999_550) * 0.162;
		
		
		//Trinn 0
		if (tall > 0 && tall <= 180_800) {	
			showMessageDialog(null,"Du har ingen trinnskatt, summen blir: "+ Trinn0 + "kr");
		}
		
		//Trinn 1
		else if (tall > 180_800 && tall <= 254_500) {
			showMessageDialog(null, "Du har 1,9% i trinnskatt, summen blir " + Trinn1 + "kr");
		}
		
		//Trinn 2
		else if (tall > 254_500 && tall <= 639_750) {
			showMessageDialog(null, "Du har 4,2% i trinnskatt, summen blir " + Trinn2 + "kr");
		}
		
		//Trinn 3
		else if (tall > 639_750 && tall <= 999_550) {
			showMessageDialog(null, "Du har 13,2% i trinnskatt, summen blir " + Trinn3 + "kr");
		}
		
		//Trinn 4
		else if (tall > 999_550) {
			showMessageDialog(null, "Du har 16,2% i trinnskatt" + Trinn4 + "kr");
		}
	}

}
