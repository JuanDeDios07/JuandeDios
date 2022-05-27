package edu.ilp.sysgailp.jatoccsa.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Profesor extends Persona{

    @Column( name = "codigo", length = 50)
    private String codigo;

    @Column( name = "salario", length = 50)
    private String salario;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profesor")
    private List<Asignatura> asignatura;

    public Profesor() {
    }

    public Profesor(String codigo) {
        this.codigo = codigo;
    }

    public Profesor(String codigo, String salario, List<Asignatura> asignatura) {
        this.codigo = codigo;
        this.salario = salario;
        this.asignatura = asignatura;
    }

    public Profesor(Long idpersona, String codigo, String salario, List<Asignatura> asignatura) {
        super(idpersona);
        this.codigo = codigo;
        this.salario = salario;
        this.asignatura = asignatura;
    }

    public Profesor(Long idpersona, String nombre, String telefono, String email, String codigo, String salario, List<Asignatura> asignatura) {
        super(idpersona, nombre, telefono, email);
        this.codigo = codigo;
        this.salario = salario;
        this.asignatura = asignatura;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public List<Asignatura> getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(List<Asignatura> asignatura) {
        this.asignatura = asignatura;
    }
}
