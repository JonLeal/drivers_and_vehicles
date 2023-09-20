/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dao.ConductorFacadeLocal;
import com.mycompany.model.Conductor;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.component.UIComponent;

/**
 *
 * @author Jon Leal
 */
public class ConductorBean {

    @EJB
    private ConductorFacadeLocal conductorFacade;
    
    public UIComponent miBoton;
//    private Integer iDConductor;
    private String nombre;
    private String apellido;
    private String dni;
    private String correoElectronico;
    private String telefono;
    private final Date fechaRegistro = new Date();
    private Boolean activo;

    private List<Conductor> conductores;
    /**
     * Creates a new instance of ConductorBean
     */
    public ConductorBean() {
    }

    public ConductorFacadeLocal getConductorFacade() {
        return conductorFacade;
    }

    public void setConductorFacade(ConductorFacadeLocal conductorFacade) {
        this.conductorFacade = conductorFacade;
    }

    public UIComponent getMiBoton() {
        return miBoton;
    }

    public void setMiBoton(UIComponent miBoton) {
        this.miBoton = miBoton;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public List<Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(List<Conductor> conductores) {
        this.conductores = conductores;
    }
    
    
    
    public List<Conductor> obtenerConductores(){
        if (conductores == null || conductores.isEmpty()) {
            conductores = conductorFacade.getAllConductores();
        }
        return conductores;
    }
    
    public void guardarConductor(){
        Conductor conductor = new Conductor();
        conductor.setNombre(nombre);
        conductor.setApellido(apellido);
        conductor.setDni(dni);
        conductor.setCorreoElectronico(correoElectronico);
        conductor.setTelefono(telefono);
        conductor.setFechaRegistro(fechaRegistro);
        conductor.setActivo(activo);
        conductorFacade.create(conductor);
    }
}
