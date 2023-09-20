/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jon Leal
 */
@Entity
@Table(name = "conductores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conductor.findAll", query = "SELECT c FROM Conductor c")
    , @NamedQuery(name = "Conductor.findByIDConductor", query = "SELECT c FROM Conductor c WHERE c.iDConductor = :iDConductor")
    , @NamedQuery(name = "Conductor.findByNombre", query = "SELECT c FROM Conductor c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Conductor.findByApellido", query = "SELECT c FROM Conductor c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Conductor.findByDni", query = "SELECT c FROM Conductor c WHERE c.dni = :dni")
    , @NamedQuery(name = "Conductor.findByCorreoElectronico", query = "SELECT c FROM Conductor c WHERE c.correoElectronico = :correoElectronico")
    , @NamedQuery(name = "Conductor.findByTelefono", query = "SELECT c FROM Conductor c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Conductor.findByFechaRegistro", query = "SELECT c FROM Conductor c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Conductor.findByActivo", query = "SELECT c FROM Conductor c WHERE c.activo = :activo")})
public class Conductor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Conductor")
    private Integer iDConductor;
    @Size(max = 255)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "Apellido")
    private String apellido;
    @Size(max = 20)
    @Column(name = "DNI")
    private String dni;
    @Size(max = 255)
    @Column(name = "CorreoElectronico")
    private String correoElectronico;
    @Size(max = 20)
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "Activo")
    private Boolean activo;
    @OneToMany(mappedBy = "iDConductor")
    private Collection<Vehiculo> vehiculoCollection;

    public Conductor() {
    }

    public Conductor(Integer iDConductor) {
        this.iDConductor = iDConductor;
    }

    public Integer getIDConductor() {
        return iDConductor;
    }

    public void setIDConductor(Integer iDConductor) {
        this.iDConductor = iDConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @XmlTransient
    public Collection<Vehiculo> getVehiculoCollection() {
        return vehiculoCollection;
    }

    public void setVehiculoCollection(Collection<Vehiculo> vehiculoCollection) {
        this.vehiculoCollection = vehiculoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDConductor != null ? iDConductor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conductor)) {
            return false;
        }
        Conductor other = (Conductor) object;
        if ((this.iDConductor == null && other.iDConductor != null) || (this.iDConductor != null && !this.iDConductor.equals(other.iDConductor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.modelo.Conductor[ iDConductor=" + iDConductor + " ]";
    }
    
}
