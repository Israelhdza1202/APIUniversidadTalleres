package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

public interface PabellonDAO extends GenericoDAO<Pabellon>
{
    //@Query("select p from Pabellon a where upper(a.localidad) like upper(&?1%)")
    public Iterable<Pabellon> findPabellonbyLocalidadAfter(String localidad);

    //@Query("select p from Pabellon a where upper(a.nombre) like upper(&?1%)")
    public Iterable<Pabellon> findPabellonbyNombreAfter(String nombre);
}