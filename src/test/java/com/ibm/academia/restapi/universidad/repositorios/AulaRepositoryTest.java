package com.ibm.academia.restapi.universidad.repositorios;

import com.ibm.academia.restapi.universidad.datos.DatosDummy;
import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron.PIZARRON_BLANCO;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class AulaRepositoryTest {
    @Autowired
    private AulaRepository aulaRepository;

    @BeforeEach
    void setUp(){
        aulaRepository.save(DatosDummy.aula01());

    }

    @AfterEach
    void teaDown(){
        aulaRepository.deleteAll();
    }

    @Test
    @DisplayName("Test:buscar Aula por TipoPizarron")
    void findAulabyTipoPizarronAfter() {
        List<Aula> expected = (List<Aula>) aulaRepository.findAulabyTipoPizarronAfter(PIZARRON_BLANCO);
        //Then
        assertThat(expected.size() == 1).isTrue();
    }

    @Test
    @DisplayName("Test:buscar Aula por nomnre Pabellon")
    void findAulabyNombrePabellonAfter() {
        List<Aula> expected = (List<Aula>) aulaRepository.findAulabyNombrePabellonAfter("Ciudad de Mexico");
        //Then
        assertThat(expected.size() == 1).isTrue();
    }

    @Test
    @DisplayName("Test:buscar Aula por NumeroAula")
    void findAulabyNumeroAulaAfter() {
        List<Aula> expected = (List<Aula>) aulaRepository.findAulabyNumeroAulaAfter(101);
        //Then
        assertThat(expected.size() == 1).isTrue();
    }

}