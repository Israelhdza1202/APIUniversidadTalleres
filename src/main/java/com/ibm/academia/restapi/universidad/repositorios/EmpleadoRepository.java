package com.ibm.academia.restapi.universidad.repositorios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("repositorioEmpleado")
public interface EmpleadoRepository extends PersonaRepository
{
    //@Query( " select e de Empleado e when e.tipo_empleado como %?1% " )
    public  Iterable<Empleado> findEmpleadoByTipoEmpleado (TipoEmpleado tipoEmpleado );
}