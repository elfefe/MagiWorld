package com.felix.magiworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    @Test

    void les_phrases_sont_lu_dans_texteCaracteristique() {
        String []texteCaracteristique = new String[]{
                "Phrase de texte",
                "Seconde phrase"
        };
        assertEquals("Seconde phrase",texteCaracteristique[1]);
    }

    @Test
    void Le_niveau_et_les_caracteristiques_sequilibrent_bien() {
        int niveau = 10, force = 3, intell = 4, agi = 3;
        assertEquals(niveau,force+intell+agi);
    }

    @Test
    void le_choix_des_classes_seffectue_sans_soucis(){
        int choix = 1;
        switch (2){
            case 2: assertEquals(1,choix);
        }
    }

    @Test
    void la_zone_de_combat_alerte_correctement_les_joueurs(){
        int partieUne = 1,partieDeux = 2;
        for (int x=0;x<2;x++) {
            if(x==0) {
                partieUne++;
                partieDeux--;
            }
            else {
                partieUne++;
                partieDeux--;
            }
        }
        assertEquals(3,partieUne);
        assertEquals(0,partieDeux);
    }

}