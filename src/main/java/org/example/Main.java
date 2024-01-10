package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Gezegen merkur = new Gezegen("Merkur", GezegenBilgileri.MERCURY);
        Gezegen venus = new Gezegen("Venus", GezegenBilgileri.VENUS);
        Gezegen dunya = new Gezegen("Dünya", GezegenBilgileri.EARTH);
        Gezegen mars = new Gezegen("Mars", GezegenBilgileri.MARS);
        Gezegen jupiter = new Gezegen("Jüpiter", GezegenBilgileri.JUPITER);
        Gezegen saturn = new Gezegen("Satürn",GezegenBilgileri.SATURN);
        Gezegen uranus = new Gezegen("Uranüs", GezegenBilgileri.URANUS);
        Gezegen neptun = new Gezegen("Neptün",GezegenBilgileri.NEPTUNE);

        System.out.println(merkur);
        System.out.println(venus);
        System.out.println(dunya);
        System.out.println(mars);
        System.out.println(jupiter);
        System.out.println(saturn);
        System.out.println(uranus);
        System.out.println(neptun);
    }

}