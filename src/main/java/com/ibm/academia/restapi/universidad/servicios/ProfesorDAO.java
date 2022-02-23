package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Profesor;

public interface ProfesorDAO extends PersonaDAO
{
    //@Query("select p from Profesor p join fetch p.carrera c where c.nombre = ?2")
    public Iterable<Profesor> findProfesoresByCarrera(String carrera);
}