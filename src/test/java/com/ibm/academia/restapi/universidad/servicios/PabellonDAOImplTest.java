package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restapi.universidad.repositorios.PabellonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class PabellonDAOImplTest {

    PabellonDAO pabellonDAO;
    PabellonRepository pabellonRepository;

    @BeforeEach
    void setUp(){
        pabellonRepository = mock(PabellonRepository.class);
        pabellonDAO = new PabellonDAOImpl(pabellonRepository);
    }

    @Test
    @DisplayName("Test:buscar Pabellon por localidad")
    void findPabellonbyLocalidadAfter()
    {

        List<Pabellon> expected = (List<Pabellon>) pabellonRepository.findPabellonbyLocalidadAfter("CDMX");
        //Then
        assertThat(expected.size() == 1).isFalse();
    }

    @Test
    @DisplayName("Test:buscar Pabellon por nomnre")
    void findPabellonbyNombreAfter()
    {

        List<Pabellon> expected = (List<Pabellon>) pabellonRepository.findPabellonbyNombreAfter("Ciudadde Mexico");
        //Then
        assertThat(expected.size() == 1).isFalse();
    }
}