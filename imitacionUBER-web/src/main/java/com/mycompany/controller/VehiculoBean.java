/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dao.ConductorFacadeLocal;
import com.mycompany.dao.VehiculoFacadeLocal;
import com.mycompany.model.Conductor;
import com.mycompany.model.Vehiculo;
import javax.ejb.EJB;

/**
 *
 * @author Jon Leal
 */
public class VehiculoBean {

    @EJB
    private ConductorFacadeLocal conductorFacade;

    @EJB
    private VehiculoFacadeLocal vehiculoFacade;
    
    private String marca;
    private String modelo;
    private Integer anoFabricacion;
    private String placa;
    private String color;
    private Boolean activo;
    private Integer idConductor;
    private Conductor Conductor;

    /**
     * Creates a new instance of VehiculoBean
     */
    public VehiculoBean() {
    }

    public VehiculoFacadeLocal getVehiculoFacade() {
        return vehiculoFacade;
    }

    public void setVehiculoFacade(VehiculoFacadeLocal vehiculoFacade) {
        this.vehiculoFacade = vehiculoFacade;
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

    public Integer getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(Integer idConductor) {
        this.idConductor = idConductor;
    }
    
        public void guardarVehiculo(){
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setAnoFabricacion(anoFabricacion);
        vehiculo.setPlaca(placa);
        vehiculo.setColor(color);
        vehiculo.setActivo(activo);
        vehiculo.setIDConductor(conductorFacade.find(idConductor));
        vehiculoFacade.create(vehiculo);
    }
}
