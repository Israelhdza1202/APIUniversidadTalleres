package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Empleado;
import com.ibm.academia.restapi.universidad.repositorios.EmpleadoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado.ADMINISTRATIVO;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class EmpleadoDAOImplTest {

    EmpleadoDAO empleadoDAO;
    EmpleadoRepository empleadoRepository;


    @BeforeEach
    void setUp(){
        empleadoRepository = mock(EmpleadoRepository.class);
        empleadoDAO = new EmpleadoDAOImpl(empleadoRepository);
    }

    @Test
    @DisplayName("Test:buscar carrera por nomnre")
    void findEmpleadoByTipoEmpleado() {

        List<Empleado> expected = (List<Empleado>) empleadoRepository.findEmpleadoByTipoEmpleado(ADMINISTRATIVO);

        //Then
        assertThat(expected.size() == 1).isFalse();

    }
}