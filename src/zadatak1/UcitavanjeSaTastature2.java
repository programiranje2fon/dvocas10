package zadatak1;

import java.util.Scanner;

public class UcitavanjeSaTastature2 {
	
	static String ucitajIVratiString() {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite tekst: ");
		String tekst = s.nextLine();
		return tekst;
	}

	static double ucitajBrojIVratiKvadrat() {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite realan broj: ");
		double d = s.nextDouble();
		return (d * d);
	}

	static boolean ucitajBrojIProveriParnost() {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite ceo broj: ");
		int i = s.nextInt();
	
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

}