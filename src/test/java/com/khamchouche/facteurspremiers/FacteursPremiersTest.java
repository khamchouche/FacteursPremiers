package com.khamchouche.facteurspremiers;

import static org.assertj.core.api.Assertions.assertThat;

import com.khamchouche.facteursPremiers.FacteursPremiers;
import org.junit.jupiter.api.Test;

import java.util.List;


public class FacteursPremiersTest {


   /* @Test
    void devrait_generer_la_liste_des_diviseurs_premier_dun_nombre() {
        //GIVEN
        int nbEntier = 6;

        //WHEN

        List<Integer> listePremiers6 = FacteursPremiers.generate(nbEntier);
        List<Integer> listePremiers8 = FacteursPremiers.generate(8);

        //THEN
        assertThat(listePremiers6).containsExactlyInAnyOrder(2, 3);
        assertThat(listePremiers8).containsExactlyInAnyOrder(2, 2, 2);
    }

    @Test
    void devrait_retourner_le_meme_nombre_si_nb_est_premier() {
        //GIVEN
        int nbEntier = 2;
        //WHEN
        List<Integer> listePremiers2 = FacteursPremiers.generate(2);
        //THEN
        assertThat(listePremiers2).containsExactlyInAnyOrder(2);
    }*/

    @Test
    void devrait_retourner_0_car_le_nombre_1_na_pas_de_nbPremier() {
        //GIVEN
        int nbEntier = 1;

        //WHEN
        List<Integer> listePremiers = FacteursPremiers.generate(nbEntier);
        //THEN
        assertThat(listePremiers).isEqualTo(0);
    }

    //TEST DETAILLES
    @Test
    void devrait_retourner_le_meme_nombre_si_nb_est_2() {
        //GIVEN
        int nbEntier = 2;
        //WHEN
        List<Integer> listePremiers2 = FacteursPremiers.generate(2);
        //THEN
        assertThat(listePremiers2).containsExactlyInAnyOrder(2);
    }
@Test
    void devrait_retourner_le_meme_nombre_si_nb_est_6() {
        //GIVEN
        int nbEntier = 6;
        //WHEN
        List<Integer> listePremiers = FacteursPremiers.generate(nbEntier);
        //THEN
        assertThat(listePremiers).containsExactlyInAnyOrder(2,3);
    }
    @Test
    void devrait_retourner_le_meme_nombre_si_nb_est_8() {
        //GIVEN
        int nbEntier = 8;
        //WHEN
        List<Integer> listePremiers = FacteursPremiers.generate(nbEntier);
        //THEN
        assertThat(listePremiers).containsExactlyInAnyOrder(2,2,2);
    }

}
