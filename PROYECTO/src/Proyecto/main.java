/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        
        ArrayList<String> ArregloLlenar = new ArrayList<String>();

         Rol_planificador j= new Rol_planificador();
         j.ArrayLTeacher(ArregloLlenar, "x");
    }
    
}
