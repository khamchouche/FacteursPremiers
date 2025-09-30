package com.khamchouche.tourner;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TournerTest {
    /*scénarios exceptionnel:
    -Orientation initiale autre que "Nord"
    -Tourne dans le mauvais sens
    -Ne change pas d'orientation apres avoir tourner

    Scénario normal:
    -tourne à 1 est retourne "est"
    -tourne à 2 est retourne "sud"
    -tourne à 3 est retourne "ouest"
    -tourne à 4 est retourne "nord"
     */


    @Test
    void devrait_retourner_est_si_tourner_est_a_1()
    {
        //GIVEN
        int tournerId = 1;
        //WHEN
        String resultat= Tourner.tourner(tournerId);
        //THEN
        assertThat(resultat).isEqualTo("est");

    }
    @Test
    void devrait_retourner_sud_si_tourner_est_a_2()
    {
        //GIVEN
        int tournerId = 2;
        //WHEN
        String resultat= Tourner.tourner(tournerId);
        //THEN
        assertThat(resultat).isEqualTo("sud");

    }
    @Test
    void devrait_retourner_ouest_si_tourner_est_a_3()
    {
        //GIVEN
        int tournerId = 3;
        //WHEN
        String resultat= Tourner.tourner(tournerId);
        //THEN
        assertThat(resultat).isEqualTo("ouest");

    }
    @Test
    void devrait_re_retourner_nord_si_tourner_est_a_4()
    {
        //GIVEN
        int tournerId = 4;
        //WHEN
        String resultat= Tourner.tourner(tournerId);
        //THEN
        assertThat(resultat).isEqualTo("nord");

    }
    @Test
    void devrait_retourner_erreurs_si_le_sens_n_est_pas_le_bon()
    {
        //GIVEN
        int tournerId=-1;
        //WHEN
        String resultat= Tourner.tourner(tournerId);
        //THEN
        assertThat(resultat).isEqualTo("erreur");

    }
}
