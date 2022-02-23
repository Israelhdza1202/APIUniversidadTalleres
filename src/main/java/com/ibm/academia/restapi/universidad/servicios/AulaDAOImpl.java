package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.repositorios.AulaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO
{
	@Autowired
	public AulaDAOImpl(AulaRepository aulaRepository) {
		super(aulaRepository);
	}


	@Override
	public Iterable<Aula> findAulabyTipoPizarronAfter(TipoPizarron tipoPizarron) {
		return ((AulaRepository)repository).findAulabyTipoPizarronAfter(tipoPizarron);
	}

	@Override
	public Iterable<Aula> findAulabyNombrePabellonAfter(String nombre) {
		return ((AulaRepository)repository).findAulabyNombrePabellonAfter(nombre);
	}

	@Override
	public Iterable<Aula> findAulabyNumeroAulaAfter(Integer numeroAula) {
		return ((AulaRepository)repository).findAulabyNumeroAulaAfter(numeroAula);
	}
}