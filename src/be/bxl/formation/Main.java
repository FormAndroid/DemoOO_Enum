package be.bxl.formation;

import be.bxl.formation.enums.JourSemaine;
import be.bxl.formation.enums.TauxTVA;

public class Main {

    public static void main(String[] args) {

        JourSemaine j1 = JourSemaine.LUNDI;


        TauxTVA t1 = TauxTVA.REDUIT;


        double prixHT = 42;
        double prixTTC;

        t1.getTaux();

//        switch (t1){
//            case NORMAL :
//                prixTTC  = prixHT + prixHT * 0.21;
//                break;
//            case REDUIT:
//                prixTTC  = prixHT + prixHT * 0.06;
//                break;
//            case PARKING:
//                prixTTC  = prixHT + prixHT * 0.12;
//                break;
//        }

        prixTTC  = prixHT + prixHT * t1.getTaux();

        prixTTC = t1.appliquerTVA(prixHT);

        System.out.println("Le prix avec une TVA " +
                t1 + " est de " + prixTTC + " euros.");
    }
}
