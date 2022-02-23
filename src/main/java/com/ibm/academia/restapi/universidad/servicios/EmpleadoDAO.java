package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Empleado;

public interface EmpleadoDAO extends PersonaDAO
{
    //@Query( " select e de Empleado e when e.tipo_empleado como %?1% " )
    public  Iterable<Empleado> findEmpleadoByTipoEmpleado (TipoEmpleado tipoEmpleado );
}