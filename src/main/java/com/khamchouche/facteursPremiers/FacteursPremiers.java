package com.khamchouche.facteursPremiers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FacteursPremiers {

    public static List<Integer> generate(int nombre) {
        List<Integer> listePremiers = new ArrayList<>();
        if (nombre <= 1) {
            return listePremiers; // pas de facteurs premiers pour 0, 1 ou négatif
        }

        //premier nbpremier=2
        int diviseur = 2;
        //tant que nombre est sup a 1
        while (nombre > 1) {
            //tant que le reste de nombre/2 est egale a 0
            while (nombre % diviseur == 0) {
                //jajoute a ma liste le diviseur
                listePremiers.add(diviseur);

                nombre /= diviseur;
            }
            //je change de nombre premier car on a deja tout exploiter du 2
            diviseur++;
        }

        return listePremiers;
    }

    }

