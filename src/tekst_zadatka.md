#Laboratorijske vežbe – dvočas br. 10

##Zadatak 1
*(radi ga laborant u saradnji sa studentima)*

Napraviti javnu klasu **UcitavanjeSaTastature** u paketu **zadatak1** koja ima:

1. Javnu statičku metodu **ucitajIVratiString** koja učitava String sa tastature i vraća ga kao povratnu vrednost metode.
Ukoliko dodje do greške prilikom učitavanja baciti odgovarajući izuzetak iz metode.

2. Javnu statičku metodu **ucitajBrojIVratiKvadrat**  koja sa tastature učitava realan broj i kao povratnu vrednost vraća kvadrat učitanog broja. Ukoliko dodje do greške prilikom učitavanja baciti odgovarajući izuzetak iz metode.

Napraviti javnu klasu **ProbaUcitavanjaSaTastature** u paketu **zadatak1** koja proverava rad svih napisanih metoda.

Napraviti javnu klasu **UcitavanjeSaTastature2** u paketu **zadatak1** koja ima:

1. Javnu statičku metodu **ucitajIVratiString** koja sa tastature učitava String koristeći klasu **Scanner** i vraća učitani string. 

2. Javnu statičku metodu **ucitajBrojIVratiKvadrat** koja sa tastature učitava realan broj koristeći klasu **Scanner** i vraća njegov kvadrat. 

Napraviti klasu **ProbaUcitavanjaSaTastature2** u paketu **zadatak1** koja proverava rad svih napisanih metoda klase **UcitavanjeSaTastature2**

#Zadatak 2 - Ispravka koda

U produžetku teksta je dat kod klase sa metodom koja bi trebalo da sa tastature učita 3 cela broja u tri reda koji predstavljaju dan, mesec i godinu rođenja neke osobe. Nakon toga, metoda bi trebalo da izračuna numerološki horoskopski znak (odnosno broj) te osobe. Numerološki znaci su brojevi 1, 2, 3, 4, 5, 6, 7, 8, 9, ali i 11 i 22. Numerološki broj se izračunava tako što se saberu sve cifre iz dana, meseca i godine rođenja osobe. Moguće je da rezultat takvog sabiranja bude i neki dvocifren broj koji nije 11 ili 22, pa se onda sabiranje cifara ponavlja nad novodobijenim rezultatom koliko god puta je potrebno. Na primer:
1. za osobu rođenu datuma 1.1.2000. numerološki znak je 1 + 1 + 2 + 0 + 0 + 0 = 4
2. za osobu rođenu datuma 28.12.1980. numerološki znak je 2 + 8 + 1 + 2 + 1 + 9 + 8 + 0 = 31 (pa se nastavlja sabiranje) = 3 + 1 = 4
3. za osobu rođenu datuma 9.12.1979. numerološki znak je 9 + 1 + 2 + 1 + 9 + 7 + 9 = 38 = 3 + 8 = 11
4. za osobu rođenu datuma 9.12.1978. numerološki znak je 9 + 1 + 2 + 1 + 9 + 7 + 8 = 37 = 3 + 7 = 10 = 1 + 0 = 1

Dati kod se kompajlira, ali ne radi to šta treba. Napraviti javnu klasu **UcitavanjeSaTastature3** u paketu **ispravka_koda**, prekucati u nju kod koji je dat i,  __uz minimalne izmene__  ga ispraviti tako da funkcioniše kako treba. Napraviti test klasu i, koristeći njenu main metodu, pozvati metodu **ucitajIIzracunajNumeroloskiBroj()** i proveriti njen rad.

	package ispravka_koda;
	
	import java.util.Scanner;
	
	public class UcitavanjeSaTastature3 {
		
		public static void ucitajIIzracunajNumeroloskiBroj() {
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Unesite dan,mesec i godinu u 3 reda");
			
			int brojSaSvimCiframa = (s.nextInt() * 100 + s.nextInt()) * 1000 + s.nextInt();
			
			int sumaCifara;
			
			do{
				
				sumaCifara = 0;
				
				while (brojSaSvimCiframa > 0) {
					
					sumaCifara = sumaCifara + brojSaSvimCiframa % 10;
					
					brojSaSvimCiframa = brojSaSvimCiframa / 10;
				
				}		
				
				sumaCifara = brojSaSvimCiframa;
			
			}while(sumaCifara > 9 && sumaCifara!=11 && sumaCifara!=22);
			
			System.out.println("Vas numeroloski broj je: "+sumaCifara);
			
		}
	
	}

##Zadatak 3
*(studenti rade sami)*

Dodati u klasu **UcitavanjeSaTastature**:

1. Javnu statičku metodu **ucitajBrojIProveriParnost** koja sa tastature učitava ceo broj, i vraća TRUE ili FALSE u zavisnosti da li je učitani broj deljiv sa dva. Ukoliko dodje do greške prilikom učitavanja baciti odgovarajući izuzetak iz metode.

2. Javnu statičku metodu **ucitajRecenicuIVratiBrojReci** koja sa tastature učitava rečenicu vraća koliko reči ima u toj rečenici.
Ukoliko dodje do greške prilikom učitavanja baciti odgovarajući izuzetak iz metode. 

Pozvati sve napisane metode iz klase **ProbaUcitavanjaSaTastature**.


Dodati u klasu **UcitavanjeSaTastature2**:

1. Javnu statičku metodu **ucitajBrojIProveriParnost** koja sa tastature učitava ceo broj koristeći klasu **Scanner** i vraća TRUE ili FALSE u zavisnosti da li je učitani broj deljiv sa dva. Ukoliko dodje do greške prilikom učitavanja baciti odgovarajući izuzetak iz metode.

Pozvati napisanu metodu iz klase **ProbaUcitavanjaSaTastature2**
