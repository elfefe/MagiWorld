package com.felix.magiworld;

public class Main {
    public static void main(String[] args) {
        Personnage premierJoueur = new Mage();
        Personnage secondJoueur = new Mage();
        premierJoueur.attaqueBasique(secondJoueur);
        secondJoueur.attaqueSpecial(premierJoueur);
    }
}
