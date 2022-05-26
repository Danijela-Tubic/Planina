package com.company;
/*Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
naziv okruga odakle je rekreativni planinar
maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
                              Rekreativac, id: id
                              ime: ime prezime Okrug: okrug*/
public class RekreativniPlaninar extends Planinar {

    private int tezinaOpremeUKg;
    private String okrug;
    private int maximalniUspon;
    private static final int clanarina = 1000;

    public RekreativniPlaninar() {
    }

    public RekreativniPlaninar(int id, String imeIPrezime, int tezinaOpremeUKg, String nazivOkrugaOdakleJeRekreativac, int maximalniUspon) {
        super(id, imeIPrezime);
        this.tezinaOpremeUKg = tezinaOpremeUKg;
        this.okrug = nazivOkrugaOdakleJeRekreativac;
        this.maximalniUspon = maximalniUspon;
    }

    public int getTezinaOpremeUKg() {
        return tezinaOpremeUKg;
    }

    public void setTezinaOpremeUKg(int tezinaOpremeUKg) {
        this.tezinaOpremeUKg = tezinaOpremeUKg;
    }

    public String getOkrug() {
        return okrug;
    }

    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }

    public int getMaximalniUspon() {
        return maximalniUspon;
    }

    public void setMaximalniUspon(int maximalniUspon) {
        this.maximalniUspon = maximalniUspon;
    }

    public int getClanarina() {
        return clanarina;
    }

    public int clanarina() {
        return clanarina;
    }

    public void stampaj() {
        System.out.println("Rekreativac, id: " + getId() + "\n" +
                "ime: " + getImeIPrezime() + " Okrug: " + getOkrug());
    }


    public boolean uspesanUspon(Planina planina) {
        return (maximalniUspon - (tezinaOpremeUKg * 50)) > planina.getVisinaPlanine();
    }
}
