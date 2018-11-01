package zadatak1;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import zadatak1.UcitavanjeSaTastature;

public class UcitavanjeSaTastatureTest {
	
	public final String SOME_INPUT_STRING = "some simulated input string";
	
	@Test
	public void metoda_ucitajString() {
		ByteArrayInputStream in = new ByteArrayInputStream(SOME_INPUT_STRING.getBytes());
		InputStream sysIn = System.in;
		System.setIn(in);
				
		try {
			String ucitanString = UcitavanjeSaTastature.ucitajString();
			assertTrue("Metoda ne ucitava i vraca string ",
					ucitanString.trim().equalsIgnoreCase(SOME_INPUT_STRING));			
		} catch (IOException e) {
			assertFalse("Doslo je do greske prilikom ucitavanja stringa", true);
		}				
		
		System.setIn(sysIn);		
	}

	@Test
	public void metoda_ucitajBrojIVratiKvadrat() {
		ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
		InputStream sysIn = System.in;
		System.setIn(in);
							
		try {
			double kvadrat = UcitavanjeSaTastature.ucitajBrojIVratiKvadrat();
			assertTrue("Metoda ucitajBrojIVratiKvadrat ne ucitava i ispisuje dobro kvadrat", (kvadrat == 25));			
		} catch (IOException e) {
			assertFalse("Doslo je do greske prilikom ucitavanja broja", true);
		}
		
		System.setIn(sysIn);		
	}

	@Test
	public void metoda_ucitajBrojIProveriParnost() {
		ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
		InputStream sysIn = System.in;
		System.setIn(in);
				
		try {
			boolean paran = UcitavanjeSaTastature.ucitajBrojIProveriParnost();
			assertTrue("Metoda ucitajBrojIProveriParnost ne ucitava i ne proverava dobro parnost za parne brojeve", (paran == true));
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		in = new ByteArrayInputStream("5".getBytes());
		System.setIn(in);
		
		try {
			boolean paran = UcitavanjeSaTastature.ucitajBrojIProveriParnost();
			assertTrue("Metoda ucitajBrojIProveriParnost ne ucitava i ne proverava dobro parnost za neparne brojeve", (paran == false));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.setIn(sysIn);			
	}


	@Test
	public void metoda_ucitajRecenicuIspisiBrojReci() {
		ByteArrayInputStream in = new ByteArrayInputStream("Ova recenica ima pet reci".getBytes());
		InputStream sysIn = System.in;
		System.setIn(in);
		
		try {
			int brojReci = UcitavanjeSaTastature.ucitajRecenicuIVratiBrojReci();
			assertTrue("Metoda ucitajRecenicuIVratiBrojReci ne broji dobro reci", (brojReci == 5));			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.setIn(sysIn);			
	}

}
