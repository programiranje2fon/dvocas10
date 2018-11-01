#Laboratorijske vežbe – dvočas br. 10

##Zadatak 1
*(radi ga laborant u saradnji sa studentima)*

1. Napraviti klasu **UcitavanjeSaTastature** u paketu **zadatak1** koja ima:

2. Statičku metodu **ucitajString** koja učitava String sa tastature i vraća ga kao povratnu vrednost metode (učitavanje sa tastature, bacanje proveravanih izuzetaka)

3. Napraviti klasu **ProveraUcitavanjaSaTastature** u paketu **zadatak1** koja poziva metodu za
učitavanje Stringa klase **UcitavanjeSaTastature**.

Dodati u klasu UcitavanjeSaTastature:

4. Statičku metodu **ucitajBrojIVratiKvadrat**  koja sa tastature učitava realan broj i kao povratnu vrednost vraća kvadrat učitanog broja
(konverzija iz Stringa u Double, napomena za konverziju iz Stringa u int i iz Stringa u boolean, napomena za klasu Scanner)

5. Statičku metodu **ucitajBrojIProveriParnost** koja sa tastature učitava ceo broj, i vraća TRUE ili FALSE u zavisnosti da li je učitani broj deljiv sa dva.
(ovu metodu studenti rade sami)

6. Statičku metodu **ucitajRecenicuIVratiBrojReci** koja sa tastature učitava rečenicu vraća koliko reči ima u toj rečenici. 
(ovu metodu studenti rade sami)

7. Testirati sve napisane metode korišćenjem klase **ProveraUcitavanjaSaTastature**.


##Zadatak 2
*(radi ga laborant u saradnji sa studentima)*

1. Napraviti klasu **UcitavanjeSaTastature2** u paketu **zadatak2** koja ima:

2. Statičku metodu **ucitajIVratiString** koja sa tastature učitava String koristeći klasu **Scanner** i vraća učitani string. 
(učitavanje Stringa sa tastature pomoću klase Scanner i metode nextLine, da je u paketu java.util, napomena da su izuzeci neproveravani)

3. Napraviti klasu **ProveraUcitavanjaSaTastature2** u paketu **zadatak2** koja poziva metodu za unos Stringa klase **UcitavanjeSaTastature2**

Dodati u klasu **UcitavanjeSaTastature2**:

4. Statičku metodu **ucitajBrojIVratiKvadrat** koja sa tastature učitava realan broj koristeći klasu **Scanner** i vraća njegov kvadrat. 
(metoda nextDouble, napomena da nema konvrzije za učitavanje
brojeva korišćenjem klase Scanner)

5. Statičku metodu **ucitajBrojIProveriParnost** koja sa tastature učitava ceo broj koristeći klasu **Scanner** i vraća TRUE ili FALSE u zavisnosti da li je učitani broj deljiv sa dva.
(metoda nextInt)

6. Testirati sve napisane metode korišćenjem klase **ProveraUcitavanjaSaTastature2**

