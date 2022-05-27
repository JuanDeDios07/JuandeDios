package edu.ilp.sysgailp.jatoccsa.controller;

import edu.ilp.sysgailp.jatoccsa.entity.Asignatura;
import edu.ilp.sysgailp.jatoccsa.entity.Profesor;
import edu.ilp.sysgailp.jatoccsa.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class ProfesorController {

    @Autowired
    private IProfesorService profesorService;


    @GetMapping("/buscar/{codcurso}")
    public Asignatura buscarEstudiante(@PathVariable String codcurso){
        return this.profesorService.obtenerEstudiante(codcurso);
    }
}
