package com.company;

import java.util.Arrays;

public class Mokinys {
    //    pozymiai:
    private String pavarde;
    private String vardas;
    private String klase;
    private int[] pazymiai;

    //    konstruktorius:
    public Mokinys(String pavarde, String vardas, String klase, int[] pazymiai) {
        this.pavarde = pavarde;
        this.vardas = vardas;
        this.klase = klase;
        this.pazymiai = pazymiai;
    }

    //    getters:
    public String getPavarde() {
        return pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public String getKlase() {
        return klase;
    }

    public int[] getPazymiai() {
        return pazymiai;
    }


    // setters:
    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setKlase(String klase) {
        this.klase = klase;
    }

    public void setPazymiai(int[] pazymiai) {
        this.pazymiai = pazymiai;
    }

    // metodai:
    public double skaiciuotiVidurki(int[] pazymiai) {
        double pazymiuSuma = 0;
        for (int i = 0; i < this.pazymiai.length; i++) {
            pazymiuSuma = pazymiuSuma + pazymiai[i];
        }
        return pazymiuSuma / pazymiai.length;
    }

    @Override
    public String toString() {
        return "Mokinys{" +
                "pavarde='" + pavarde + '\'' +
                ", vardas='" + vardas + '\'' +
                ", klase='" + klase + '\'' +
                ", pazymiai=" + Arrays.toString(pazymiai) +
                '}';
    }
}
