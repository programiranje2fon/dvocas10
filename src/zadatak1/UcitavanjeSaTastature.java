package zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UcitavanjeSaTastature {
	
	static String ucitajIVratiString() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite tekst: ");
		String s = br.readLine();
		return s;
	}

	static double ucitajBrojIVratiKvadrat() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite realan broj: ");
		String s = br.readLine();
		double d = Double.parseDouble(s);
		return (d * d);
	}

	static boolean ucitajBrojIProveriParnost() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite ceo broj: ");
		
		String s = br.readLine();
		int i = Integer.parseInt(s);
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

	static int ucitajRecenicuIVratiBrojReci() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite recenicu: ");
		String s = br.readLine();
		String[] reci = s.split(" ");
		return reci.length;
	}

}
