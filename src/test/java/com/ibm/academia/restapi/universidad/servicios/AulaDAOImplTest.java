package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.repositorios.AulaRepository;
import com.ibm.academia.restapi.universidad.repositorios.CarreraRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron.PIZARRON_TIZA;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class AulaDAOImplTest {

    AulaDAO aulaDAO;
    AulaRepository aulaRepository;

    @BeforeEach
    void setUp(){
        aulaRepository = mock(AulaRepository.class);
        aulaDAO = new AulaDAOImpl(aulaRepository);
    }
    @Test
    void findAulabyTipoPizarronAfter() {
        List<Aula> expected = (List<Aula>) aulaRepository.findAulabyTipoPizarronAfter(PIZARRON_TIZA);

        //Then
        assertThat(expected.size() == 1).isFalse();

    }

    @Test
    void findAulabyNombrePabellonAfter() {
        List<Aula> expected = (List<Aula>) aulaRepository.findAulabyNombrePabellonAfter("SISTEMAS");

        //Then
        assertThat(expected.size() == 1).isFalse();
    }

    @Test
    void findAulabyNumeroAulaAfter() {
        List<Aula> expected = (List<Aula>) aulaRepository.findAulabyNumeroAulaAfter(101);

        //Then
        assertThat(expected.size() == 1).isFalse();

    }
}