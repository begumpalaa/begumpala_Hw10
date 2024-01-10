package org.example;

public class Gezegen {
    private final String isim;
    private final GezegenBilgileri bilgileri;

    public Gezegen(String isim, GezegenBilgileri bilgileri) {
        this.isim = isim;
        this.bilgileri = bilgileri;
    }

    public String getIsim() {
        return isim;
    }

    public GezegenBilgileri getBilgileri() {
        return bilgileri;
    }
    public String toString() {
        return String.format("%s: Sıra Numarası=%d, Uzaklık=%.2f milyon km, Yarıçap=%.2f km, Dönme Süresi=%.2f saat",
                isim, bilgileri.getSiraNumarasi(), bilgileri.getUzaklik(), bilgileri.getYaricap(), bilgileri.getDonmeSuresi());
    }
}
