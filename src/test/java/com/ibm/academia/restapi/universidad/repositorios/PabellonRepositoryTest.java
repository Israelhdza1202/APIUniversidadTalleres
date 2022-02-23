package com.ibm.academia.restapi.universidad.repositorios;

import com.ibm.academia.restapi.universidad.datos.DatosDummy;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class PabellonRepositoryTest {

    @Autowired
    private PabellonRepository pabellonRepository;

    @BeforeEach
    void setUp(){
        pabellonRepository.save(DatosDummy.pabellon01());
        pabellonRepository.save(DatosDummy.pabellon02());
    }

    @AfterEach
    void teaDown(){
        pabellonRepository.deleteAll();
    }

    @Test
    @DisplayName("Test:buscar Pabellon por Localidad")
    void findPabellonbyLocalidadAfter()
    {

        List<Pabellon> expected = (List<Pabellon>) pabellonRepository.findPabellonbyLocalidadAfter("Miguel Hidalgo");

        //Then
        assertThat(expected.size() == 1).isTrue();
    }

    @Test
    void findPabellonbyNombreAfter()
    {
        List<Pabellon> expected = (List<Pabellon>) pabellonRepository.findPabellonbyNombreAfter("CDMX");

        //Then
        assertThat(expected.size() == 1).isTrue();
    }
}