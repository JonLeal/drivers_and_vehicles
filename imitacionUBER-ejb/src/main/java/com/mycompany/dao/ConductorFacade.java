/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Conductor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Jon Leal
 */
@Stateless
public class ConductorFacade extends AbstractFacade<Conductor> implements ConductorFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_imitacionUBER-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConductorFacade() {
        super(Conductor.class);
    }
    
    @Override
    public List<Conductor> getAllConductores(){
        Query query = em.createNamedQuery("Conductor.findAll");
        return query.getResultList();
    }
}
