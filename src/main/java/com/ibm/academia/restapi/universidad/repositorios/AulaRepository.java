package com.ibm.academia.restapi.universidad.repositorios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AulaRepository extends CrudRepository<Aula, Long>
{
    @Query("select a from Aula a where a.tipoPizarron = ?1")
    public Iterable<Aula> findAulabyTipoPizarronAfter(TipoPizarron tipoPizarron);

    @Query("select a from Aula a join fetch a.pabellon p  where p.nombre = ?1")
    public Iterable<Aula> findAulabyNombrePabellonAfter(String nombre);

    @Query("select a from Aula a where a.numeroAula = ?1")
    public Iterable<Aula> findAulabyNumeroAulaAfter(Integer numeroAula);
}
