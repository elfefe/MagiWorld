package com.felix.magiworld;

public class Mage extends Personnage {
    @Override
    void attaqueBasique(Personnage ennemi) {
        System.out.println("Vous lancez une boule de feu !");

    }

    @Override
    void attaqueSpecial(Personnage ennemi) {
        System.out.println("Vous utilisez soin !");

    }
}
