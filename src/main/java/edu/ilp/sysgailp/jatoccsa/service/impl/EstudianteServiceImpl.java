package edu.ilp.sysgailp.jatoccsa.service.impl;

import edu.ilp.sysgailp.jatoccsa.dao.IEstudianteDao;
import edu.ilp.sysgailp.jatoccsa.entity.Direccion;
import edu.ilp.sysgailp.jatoccsa.entity.Estudiante;
import edu.ilp.sysgailp.jatoccsa.entity.Persona;
import edu.ilp.sysgailp.jatoccsa.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;




@Service
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estudiante obtenerEstudiantePorCodigo(String codigo) {
        return this.estudianteDao.obtenerEstudiantePorCodigo(codigo);
    }

    @Override
    public Estudiante obtenerEstudiante(String codnom) {
        return this.estudianteDao.obtenerEstudiante(codnom);
    }




}