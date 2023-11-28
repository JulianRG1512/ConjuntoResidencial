
package com.mycompany.conjuntoresidencial.logica;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Apartamento implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idApto;
    private String numApto;
    private String torre;
    private String residente1;
    private String celRes1;
    private String residente2;
    private String celRes2;
    private String propietario;
    private String arrendatario;
    private String observaciones;
    @OneToOne
    private Propietario unPropietario;

    public Apartamento() {
    }

    public Apartamento(int idApto, String numApto, String torre, String residente1, String celRes1, String residente2, String celRes2, String propietario, String arrendatario, String observaciones, Propietario unPropietario) {
        this.idApto = idApto;
        this.numApto = numApto;
        this.torre = torre;
        this.residente1 = residente1;
        this.celRes1 = celRes1;
        this.residente2 = residente2;
        this.celRes2 = celRes2;
        this.propietario = propietario;
        this.arrendatario = arrendatario;
        this.observaciones = observaciones;
        this.unPropietario = unPropietario;
    }

    public int getIdApto() {
        return idApto;
    }

    public void setIdApto(int idApto) {
        this.idApto = idApto;
    }

    public String getNumApto() {
        return numApto;
    }

    public void setNumApto(String numApto) {
        this.numApto = numApto;
    }

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

    public String getResidente1() {
        return residente1;
    }

    public void setResidente1(String residente1) {
        this.residente1 = residente1;
    }

    public String getCelRes1() {
        return celRes1;
    }

    public void setCelRes1(String celRes1) {
        this.celRes1 = celRes1;
    }

    public String getResidente2() {
        return residente2;
    }

    public void setResidente2(String residente2) {
        this.residente2 = residente2;
    }

    public String getCelRes2() {
        return celRes2;
    }

    public void setCelRes2(String celRes2) {
        this.celRes2 = celRes2;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(String arrendatario) {
        this.arrendatario = arrendatario;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Propietario getUnPropietario() {
        return unPropietario;
    }

    public void setUnPropietario(Propietario unPropietario) {
        this.unPropietario = unPropietario;
    }

   
}
