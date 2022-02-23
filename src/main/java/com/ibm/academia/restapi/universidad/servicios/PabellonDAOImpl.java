package com.ibm.academia.restapi.universidad.servicios;


import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restapi.universidad.repositorios.PabellonRepository;
import org.springframework.stereotype.Service;

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
}


































