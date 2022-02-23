package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Profesor;
import com.ibm.academia.restapi.universidad.repositorios.CarreraRepository;
import com.ibm.academia.restapi.universidad.repositorios.ProfesorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.ibm.academia.restapi.universidad.datos.DatosDummy.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProfesorDAOImplTest {

    ProfesorDAO profesorDAO;
    ProfesorRepository profesorRepository;

    @BeforeEach
    void setUp(){
        profesorRepository = mock(ProfesorRepository.class);
        profesorDAO = new ProfesorDAOImpl(profesorRepository);
    }

    @Test
    @DisplayName("Test:buscar Profesores por Carrera")
    void findProfesoresByCarrera() {

        List<Profesor> expected = (List<Profesor>) profesorRepository.findProfesoresByCarrera("Ingenieria en sistemas");
        //Then
        assertThat(expected.size() == 1).isTrue();
    }
}