package com.felix.magiworld;

import java.util.*;

public class Mage extends Personnage {
    public Mage(int joueur) {
        setClasse("Mage",joueur);
        creationDesPersonnages();
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
