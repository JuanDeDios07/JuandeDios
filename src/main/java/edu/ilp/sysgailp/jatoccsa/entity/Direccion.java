package edu.ilp.sysgailp.jatoccsa.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddireccion;

    @Column(name = "calle",length = 50)
    private String calle;

    @Column(name = "ciudad",length = 50)
    private String ciudad;

    @Column(name = "estado",length = 50)
    private String estado;

    @Column(name = "codigopostal",length = 50)
    private String codigopostal;

    @Column(name = "pais",length = 50)
    private String pais;

  // @JoinColumn(name = "codigo", nullable = false)
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    private Persona persona;

    public Direccion() {
    }

    public Direccion(Long iddireccion) {
        this.iddireccion = iddireccion;
    }

    public Direccion(Long iddireccion, String calle, String ciudad, String estado, String codigopostal, String pais, Persona persona) {
        this.iddireccion = iddireccion;
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigopostal = codigopostal;
        this.pais = pais;
        this.persona = persona;
    }

    public Long getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(Long iddireccion) {
        this.iddireccion = iddireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


}
