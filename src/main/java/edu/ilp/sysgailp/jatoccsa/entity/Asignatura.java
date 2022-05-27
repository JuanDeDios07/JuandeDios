package edu.ilp.sysgailp.jatoccsa.entity;

import javax.persistence.*;


@Entity
@Table(name = "asignatura")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idasignatura;

    @Column(name = "nom_curso",length = 50)
    private String curso;

    @Column(name = "horas",length = 10)
    private  String horas;


    @ManyToOne
    @JoinColumn(name = "idprofesor")
    private Profesor profesor;

    public Asignatura() {
    }

    public Asignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public Asignatura(Long idasignatura, String curso, String horas, Profesor profesor) {
        this.idasignatura = idasignatura;
        this.curso = curso;
        this.horas = horas;
        this.profesor = profesor;
    }

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
