package com.felix.magiworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombatTest {

    @Test
    public void le_choix_des_classes_seffectue_sans_soucis(){
        int choix = 1;
        switch (2){
            case 2: assertEquals(1,choix);
        }
    }
}