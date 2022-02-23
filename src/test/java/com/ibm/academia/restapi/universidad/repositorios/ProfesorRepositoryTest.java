package com.ibm.academia.restapi.universidad.repositorios;

import com.ibm.academia.restapi.universidad.datos.DatosDummy;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Profesor;
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
class ProfesorRepositoryTest {

    @Autowired
    private ProfesorRepository profesorRepository;
    @BeforeEach
    void setUp(){
       profesorRepository.save(DatosDummy.profesor01());
       profesorRepository.save(DatosDummy.profesor02());
    }

    @AfterEach
    void teaDown(){
        profesorRepository.deleteAll();
    }

    @Test
    @DisplayName("Test:buscarProfesorPorNombre")
    void findProfesoresByCarrera() {

        List<Profesor> expected = (List<Profesor>) profesorRepository.findProfesoresByCarrera("Ingenieria Industrial");

        //Then
        assertThat(expected.size() == 1).isTrue();
    }
}