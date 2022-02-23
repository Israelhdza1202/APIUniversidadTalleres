package com.ibm.academia.restapi.universidad.datos;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.*;

import java.math.BigDecimal;

import static com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron.PIZARRON_BLANCO;

public class DatosDummy {

    public static Carrera carrera01()
    {
        return new Carrera(null, "Ingenieria en Sistemas", 50, 5, "nsegura");
    }

    public static Carrera carrera02()
    {
        return new Carrera(null, "Licenciatura en Sistemas", 45, 4, "nsegura");
    }

    public static Carrera carrera03()
    {
        return new Carrera(null, "Ingenieria Industrial", 60, 5, "nsegura");
    }
    public static Persona empleado01()
    {
        return new Empleado(null, "Lautaro", "Lopez", "25147036", "nsegura", new Direccion(), new BigDecimal("46750"), TipoEmpleado.ADMINISTRATIVO);
    }

    public static Persona empleado02()
    {
        return new Empleado(null, "Lenadro", "Lopez", "25174630", "nsegura", new Direccion(), new BigDecimal("46750.70"), TipoEmpleado.MANTENIMIENTO);
    }

    public static Persona profesor01()
    {
        return new Profesor(null, "Martin", "Axacar", "4477899", "nsegura", new Direccion(), new BigDecimal("600000"));
    }

    public static Persona profesor02()
    {
        return new Profesor(null, "Martin", "Axacar", "4227899", "nsegura", new Direccion(), new BigDecimal("600000"));
    }
    public static Persona alumno01()
    {
        return new Alumno(null, "Jhon", "Benitez", "4223715", "nsegura", new Direccion());
    }

    public static Persona alumno02()
    {
        return new Alumno(null, "Andres", "Benitez", "45233891", "nsegura", new Direccion());
    }

    public static Persona alumno03()
    {
        return new Alumno(null, "Joaquin", "Leon", "45233012", "nsegura", new Direccion());
    }

    public static Pabellon pabellon01()
    {
       return new Pabellon(null,90.5,"Ciudad de Mexico",new Direccion(),"iHernandez");
    }
    public static Pabellon pabellon02()
    {
        return new Pabellon(null,80.5,"CDMX",new Direccion(),"iHernandez");
    }
    public static Aula aula01()
    {
        return new  Aula(null, 101,"15x15",30, PIZARRON_BLANCO,"iHernandez");
    }
}

