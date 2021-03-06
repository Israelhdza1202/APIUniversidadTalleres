package com.ibm.academia.restapi.universidad.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.restapi.universidad.excepciones.NotFoundException;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.servicios.PersonaDAO;
import com.ibm.academia.restapi.universidad.servicios.ProfesorDAO;

@RestController
@RequestMapping("/restapi")
public class ProfesorController {

    @Autowired
    @Qualifier("profesorDAOImpl")
    private PersonaDAO profesorDao;


    @PostMapping("/profesor")
    public ResponseEntity<?> crearProfesor(@RequestBody Persona profesor) {
        Persona profesorGuardado = profesorDao.guardar(profesor);
        return new ResponseEntity<Persona>(profesorGuardado, HttpStatus.CREATED);
    }

    @GetMapping("/profesores/lista")
    public ResponseEntity<?> obtenerTodos(){
        List<Persona> profesor = (List<Persona>) profesorDao.buscarTodos();

        if(profesor.isEmpty())
            throw new NotFoundException("No existen profesores");

        return new ResponseEntity<List<Persona>>(profesor, HttpStatus.OK);
    }

    @GetMapping("/profesor/{profesorId}")
    public ResponseEntity<?> obtenerProfesorPorId(@PathVariable Long profesorId){
        Optional<Persona> oProfesor = profesorDao.buscarPorId(profesorId);

        if(!oProfesor.isPresent())
            throw new NotFoundException(String.format("Profesor con id %d no existe", profesorId));

        return new ResponseEntity<Persona>(oProfesor.get(), HttpStatus.OK);
    }

    @DeleteMapping("/profesor/eliminar/profesorId/{profesorId}")
    public ResponseEntity<?> eliminarProfesor(@PathVariable Long profesorId){
        Optional<Persona> oProfesor = profesorDao.buscarPorId(profesorId);

        if(!oProfesor.isPresent())
            throw new NotFoundException(String.format("El profesor con ID %d no existe", profesorId));

        profesorDao.eliminarPorId(oProfesor.get().getId());
        return new ResponseEntity<String>("Profesor ID: " + profesorId + " se elimino satisfactoriamente",  HttpStatus.NO_CONTENT);
    }

    @PutMapping("/profesor/actualizar/profesorId/{profesorId}")
    public ResponseEntity<?> actualizarProfesor(@PathVariable Long profesorId, @RequestBody Persona profesor){
        Persona profesorActualizado = ((ProfesorDAO)profesorDao).actualizar(profesorId, profesor);
        return new ResponseEntity<Persona>(profesorActualizado, HttpStatus.OK);
    }

}