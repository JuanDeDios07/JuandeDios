package edu.ilp.sysgailp.jatoccsa.dao;

import edu.ilp.sysgailp.jatoccsa.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IPersonaDao extends JpaRepository<Persona,Long> {

    @Query("SELECT e FROM Persona e WHERE e.nombre = ?1")
    Persona obtenerPersonaPorNombre(String nombre);
}
