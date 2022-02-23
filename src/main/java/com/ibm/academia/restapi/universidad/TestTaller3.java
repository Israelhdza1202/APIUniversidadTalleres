package com.ibm.academia.restapi.universidad;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.*;
import com.ibm.academia.restapi.universidad.servicios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

import static com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado.ADMINISTRATIVO;
import static com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron.PIZARRON_BLANCO;

@Component
public class TestTaller3 implements CommandLineRunner
{
	@Autowired
	private ProfesorDAO profesorDao;
	
	@Autowired
	private EmpleadoDAO empleadoDao;

	@Autowired
	private CarreraDAO carrreraDao;

	@Autowired
	private AulaDAO aulaDao;

	@Autowired
	private PabellonDAO pabellonDao;

	@Autowired
	@Qualifier("alumnoDAOImpl")
	private PersonaDAO personaDao;
	
	@Override
	public void run(String... args) throws Exception 
	{

		//TODO TALLER 3

		/*Iterable<Profesor> ProfesoresPorCarrera = profesorDao.findProfesoresByCarrera("sistemas");
		ProfesoresPorCarrera.forEach(System.out::println);*/

		/*Iterable<Empleado> EmpleadoPorTipoEmpleado = empleadoDao.findEmpleadoByTipoEmpleado(ADMINISTRATIVO);
		EmpleadoPorTipoEmpleado.forEach(System.out::println);*/

		/*Iterable<Carrera> CarreraPorProfesorNombreApellido = carrreraDao.buscarCarrerasPorProfesorNombreYApellido("Octavio", "Perez");
		CarreraPorProfesorNombreApellido.forEach(System.out::println);*/

		/*Iterable<Aula> AulasPorTipoDePizarron = aulaDao.findAulabyTipoPizarronAfter(PIZARRON_BLANCO);
		AulasPorTipoDePizarron.forEach(System.out::println);*/

		/*Iterable<Aula> AulasPorNombrePabellon = aulaDao.findAulabyNombrePabellonAfter("CDMX");
		AulasPorNombrePabellon.forEach(System.out::println);*/

		/*Iterable<Aula> AulasPorNumeroAula = aulaDao.findAulabyNumeroAulaAfter(101);
		AulasPorNumeroAula.forEach(System.out::println);*/

		/*Iterable<Pabellon> PabellonPorLocalidad = pabellonDao.findPabellonbyLocalidadAfter("Miguel Hidalgo");
		PabellonPorLocalidad.forEach(System.out::println);*/

		/*Iterable<Pabellon> PabellonPorNombrePabellon = pabellonDao.findPabellonbyNombreAfter("Ciudad de Mexico");
		PabellonPorNombrePabellon.forEach(System.out::println);*/

		//TODO CRUD POR CADA ENTIDAD
		//TODO INSERT

		/*BigDecimal sueldoProfesor = new BigDecimal("30000");
		Direccion direccionProfesor = new Direccion("Calle olivar", "10", "2865", "16", "2", "Miguel Hidalgo");
		Profesor matematicasAplicadas =new Profesor(null,"Octavio","Perez","7215","ihernandez",direccionProfesor, sueldoProfesor);
		personaDao.guardar(matematicasAplicadas);
		System.out.println(matematicasAplicadas.toString());*/


		/*BigDecimal sueldoEmpleado = new BigDecimal("30000");
		Direccion direccionEmpleado = new Direccion("Calle octavior", "25", "28225", "1", "5", "Miguel Hidalgo");
		Empleado empleadoAdministrativo =new Empleado(null,"Oscar","Torres","1215","iHernandez",direccionEmpleado,sueldoEmpleado,ADMINISTRATIVO);
		personaDao.guardar(empleadoAdministrativo);
		System.out.prin@tln(empleadoAdministrativo.toString());*/

		/*Carrera ingenieriaSistemas = new Carrera(null, "sistemas", 60, 5, "nsegura");
		Carrera carrera = carreraDao.guardar(ingenieriaSistemas);
		System.out.println(carrera.toString());*/

		/*Aula aulaSitemas = new Aula(null, 101,"15x15",30, PIZARRON_BLANCO,"iHernandez");
		Aula aula = aulaDao.guardar(aulaSitemas);
		System.out.println(aulaSitemas.toString());*/

		/*Direccion direccionPabellon = new Direccion("Av Politecnico Nacional", "259", "21125", "", "", "Condesa");
		Pabellon pabellonCDMX = new Pabellon(null,90.5,"Ciudad de Mexico",direccionPabellon,"iHernandez");
		Pabellon pabellon = pabellonDao.guardar(pabellonCDMX);
		System.out.println(pabellonCDMX.toString());*/

		//TODO CCONSULTA

		/*List<Persona> profesor =(List<Persona>) profesorDao.buscarTodos();
		profesor.forEach(System.out::println);

		List<Persona> empleado =(List<Persona>) empleadoDao.buscarTodos();
		empleado.forEach(System.out::println);

		List<Carrera> carreras =(List<Carrera>) carrreraDao.buscarTodos();
		carreras.forEach(System.out::println);

		List<Aula> aulas =(List<Aula>) aulaDao.buscarTodos();
		aulas.forEach(System.out::println);

		List<Pabellon> pabellon =(List<Pabellon>) pabellonDao.buscarTodos();
		pabellon.forEach(System.out::println);*/


		//TODO UPDATE
		/*
		Profesor matematicasAplicadas =new Profesor(null,"Octavio","Perez","7215","ihernandez",direccionProfesor, sueldoProfesor);
		Empleado empleadoAdministrativo =new Empleado(null,"Oscar","Torres","1215","iHernandez",direccionEmpleado,sueldoEmpleado,ADMINISTRATIVO);
		Aula aulaSitemas = new Aula(null, 101,"15x15",30, PIZARRON_BLANCO,"iHernandez");
		Pabellon pabellonCDMX = new Pabellon(null,90.5,"Ciudad de Mexico",direccionPabellon,"iHernandez");

		matematicasAplicadas.setApellido("Pacheco");
		System.out.println("Profesor Actualizado: " + profesorDao.buscarPorId(1L).orElse(new Profesor()).toString());
		empleadoAdministrativo.setNombre("Larry");
		System.out.println("Empleado Actualizado: " + personaDao.buscarPorId(1L).orElse(new Empleado()).toString());
		aulaSitemas.setCantidadPupitres(25);
		System.out.println("Aula Actualizado: " + aulaDao.buscarPorId(1L).orElse(new Aula()).toString());
		pabellonCDMX.setNombre("CDMX");
		System.out.println("Pabellon Actualizado: " + pabellonDao.buscarPorId(1L).orElse(new Pabellon()).toString());*/


		//TODO DELETE

		/*profesorDao.eliminarPorId(1L);
		System.out.println("Profesor Eliminado");

		empleadoDao.eliminarPorId(1L);
		System.out.println("Empleado Eliminado");

		aulaDao.eliminarPorId(1L);
		System.out.println("Aula Eliminado");

		pabellonDao.eliminarPorId(1L);
		System.out.println("Pabellon Eliminado");*/



	}
}