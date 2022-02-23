package com.ibm.academia.restapi.universidad.servicios;


import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Empleado;
import com.ibm.academia.restapi.universidad.repositorios.EmpleadoRepository;
import com.ibm.academia.restapi.universidad.repositorios.PabellonRepository;
import com.ibm.academia.restapi.universidad.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoDAOImpl extends PersonaDAOImpl implements EmpleadoDAO
{

	@Autowired
	public EmpleadoDAOImpl(@Qualifier("repositorioEmpleado")PersonaRepository repository)
	{
		super(repository);
	}

	@Override
	public Iterable<Empleado> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado) {
		return ((EmpleadoRepository)repository).findEmpleadoByTipoEmpleado(tipoEmpleado);
	}
}