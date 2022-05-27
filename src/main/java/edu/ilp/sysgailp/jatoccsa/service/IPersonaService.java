package edu.ilp.sysgailp.jatoccsa.service;

import edu.ilp.sysgailp.jatoccsa.entity.Persona;

import java.util.List;


public interface IPersonaService {

    List<Persona> listarPersonas();

    Persona obtenerPersonaPorNombre(String nombre);
}
