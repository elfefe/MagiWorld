package com.felix.magiworld;

public class Guerrier extends Personnage {
    public Guerrier(int joueur) {
        setClasseJoueur("Guerrier",joueur);
        ajoutDesPointsDeCaracteristiques();
    }
    @Override
    public void attaqueBasique(Personnage ennemi) {
        int coupdEpee = this.caracteristique[1];
        System.out.println("Vous donnez coup d'épée !");
        ennemi.caracteristique[4] -= coupdEpee;
        System.out.println("Le joueur"+ennemi.joueur+" perd "+coupdEpee+" point de vie !");
    }

    @Override
    public void attaqueSpecial(Personnage ennemi) {
        int coupDeRage = this.caracteristique[1] * 2;
        System.out.println("Vous infligez un coup de rage !");
        ennemi.caracteristique[4] -= coupDeRage;
        this.caracteristique[4] -= this.caracteristique[1]/2;
        System.out.println("Le joueur"+ennemi.joueur+" perd "+coupDeRage+" point de vie !");
        System.out.println("Le joueur"+this.joueur+" perd "+coupDeRage/4+" point de vie !");
    }
}
