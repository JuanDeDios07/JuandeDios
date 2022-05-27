package edu.ilp.sysgailp.jatoccsa.service.impl;

import edu.ilp.sysgailp.jatoccsa.dao.IPersonaDao;
import edu.ilp.sysgailp.jatoccsa.entity.Persona;
import edu.ilp.sysgailp.jatoccsa.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersonas() {
        return this.personaDao.findAll();
    }

    @Override
    public Persona obtenerPersonaPorNombre(String nombre) {
        return this.personaDao.obtenerPersonaPorNombre(nombre);
    }
}
