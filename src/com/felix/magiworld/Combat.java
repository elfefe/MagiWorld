package com.felix.magiworld;

import java.util.Scanner;

public class Combat {
    private Scanner sc = new Scanner(System.in);
    private Personnage[] joueur = new Personnage[2];

    public Combat(){
        creationdesPersonnages();
    }
    public void creationdesPersonnages(){
        for (int x = 0;x<2;x++) {
            System.out.println("Choisissez la classe de votre personnage:\n" + "1 - Mage  2 - Guerrier  3 - Rodeur");
            int choixClasse = sc.nextInt();
            switch (choixClasse) {
                case 1:
                    joueur[x] = new Mage(x+1);
                    break;
                case 2:
                    joueur[x] = new Guerrier(x+1);
                    break;
                case 3:
                    joueur[x] = new Rodeur(x+1);
                    break;
            }
        }
    }


}
