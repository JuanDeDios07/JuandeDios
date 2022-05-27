package edu.ilp.sysgailp.jatoccsa.service;

import edu.ilp.sysgailp.jatoccsa.entity.Direccion;
import edu.ilp.sysgailp.jatoccsa.entity.Estudiante;
import edu.ilp.sysgailp.jatoccsa.entity.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IEstudianteService {

    Estudiante obtenerEstudiantePorCodigo(String codigo);

    Estudiante obtenerEstudiante(String codnom );


}
