package edu.ilp.sysgailp.jatoccsa.service.impl;

import edu.ilp.sysgailp.jatoccsa.dao.IProfesorDao;
import edu.ilp.sysgailp.jatoccsa.entity.Asignatura;
import edu.ilp.sysgailp.jatoccsa.entity.Profesor;
import edu.ilp.sysgailp.jatoccsa.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl implements IProfesorService {

    @Autowired
    private IProfesorDao profesorDao;


    @Override
    public Asignatura obtenerEstudiante(String codcurso) {
        return this.profesorDao.obtenerEstudiante(codcurso);
    }
}
