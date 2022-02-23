package com.ibm.academia.restapi.universidad.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.restapi.universidad.excepciones.NotFoundException;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.servicios.CarreraDAO;

@RestController
@RequestMapping("/restapi")
public class CarreraController
{
	@Autowired
	private CarreraDAO carreraDao;

	@GetMapping("/carreras/lista")
	public List<Carrera> listarTodas()
	{
		List<Carrera> carreras = (List<Carrera>) carreraDao.buscarTodos();
		return carreras;
	}

	@GetMapping("/carrera/carreraId/{carreraId}")
	public ResponseEntity<?> buscarPorId(@PathVariable Long carreraId)
	{
		Optional<Carrera> oCarrera = carreraDao.buscarPorId(carreraId);

		if(!oCarrera.isPresent())
			throw new NotFoundException(String.format("La carrera con id: %d no existe", carreraId));

		return new ResponseEntity<Carrera>(oCarrera.get(), HttpStatus.OK);
	}
}















