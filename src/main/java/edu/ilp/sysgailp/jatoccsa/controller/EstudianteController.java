package edu.ilp.sysgailp.jatoccsa.controller;


import edu.ilp.sysgailp.jatoccsa.entity.Direccion;
import edu.ilp.sysgailp.jatoccsa.entity.Estudiante;
import edu.ilp.sysgailp.jatoccsa.entity.Persona;
import edu.ilp.sysgailp.jatoccsa.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("login")
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/buscarEstudianteByCodigo")
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo){
        return this.estudianteService.obtenerEstudiantePorCodigo(codigo);
    }

    @GetMapping("/buscar/{codnom}")
    public Estudiante buscarEstudiante(@PathVariable String codnom){
        return this.estudianteService.obtenerEstudiante(codnom);
    }


}
