package com.khamchouche.tourner;

import java.util.ArrayList;
import java.util.List;

public class Tourner {

    public static String tourner(int fois) {
        String[] orientation = {"nord", "est", "sud", "ouest"};
        //si le jeu tourne du mauvais sens et trouve donc des valeurs négatives
        if (fois < 0) {
            return "erreur";
        } else
        {
            //retourner le reste de la divison defois par la taille de orientation pour rester dans les bornes
            return orientation[fois % orientation.length];
        }

    }
}

