package boucles;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int nbr, cpt=1;
		
		System.out.println("Entrez un nombre");
		nbr= (new Scanner(System.in)).nextInt();
		
		while (cpt<=10) {
			System.out.println( nbr*cpt+ " ");
			cpt=cpt+1;
			
		}
		for(cpt = 1; cpt <= 10; cpt++) {
			System.out.print( nbr*cpt+ " ");
		}

	}

}
