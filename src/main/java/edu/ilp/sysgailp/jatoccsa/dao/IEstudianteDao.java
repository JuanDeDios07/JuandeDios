package edu.ilp.sysgailp.jatoccsa.dao;

import edu.ilp.sysgailp.jatoccsa.entity.Direccion;
import edu.ilp.sysgailp.jatoccsa.entity.Estudiante;
import edu.ilp.sysgailp.jatoccsa.entity.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {

    @Query("SELECT e FROM Estudiante e WHERE e.codigo = ?1")
    Estudiante obtenerEstudiantePorCodigo(String codigo);

    @Query("SELECT e FROM Estudiante e WHERE e.codigo = :codnom OR e.nombre = :codnom")
    Estudiante obtenerEstudiante(@Param("codnom") String codnom);


    @Query("SELECT p FROM Direccion p WHERE p.persona = :idpersona")
    Page<Direccion> listaEstudiante(Pageable pageable, @Param("idpersona")Persona idpersona);

}
