package com.ibm.academia.restapi.universidad.servicios;


import com.ibm.academia.restapi.universidad.excepciones.NotFoundException;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restapi.universidad.repositorios.PabellonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO
{

	public PabellonDAOImpl(PabellonRepository pabellonRepository) {
		super(pabellonRepository);
	}


	@Override
	public Iterable<Pabellon> findPabellonbyLocalidadAfter(String localidad) {
		return ((PabellonRepository)repository).findPabellonbyLocalidadAfter(localidad);
	}

	@Override
	public Iterable<Pabellon> findPabellonbyNombreAfter(String nombre) {
		return ((PabellonRepository)repository).findPabellonbyNombreAfter(nombre);
	}
	@Override
	@Transactional
	public Pabellon actualizar(Long pabellonId, Pabellon pabellon) {
		Optional<Pabellon> oPabellon = repository.findById(pabellonId);

		if(!oPabellon.isPresent())
			throw new NotFoundException(String.format("El pabellón con id: %d no existe", pabellonId));

		Pabellon pabellonActualizado = null;

		oPabellon.get().setNombre(pabellon.getNombre());
		oPabellon.get().setMetrosCuadrados(pabellon.getMetrosCuadrados());

		pabellonActualizado = repository.save(oPabellon.get());

		return pabellonActualizado;
	}
}


































