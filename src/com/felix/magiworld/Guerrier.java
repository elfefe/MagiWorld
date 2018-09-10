package com.felix.magiworld;

public class Guerrier extends Personnage {
    public Guerrier(){
        creationDesPersonnages();
    }
    @Override
    void attaqueBasique(Personnage ennemi) {
        System.out.println("Vous donnez coup d'épée !");

    }

    @Override
    void attaqueSpecial(Personnage ennemi) {
        System.out.println("Vous infligez un coup de rage !");

    }
}
