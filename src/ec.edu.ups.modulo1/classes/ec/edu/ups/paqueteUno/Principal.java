/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.paqueteUno;

/**
 *
 * @author Andres
 */
public class Principal {
    public static void main(String[] args){
    ec.edu.ups.paqueteDos.Persona p= new ec.edu.ups.paqueteDos.Persona();
    ec.edu.ups.paqueteTres.ControladorAuto c = new ec.edu.ups.paqueteTres.ControladorAuto();
    p.setNombre("El Pepe");
    p.setEdad(15);
    c.crear("audi", "A4");
    c.crear("chery", "tiggo 5");
    c.buscarAuto("A4");
    System.out.println("Nombre: "+p.getNombre()+"\n"+"Edad: "+p.getEdad());
    c.imprimir();
    System.out.println(c.buscarAuto("A4"));
    }
}
