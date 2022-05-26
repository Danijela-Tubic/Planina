package com.company;
  /*Kreirati glavnu klasu I u njoj:
        instancirati jednu planinu
        napraviti nizili listu koji ce sadrzati najmanje tri rekrativna planinara I tri alpiniste
        ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti na instanciranu planin
        ispisati kolika je zbir svih clanarina planinara iz niza/liste*/
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Planina kopaonik = new Planina();
        kopaonik.setImePlanine("Kopaonik");
        kopaonik.setDrzava("Srbija");
        kopaonik.setVisinaPlanine(1500);

        RekreativniPlaninar rekreativac1 = new RekreativniPlaninar(12, "Ivan Ivanović", 5, "sremski", 75);
        RekreativniPlaninar rekreativac2 = new RekreativniPlaninar(13, "Petar Petrović", 10, "mačvanski", 68);
        RekreativniPlaninar rekreativac3 = new RekreativniPlaninar(14, "Marko Marković", 15, "kolubarski", 74);

        Alpinista alpinista1 = new Alpinista(16, "Ana Ilić", 3);
        Alpinista alpinista2 = new Alpinista(17, "Dragana Milić", 12);
        Alpinista alpinista3 = new Alpinista(18, "Miloš Lukić", 0);

        ArrayList<Planinar> listaPlaninara = new ArrayList<>();
        listaPlaninara.add(rekreativac1);
        listaPlaninara.add(rekreativac2);
        listaPlaninara.add(rekreativac3);
        listaPlaninara.add(alpinista1);
        listaPlaninara.add(alpinista2);
        listaPlaninara.add(alpinista3);

        rekreativac1.stampaj();
        rekreativac2.stampaj();
        rekreativac3.stampaj();
        alpinista1.stampaj();
        alpinista2.stampaj();
        alpinista3.stampaj();


        int zbirClanarina = 0;
        for (Planinar planinar : listaPlaninara) {
            planinar.stampaj();
            System.out.println("Da li je planinar ostvario uspešan uspon?");
            if (planinar.uspesanUspon(kopaonik)) {
                System.out.println("Uspešan uspon!");
            }else {
                System.out.println("Neuspešan uspon!");
            }
            zbirClanarina += planinar.clanarina();

        }
        System.out.println("Ukupna članarina je " + zbirClanarina);
    }

}
