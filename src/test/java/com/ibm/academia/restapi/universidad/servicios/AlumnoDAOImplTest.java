package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Alumno;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.repositorios.AlumnoRepository;
import com.ibm.academia.restapi.universidad.repositorios.AulaRepository;
import com.ibm.academia.restapi.universidad.repositorios.CarreraRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class AlumnoDAOImplTest {
    AlumnoDAO alumnoDAO;
    AlumnoRepository alumnoRepository;

    @BeforeEach
    void setUp(){
        alumnoRepository = mock(AlumnoRepository.class);
        alumnoDAO = new AlumnoDAOImpl(alumnoRepository);
    }
    @Test
    void buscarAlumnosPorNombreCarrera()
    {

      //  List<Alumno> expected = (List<Alumno>) AlumnoRepository.buscarAlumnosPorNombreCarrera("Ingenieria en sistemas");


        //Then
       // assertThat(expected.size() == 1).isFalse();
    }
}