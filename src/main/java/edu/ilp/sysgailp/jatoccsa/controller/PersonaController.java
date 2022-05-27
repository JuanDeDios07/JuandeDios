package edu.ilp.sysgailp.jatoccsa.controller;

import edu.ilp.sysgailp.jatoccsa.entity.Persona;
import edu.ilp.sysgailp.jatoccsa.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listaPersonas")
    public List<Persona> listaEscuelas(){

        return this.personaService.listarPersonas();
    }

    @GetMapping("/buscarEscuelaByCodigo")
    public Persona buscarPersonaByCodigo(@RequestParam String nombre){
        return this.personaService.obtenerPersonaPorNombre(nombre);
    }


}
