
package com.mycompany.conjuntoresidencial.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Propietario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombrePropietario;
    private String cel1Propietario;
    private String cel2Propietario;

    public Propietario() {
    }

    public Propietario(int id, String nombrePropietario, String cel1Propietario, String cel2Propietario) {
        this.id = id;
        this.nombrePropietario = nombrePropietario;
        this.cel1Propietario = cel1Propietario;
        this.cel2Propietario = cel2Propietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getCel1Propietario() {
        return cel1Propietario;
    }

    public void setCel1Propietario(String cel1Propietario) {
        this.cel1Propietario = cel1Propietario;
    }

    public String getCel2Propietario() {
        return cel2Propietario;
    }

    public void setCel2Propietario(String cel2Propietario) {
        this.cel2Propietario = cel2Propietario;
    }
    
    
    
}
