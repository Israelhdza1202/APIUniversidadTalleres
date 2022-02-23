package com.ibm.academia.restapi.universidad.repositorios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Profesor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("repositorioProfesor")
public interface ProfesorRepository extends PersonaRepository
{
	@Query("select p from Profesor p join fetch p.carreras c  where c.nombre = ?1")
	public Iterable<Profesor> findProfesoresByCarrera(String carrera);

	//insert select delete update//


}