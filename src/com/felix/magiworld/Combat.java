package com.felix.magiworld;

import java.util.Scanner;

public class Combat {
    private Scanner sc = new Scanner(System.in);
    Personnage joueur;

    public Combat(){
        for (int x = 1;x<3;x++) {
            System.out.println("Choisissez la classe de votre personnage:\n" + "1 - Mage  2 - Guerrier  3 - Rodeur");
            int choixClasse = sc.nextInt();
            switch (choixClasse) {
                case 1:
                    joueur = new Mage(x);
                    break;
                case 2:
                    joueur = new Guerrier(x);
                    break;
                case 3:
                    joueur = new Rodeur(x);
                    break;
            }
        }
    }

}
