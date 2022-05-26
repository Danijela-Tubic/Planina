package com.company;
/*Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se mogu
 menjati kroz adekvatnu metodu. Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500
 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
        Alpinista, id: id
        ime: ime i prezime
        Broj poena: poeni*/
public class Alpinista extends Planinar {

    private int ostvareniPoeni;

    public Alpinista() {

    }

    public Alpinista(int id, String imeIPrezime, int ostvareniPoeni) {
        super(id, imeIPrezime);
        this.ostvareniPoeni = ostvareniPoeni;
    }

    public int getOstvareniPoeni() {
        return ostvareniPoeni;
    }

    public void setOstvareniPoeni(int ostvareniPoeni) {
        this.ostvareniPoeni = ostvareniPoeni;
    }

    public void stampaj() {
        System.out.println("Alpinista, id: " + getId() + "\n" +
                "ime: " + getImeIPrezime() + "\n Broj poena: " + getOstvareniPoeni());
    }

    public int clanarina() {
        int clanarina = 1500 - (getOstvareniPoeni() * 50);
        if (clanarina > 0)
            return clanarina;
        else
            return 0;
    }


    public boolean uspesanUspon(Planina planina) {
        if (getVisinaPlanine() <= 4000) {
            return true;
        } else {
            return false;
        }
    }

}
