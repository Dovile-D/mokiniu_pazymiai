package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Programa skaiciuojanti mokiniu vidurkius ir skolininku (mokiniu, kuriu vidurkis zemesnis, " +
                "nei 3.5), kieki.");

        Mokinys darius = new Mokinys("Girenas", "Darius", "java", new int[]{10, 5, 8, 6, 9});
        Mokinys silvija = new Mokinys("Kazlauskaite", "Silvija", "c++", new int[]{8, 8, 4, 5, 6});
        Mokinys lukas = new Mokinys("Gricius", "Lukas", "c#", new int[]{10, 9, 10, 8, 9});
        Mokinys paulina = new Mokinys("Rudyte", "Paulina", "java", new int[]{5, 5, 4, 8, 3});
        Mokinys saulius = new Mokinys("Tekutis", "Saulius", "c++", new int[]{2, 2, 2, 5, 2});
        Mokinys ugne = new Mokinys("Ulyte", "Ugne", "c#", new int[]{10, 5, 8, 6, 9});
        Mokinys olegas = new Mokinys("Surajevas", "Olegas", "java", new int[]{10, 10, 7, 9, 9});
        Mokinys emilija = new Mokinys("Kiliute", "Emilija", "c++", new int[]{4, 6, 8, 8, 6});
        Mokinys nojus = new Mokinys("Odinas", "Nojus", "c#", new int[]{2, 2, 2, 2, 3});
        Mokinys barbora = new Mokinys("Lubyte", "Barbora", "java", new int[]{7, 5, 8, 1, 7});

//        Moksleivio klases objektu masyvas:
        Mokinys[] mokiniai = {darius, silvija, lukas, paulina, saulius, ugne, olegas, emilija, nojus, barbora};

        double[] vidurkiai = {darius.skaiciuotiVidurki(darius.getPazymiai()),
                silvija.skaiciuotiVidurki(silvija.getPazymiai()),
                lukas.skaiciuotiVidurki(lukas.getPazymiai()),
                paulina.skaiciuotiVidurki(paulina.getPazymiai()),
                saulius.skaiciuotiVidurki(saulius.getPazymiai()),
                ugne.skaiciuotiVidurki(ugne.getPazymiai()),
                olegas.skaiciuotiVidurki(olegas.getPazymiai()),
                emilija.skaiciuotiVidurki(emilija.getPazymiai()),
                nojus.skaiciuotiVidurki(nojus.getPazymiai()),
                barbora.skaiciuotiVidurki(barbora.getPazymiai())};

        spausdintiVidurkius(mokiniai);

        int skolininkai = skaiciuotiSkolininkus(vidurkiai);
        System.out.println("Viso yra: " + skolininkai + " skolininkai.");

        

    }

    /**
     * Funkcija skaiciuojanti mokiniu, kuriu vidurkis mazesnis uz 3.5, kieki
     *
     * @param vidurkiai perduodamas pazymiu sarasas
     * @return mokiniu, kuriu vidurkis mazesnis nei 3.5, kiekis
     */
    public static int skaiciuotiSkolininkus(double[] vidurkiai) {
        int skolininkuKiekis = 0;
        for (int i = 0; i < vidurkiai.length; i++) {
            if (vidurkiai[i] < 3.5) {
                skolininkuKiekis++;
            }
        }
        return skolininkuKiekis;
    }

    /**
     * Funkcija isvedanti informacija apie objektus
     *
     * @param mokiniai perduodamas sarasas
     */
    public static void spausdintiVidurkius(Mokinys[] mokiniai) {
//        for each ciklas:
        for (Mokinys mokinys : mokiniai) {
            System.out.println(mokinys.getVardas() + " " + mokinys.getPavarde() + " is " + mokinys.getKlase() + "  vidurkis - "
                    + mokinys.skaiciuotiVidurki(mokinys.getPazymiai()));
        }
    }

}
