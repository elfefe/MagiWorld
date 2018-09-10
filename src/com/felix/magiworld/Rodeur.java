package com.felix.magiworld;

public class Rodeur extends Personnage {
    public Rodeur(int joueur) {
        setClasse("Rodeur",joueur);
        creationDesPersonnages();
    }
    @Override
    void attaqueBasique(Personnage ennemi) {
        System.out.println("Vous effectuez un tir à l'arc !");

    }

    @Override
    void attaqueSpecial(Personnage ennemi) {
        System.out.println("Vous utilisez votre concentration !");

    }


}
