package com.felix.magiworld;

import java.util.Scanner;

class Combat {
    private Scanner sc = new Scanner(System.in);
    private Personnage[] joueur = new Personnage[2];

    Combat(){
        creationDesPersonnages();
        zoneDeCombat();
    }
    private void creationDesPersonnages(){
        for (int x = 0;x<2;x++) {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage");
            int choixClasse = sc.nextInt();
            if (choixClasse<1 || choixClasse>3) {
                System.out.println("Veuillez choisir une des classes proposées");
                x--;
            }else {
                switch (choixClasse) {
                    case 1:
                        joueur[x] = new Guerrier(x + 1);
                        break;
                    case 2:
                        joueur[x] = new Rodeur(x + 1);
                        break;
                    case 3:
                        joueur[x] = new Mage(x + 1);
                        break;
                }
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
                int leJoueur = x+1, ladversaire = y+1;
                System.out.println("Joueur" + leJoueur + " (" + joueur[x].caracteristique[4] + " Vitalité) " + "veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spécial)");
                int attaque = sc.nextInt();
                if (attaque < 1 || attaque > 2) {
                    System.out.println("Cette attaque n'hexiste pas");
                    tour--;
                }else {
                    if (attaque == 1)
                        joueur[x].attaqueBasique(joueur[y]);
                    else
                        joueur[x].attaqueSpecial(joueur[y]);
                    if (joueur[x].caracteristique[4] <= 0 || joueur[y].caracteristique[4] <= 0) {
                        System.out.println("Joueur " + ladversaire + " a perdu !");
                        tour = 2;
                    }
                }
            }
        }
    }
}
