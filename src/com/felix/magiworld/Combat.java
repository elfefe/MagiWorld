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
                    joueur = new Mage();
                    System.out.println("Le joueur "+x+" est un Mage");
                    break;
                case 2:
                    joueur = new Guerrier();
                    System.out.println("Le joueur "+x+" est un Guerrier");
                    break;
                case 3:
                    joueur = new Rodeur();
                    System.out.println("Le joueur "+x+" est un Rodeur");
                    break;
            }
        }
    }
}
