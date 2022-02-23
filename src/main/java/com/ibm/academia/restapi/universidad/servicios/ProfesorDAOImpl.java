package com.ibm.academia.restapi.universidad.servicios;


import com.ibm.academia.restapi.universidad.modelo.entidades.Profesor;
import com.ibm.academia.restapi.universidad.repositorios.PersonaRepository;
import com.ibm.academia.restapi.universidad.repositorios.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProfesorDAOImpl extends PersonaDAOImpl implements ProfesorDAO
{

	@Autowired
	public ProfesorDAOImpl(@Qualifier("repositorioProfesor")PersonaRepository repository)
	{
		super(repository);
	}

	@Override
	public Iterable<Profesor> findProfesoresByCarrera(String carrera) {
		return ((ProfesorRepository)repository).findProfesoresByCarrera(carrera);
	}
}