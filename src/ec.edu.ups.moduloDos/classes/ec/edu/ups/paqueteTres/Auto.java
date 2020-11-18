/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.paqueteTres;

import java.util.List;
import java.util.Objects;


/**
 *
 * @author Andres
 */
public class Auto {
 private List<Auto> listaAuto;
 private String marca;
 private String modelo;

    public Auto() {
    }
  

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
  
  
    public String getmarca() {
        return marca;
    }

    public void setmarca(String Marca) {
        this.marca = Marca;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String Modelo) {
        this.modelo = Modelo;
    }

    public List<Auto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(List<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.modelo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
   
    
  
  
}
