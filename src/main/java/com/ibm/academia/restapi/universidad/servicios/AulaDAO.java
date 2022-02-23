package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;

public interface AulaDAO extends GenericoDAO<Aula>
{
    //@Query("select a from Aula a where upper(a.tipo_pizarron) like upper(&?1%)")
    public Iterable<Aula> findAulabyTipoPizarronAfter(TipoPizarron tipoPizarron);

    //@Query("select a from Aula a  where upper(a.pabellon) like upper(&?1%)")
    public Iterable<Aula> findAulabyNombrePabellonAfter(String nombre);

    //@Query("select a from Aula a  where upper(a.numero_aula) like upper(&?1%)")
    public Iterable<Aula> findAulabyNumeroAulaAfter(Integer numeroAula);
}