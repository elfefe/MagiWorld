package com.felix.magiworld;

import java.util.*;

public class Mage extends Personnage {
    public Mage() {
        int taVie = sc.nextInt();
        setVie(taVie);
        int taForce = sc.nextInt();
        setForce(taForce);
        int tonAgilite = sc.nextInt();
        setAgilite(tonAgilite);
        int tonIntelligence = sc.nextInt();
        setIntelligence(tonIntelligence);
    }

    @Override
    void attaqueBasique(Personnage ennemi) {
        System.out.println("Vous lancez une boule de feu !");

    }

    @Override
    void attaqueSpecial(Personnage ennemi) {
        System.out.println("Vous utilisez soin !");

    }
}
