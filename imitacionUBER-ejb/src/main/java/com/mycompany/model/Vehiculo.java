/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jon Leal
 */
@Entity
@Table(name = "vehiculos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v")
    , @NamedQuery(name = "Vehiculo.findByIDVehiculo", query = "SELECT v FROM Vehiculo v WHERE v.iDVehiculo = :iDVehiculo")
    , @NamedQuery(name = "Vehiculo.findByMarca", query = "SELECT v FROM Vehiculo v WHERE v.marca = :marca")
    , @NamedQuery(name = "Vehiculo.findByModelo", query = "SELECT v FROM Vehiculo v WHERE v.modelo = :modelo")
    , @NamedQuery(name = "Vehiculo.findByAnoFabricacion", query = "SELECT v FROM Vehiculo v WHERE v.anoFabricacion = :anoFabricacion")
    , @NamedQuery(name = "Vehiculo.findByPlaca", query = "SELECT v FROM Vehiculo v WHERE v.placa = :placa")
    , @NamedQuery(name = "Vehiculo.findByColor", query = "SELECT v FROM Vehiculo v WHERE v.color = :color")
    , @NamedQuery(name = "Vehiculo.findByActivo", query = "SELECT v FROM Vehiculo v WHERE v.activo = :activo")})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Vehiculo")
    private Integer iDVehiculo;
    @Size(max = 255)
    @Column(name = "Marca")
    private String marca;
    @Size(max = 255)
    @Column(name = "Modelo")
    private String modelo;
    @Column(name = "AnoFabricacion")
    private Integer anoFabricacion;
    @Size(max = 20)
    @Column(name = "Placa")
    private String placa;
    @Size(max = 50)
    @Column(name = "Color")
    private String color;
    @Column(name = "Activo")
    private Boolean activo;
    @JoinColumn(name = "ID_Conductor", referencedColumnName = "ID_Conductor")
    @ManyToOne
    private Conductor iDConductor;

    public Vehiculo() {
    }

    public Vehiculo(Integer iDVehiculo) {
        this.iDVehiculo = iDVehiculo;
    }

    public Integer getIDVehiculo() {
        return iDVehiculo;
    }

    public void setIDVehiculo(Integer iDVehiculo) {
        this.iDVehiculo = iDVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(Integer anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Conductor getIDConductor() {
        return iDConductor;
    }

    public void setIDConductor(Conductor iDConductor) {
        this.iDConductor = iDConductor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDVehiculo != null ? iDVehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.iDVehiculo == null && other.iDVehiculo != null) || (this.iDVehiculo != null && !this.iDVehiculo.equals(other.iDVehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.modelo.Vehiculo[ iDVehiculo=" + iDVehiculo + " ]";
    }
    
}
