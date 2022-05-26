package com.company;
/*Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase. Pored toga, klasa ima:
apstraktnu metodu štampaj
apstraktnu metodu koja vraca clanarinu planinara
apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
Metoda kao ulazni parametar prima objekat tipa Planina.*/
public abstract class Planinar extends Planina {

    private int id;
    private String imeIPrezime;

    public Planinar() {
    }

    public Planinar(int id, String imeIPrezime) {
        this.id = id;
        this.imeIPrezime = imeIPrezime;
    }

    public int getId() {
        return id;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public abstract void stampaj ();


    public abstract int clanarina ();

    public abstract boolean uspesanUspon (Planina planina);


}
