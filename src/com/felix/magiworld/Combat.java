package com.felix.magiworld;

import java.util.Scanner;

public class Combat {
    private Scanner sc = new Scanner(System.in);
    private Personnage[] joueur = new Personnage[2];

    public Combat(){
        creationDesPersonnages();
        zoneDeCombat();
    }
    private void creationDesPersonnages(){
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
    private void zoneDeCombat(){
        int x=0,y=1;
        while (joueur[x].caracteristique[4] > 0 && joueur[y].caracteristique[4] > 0) {
            for (int tour = 0; tour < 2; tour++) {
                if (tour == 1) {
                    x = 1;
                    y = 0;
                } else if (tour == 0) {
                    x = 0;
                    y = 1;
                }
                System.out.println("Joueur" + joueur[x].joueur + " (" + joueur[x].caracteristique[4] + ") " + "veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spécial)");
                int attaque = sc.nextInt();
                if (attaque == 1)
                    joueur[x].attaqueBasique(joueur[y]);
                else if (attaque == 2)
                    joueur[x].attaqueSpecial(joueur[y]);
                if (joueur[x].caracteristique[4] <= 0 || joueur[y].caracteristique[4] <= 0){
                    System.out.println("Joueur " + x + " a perdu3");
                    tour=2;}
            }
        }
    }
}
