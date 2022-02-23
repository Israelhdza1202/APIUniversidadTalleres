package com.ibm.academia.restapi.universidad.repositorios;

import com.ibm.academia.restapi.universidad.datos.DatosDummy;
import com.ibm.academia.restapi.universidad.modelo.entidades.Empleado;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado.ADMINISTRATIVO;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class EmpleadoRepositoryTest {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @BeforeEach
    void setUp(){
        empleadoRepository.save(DatosDummy.empleado01());
        empleadoRepository.save(DatosDummy.empleado02());
    }

    @AfterEach
    void teaDown(){
        empleadoRepository.deleteAll();
    }

    @Test
    @DisplayName("Test:buscar Empleado por TipoEmpleado")
    void findEmpleadoByTipoEmpleado() {
        List<Empleado> expected = (List<Empleado>) empleadoRepository.findEmpleadoByTipoEmpleado(ADMINISTRATIVO);

        //Then
        assertThat(expected.size() == 1).isTrue();
    }
}