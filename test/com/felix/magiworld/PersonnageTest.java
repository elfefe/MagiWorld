package com.felix.magiworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    @Test
    public void les_phrases_sont_lu_dans_texteCaracteristique() {
        String []texteCaracteristique = new String[]{
                "Phrase de texte",
                "Seconde phrase"
        };
        assertEquals("Seconde phrase",texteCaracteristique[1]);
    }

    @Test
    public void Le_niveau_et_les_caracteristiques_sequilibrent_bien() {
        int niveau = 10, force = 3, intell = 4, agi = 3;
        assertEquals(niveau,force+intell+agi);
    }

}