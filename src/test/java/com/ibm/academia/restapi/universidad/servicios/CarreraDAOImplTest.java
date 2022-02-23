package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.repositorios.CarreraRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.ibm.academia.restapi.universidad.datos.DatosDummy.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class CarreraDAOImplTest {

    CarreraDAO carreraDAO;
    CarreraRepository carreraRepository;

    @BeforeEach
    void setUp(){
        carreraRepository = mock(CarreraRepository.class);
        carreraDAO = new CarreraDAOImpl(carreraRepository);
    }

    @Test
    @DisplayName("Test:buscar carrera por nomnre")
    void findCarrerasByNombreContains() {
        //Givem
        String nombreCarrera ="Ingenieria";
        when(carreraRepository.findCarrerasByNombreContains(nombreCarrera))
                .thenReturn(Arrays.asList(carrera01(),carrera03()));
        //When
        List<Carrera> expected = (List<Carrera>) carreraDAO.findCarrerasByNombreContains(nombreCarrera);
        //Then
        assertThat(expected.get(0)).isEqualTo(carrera01());
        assertThat(expected.get(1)).isEqualTo(carrera03());

        verify(carreraRepository).findCarrerasByNombreContains(nombreCarrera);


    }

    @Test
    @DisplayName("Test:buscar carrera por nomnre")
    void findCarrerasByNombreContainsIgnoreCase() {
        //Givem
        String nombreCarrera ="Ingenieria";
        when(carreraRepository.findCarrerasByNombreContainsIgnoreCase(nombreCarrera))
                .thenReturn(Arrays.asList(carrera01(),carrera03()));
        //When
        List<Carrera> expected = (List<Carrera>) carreraDAO.findCarrerasByNombreContainsIgnoreCase(nombreCarrera);
        //Then
        assertThat(expected.get(0)).isEqualTo(carrera01());
        assertThat(expected.get(1)).isEqualTo(carrera03());

        verify(carreraRepository).findCarrerasByNombreContainsIgnoreCase(nombreCarrera);
    }

    @Test
    @Disabled
    @DisplayName("Test:buscar carrera por Cantidad anios")
    void findCarrerasByCantidadAniosAfter() {
        //Givem

        Integer cantidadAnios=4;
        when(carreraRepository.findCarrerasByCantidadAniosAfter(cantidadAnios))
                .thenReturn(Arrays.asList(carrera01(),carrera03()));
        //When
        List<Carrera> expected = (List<Carrera>) carreraDAO.findCarrerasByCantidadAniosAfter(cantidadAnios);
        //Then
        assertThat(expected.get(0)).isEqualTo(carrera01());
        assertThat(expected.get(1)).isEqualTo(carrera03());

        verify(carreraRepository).findCarrerasByCantidadAniosAfter(cantidadAnios);
    }

    @Test
    @Disabled
    @DisplayName("Test:buscar carrera por Profesor nombre y apellido")
    void buscarCarrerasPorProfesorNombreYApellido() {

        String nombreProfesor ="Martin";
        String apellidoProfesor ="Axacar";

        List<Carrera> expected = (List<Carrera>) carreraRepository.buscarCarrerasPorProfesorNombreYApellido(nombreProfesor, apellidoProfesor);

        //Then
        assertThat(expected.size() == 1).isFalse();

    }
}






















