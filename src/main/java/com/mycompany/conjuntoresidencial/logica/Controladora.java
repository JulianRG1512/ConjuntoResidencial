
package com.mycompany.conjuntoresidencial.logica;

import com.mycompany.conjuntoresidencial.persistencia.ControladoraPersistencia;
import java.util.List;



public class Controladora {

   ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String apto, String torre, String res1, String celRes1, String res2, 
            String celRes2, String propietario, String arrendatario, String observacion, 
            String nompropietario, String cel1Propietario, String cel2Propietario) {
       
        Propietario propiet = new Propietario();
        propiet.setNombrePropietario(nompropietario);
        propiet.setCel1Propietario(cel1Propietario);
        propiet.setCel2Propietario(cel2Propietario);
        
        Apartamento aparta = new Apartamento();
        aparta.setNumApto(apto);
        aparta.setTorre(torre);
        aparta.setResidente1(res1);
        aparta.setCelRes1(celRes1);
        aparta.setResidente2(res2);
        aparta.setCelRes2(celRes2);
        aparta.setPropietario(propietario);
        aparta.setArrendatario(arrendatario);
        aparta.setObservaciones(observacion);
        aparta.setUnPropietario(propiet);
        
        controlPersis.guardar(propiet,aparta);
    
    }
    
    // Metodo para mostrar los apartamentos
    public List<Apartamento> traerapartamentos() {
        
        return controlPersis.traerApartamentos(); 
    }
    
    //Metodo para eliminar un apto
    public void borrarApartamento(int id_Apto) {
        controlPersis.borrarApartamento(id_Apto);
    }

    
    //Metodo para traer un apto para editarlo
    public Apartamento traerApartamento(int id_Apto) {
        return controlPersis.traerApartamento(id_Apto);
    }

   

    public void modificarApto(Apartamento aparta, String apto, String torre, String res1, String celRes1, String res2, String celRes2, String propietario,
                               String arrendatario, String observacion,
                               String nompropietario, String cel1Propietario,
                               String cel2Propietario) {
        //Seteamos todo el apto, para modificarlo
        aparta.setNumApto(apto);
        aparta.setTorre(torre);
        aparta.setResidente1(res1);
        aparta.setCelRes1(celRes1);
        aparta.setResidente2(res2);
        aparta.setCelRes2(celRes2);
        aparta.setPropietario(propietario);
        aparta.setArrendatario(arrendatario);
        aparta.setObservaciones(observacion);
        
        //Modificamos el apto
        controlPersis.modificarApto(aparta);
        
        //Seteamos el propietario
        Propietario propiet = this.buscarpropietario(aparta.getUnPropietario().getId());
        propiet.setNombrePropietario(nompropietario);
        propiet.setCel1Propietario(cel1Propietario);
        propiet.setCel2Propietario(cel2Propietario);
        
        //modificar propietario}
        this.modificarPropietario(propiet);
    }

    private Propietario buscarpropietario(int id) {
        return controlPersis.traerPropietario(id);
    }

    private void modificarPropietario(Propietario propiet) {
        controlPersis.modificarPropietario(propiet);

    }
    
    
    
    
}
