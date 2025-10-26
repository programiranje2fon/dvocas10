package zadatak1;

public class ProveraUcitavanjaSaTastature2 {
	
	public static void main(String[] args) {
		String s = UcitavanjeSaTastature2.ucitajIVratiString();
		System.out.println(s);
		
		double kvadrat = UcitavanjeSaTastature2.ucitajBrojIVratiKvadrat();
		System.out.println(kvadrat);
		
		boolean paran = UcitavanjeSaTastature2.ucitajBrojIProveriParnost();
		System.out.println(paran);
	}
	
}