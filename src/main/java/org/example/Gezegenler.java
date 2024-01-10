package org.example;

    enum GezegenBilgileri{
        MERCURY(1, 57.9, 2439.7, 58.6),
        VENUS(2, 108.2, 6051.8, -243),
        EARTH(3, 149.6, 6371, 24),
        MARS(4, 227.9, 3389.5, 24.7),
        JUPITER(5, 778.3, 71492, 9.9),
        SATURN(6, 1427, 60268, 10.7),
        URANUS(7, 2871, 25559, -17.2),
        NEPTUNE(8, 4497, 24764, 16.1);

    private final int siraNumarasi;
    private  final double uzaklik;
    private final double yaricap;
    private final double donmeSuresi;
    GezegenBilgileri(int siraNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
        this.siraNumarasi = siraNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }
    public int getSiraNumarasi() {
        return siraNumarasi;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }
}
