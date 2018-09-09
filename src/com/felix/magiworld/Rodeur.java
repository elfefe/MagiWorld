package com.felix.magiworld;

public class Rodeur extends Personnage {
    @Override
    void attaqueBasique(Personnage ennemi) {
        System.out.println("Vous faites un tir à l'arc !");

    }

    @Override
    void attaqueSpecial(Personnage ennemi) {
        System.out.println("Vous utilisez votre concentration !");

    }


}
