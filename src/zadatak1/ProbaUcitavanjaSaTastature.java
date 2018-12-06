package zadatak1;

import java.io.IOException;

public class ProbaUcitavanjaSaTastature {
	
	public static void main(String[] args) {
		
		
		try {
			String s = UcitavanjeSaTastature.ucitajIVratiString();
			System.out.println(s);
		} catch (IOException e) {
			System.out.println("Greska prilikom ucitavanja stringa!");
		}
		
		
		try {
			double d = UcitavanjeSaTastature.ucitajBrojIVratiKvadrat();
			System.out.println(d);
		} catch (IOException e) {
			System.out.println("Greska prilikom ucitavanja broja");
		} catch(NumberFormatException nex) {
			System.out.println("Nije unet broj!");
		}
		
		
		try {
			boolean paran = UcitavanjeSaTastature.ucitajBrojIProveriParnost();
			
			if (paran) System.out.println("Uneti broj je paran");
				else System.out.println("Uneti broj je neparan");
		} catch (IOException e) {
			System.out.println("Greska prilikom ucitavanja broja");
		} catch(NumberFormatException nex) {
			System.out.println("Nije unet broj!");
		}
		
		
		try {
			int brojReci = UcitavanjeSaTastature.ucitajRecenicuIVratiBrojReci();
			System.out.println("Broj reci: "+brojReci);
		} catch (IOException e) {
			System.out.println("Greska prilikom ucitavanja recenice");
		}
	}

}
