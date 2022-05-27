package edu.ilp.sysgailp.jatoccsa.dao;

import edu.ilp.sysgailp.jatoccsa.entity.Asignatura;
import edu.ilp.sysgailp.jatoccsa.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {


    @Query("SELECT e FROM Asignatura e WHERE e.profesor = :codcurso OR e.curso = :codcurso")
    Asignatura obtenerEstudiante(@Param("codcurso") String codcurso);
}
