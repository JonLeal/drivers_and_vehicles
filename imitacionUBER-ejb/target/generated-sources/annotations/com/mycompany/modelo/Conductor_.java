package com.mycompany.modelo;

import com.mycompany.model.Conductor;
import com.mycompany.model.Vehiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-09-19T17:20:36")
@StaticMetamodel(Conductor.class)
public class Conductor_ { 

    public static volatile SingularAttribute<Conductor, Integer> iDConductor;
    public static volatile SingularAttribute<Conductor, Date> fechaRegistro;
    public static volatile SingularAttribute<Conductor, String> apellido;
    public static volatile SingularAttribute<Conductor, String> telefono;
    public static volatile SingularAttribute<Conductor, String> nombre;
    public static volatile SingularAttribute<Conductor, String> correoElectronico;
    public static volatile SingularAttribute<Conductor, String> dni;
    public static volatile CollectionAttribute<Conductor, Vehiculo> vehiculoCollection;
    public static volatile SingularAttribute<Conductor, Boolean> activo;

}