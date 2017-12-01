/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Admin
 */
public class Metamorfomago extends Persona implements Volador {

    @Override
    public String volar() {
        return "Vuelo con mi poder de transformarme en animal";
    }

    @Override
    public String despegar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
