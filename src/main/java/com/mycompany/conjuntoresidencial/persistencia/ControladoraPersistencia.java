
package com.mycompany.conjuntoresidencial.persistencia;

import com.mycompany.conjuntoresidencial.logica.Apartamento;
import com.mycompany.conjuntoresidencial.logica.Propietario;
import com.mycompany.conjuntoresidencial.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    PropietarioJpaController propietarioJpa = new PropietarioJpaController();
    ApartamentoJpaController aptpJpa = new ApartamentoJpaController();

    public void guardar(Propietario propiet, Apartamento aparta) {
        
        propietarioJpa.create(propiet);
        
        aptpJpa.create(aparta);
        
    }

    public List<Apartamento> traerApartamentos() {
        return aptpJpa.findApartamentoEntities();
    }

    public void borrarApartamento(int id_Apto) {
        try
        {
            aptpJpa.destroy(id_Apto);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Apartamento traerApartamento(int id_Apto) {
        return aptpJpa.findApartamento(id_Apto);
    }

    public void modificarApto(Apartamento aparta) {
        try
        {
            aptpJpa.edit(aparta);
        } catch (Exception ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Propietario traerPropietario(int id) {
        return propietarioJpa.findPropietario(id);
    }

    public void modificarPropietario(Propietario propiet) {
        try
        {
            propietarioJpa.edit(propiet);
        } catch (Exception ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
