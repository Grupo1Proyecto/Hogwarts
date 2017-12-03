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
public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Casa;
    private String Tipo;
    private String Varita;
    
    private String Deporte;
    private String Escoba;
    private String Pocion;
    private String Animal;
    private String Hechizo;
    
    
    public Persona(){
   }
    
        // get y setters
    
    
    public String getNombre(){
    return this.Nombre;
    }
    public void setNombre(String Nombre){
    this.Nombre=Nombre;
    }

    public String getApellido(){
    return this.Apellido;
    }
    public void setApellido(String Apellido){
    this.Apellido=Apellido;
    }
    public int getEdad(){
    return this.Edad;
    }
    public void setEdad(int Edad){
    this.Edad=Edad;
    }
    public String getVarita(){
    return this.Varita;
    }
    public void setVarita(String Varita){
    this.Varita=Varita;
    }
    public String getDeporte(){
    return this.Deporte;
    }
    public void setDeporte(String Deporte){
    this.Deporte=Deporte;
    }
    public String getEscoba(){
    return this.Escoba;
    }
    public void setEscoba(String Escoba){
    this.Escoba=Escoba;
    }
    public String getPocion(){
    return this.Pocion;
    }
    public void setPocion(String Pocion){
    this.Pocion=Pocion;
    }
    public String getAnimal(){
    return this.Animal;
    }
    public void setAnimal(String Animal){
    this.Animal=Animal;
    }
    public String getHechizo(){
    return this.Hechizo;
    }
    public void setHechizo(String Hechizo){
    this.Hechizo=Hechizo;
    }
    
    
  }  
