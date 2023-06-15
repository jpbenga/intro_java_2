package fr.hb.jpb.business;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minutes = 0;
		int hours = 0;
		
		

		System.out.println("Veuillez saisir les heures");
		hours = sc.nextInt();
		int hm = (hours % 5);
		int showL1 = (hours - hm) / 5;
		int showL2 = (hm);

		System.out.println("Veuillez saisir les minutes");
		minutes = sc.nextInt();
		int mm = (minutes % 5);
		int showL3 = (minutes - mm) / 5;
		int showL4 = mm;
		
		

		//String[] array1 = new String[Integer.parseInt(showL1)];

		for (int i = 0; i < showL1; i++) {
			System.out.print("X");
		}
		
		System.out.print("\n");
		

		for (int i = 0; i < showL2; i++) {
			System.out.print("x");
		}
		
		System.out.print("\n");
		

		for (int i = 0; i < showL3; i++) {
			System.out.print("O");
		}
		
		System.out.print("\n");
		

		for (int i = 0; i < showL4; i++) {
			System.out.print("o");
		}

	}

}
