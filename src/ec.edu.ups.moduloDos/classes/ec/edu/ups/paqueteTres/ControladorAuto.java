/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.paqueteTres;


import ec.edu.ups.paqueteTres.Auto;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Andres
 */
public class ControladorAuto {
    private List<Auto> listaAuto;

    public ControladorAuto() {
        this.listaAuto=new ArrayList();
    }

    public ControladorAuto(List<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }
    
 public boolean crear(String marca,String modelo){
    return this.listaAuto.add(new Auto(marca,modelo));
    }
    
    public Optional<Auto> buscarAuto(String modelo){
    return this.listaAuto.stream().filter(a->a.getmodelo().equals(modelo)).findFirst();
    }  
    
     public void imprimir(){
        for (Auto auto : listaAuto) {
            System.out.println(auto); 
        }
    }
}
