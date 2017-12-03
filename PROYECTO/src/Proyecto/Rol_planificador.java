/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Proyecto;
import java.util.Scanner;
import java.util.ArrayList;

public class Rol_planificador {
    public String materia1="Posiones";
    public String materia2="Defensas contra las artes oscuras";
    public String materia3="Adivinacion";
    public String materia4="Astronomia";
    public String materia5="Historia de la magia";
    public String materia6="Herbologia";
    public String materia7="Encantamientos";
    public String materia8="Vuelo";
    public String profesor;
    public String estudiante;
    
    Boolean exit= false;
    
public void runMenu (){
    
    while(!exit){
        MenuS();
        int choice =ChoiceM()-1;
        String materia=Arraysubject(choice);
        System.out.println(materia);
        
        
 }
}    

private void MenuS(){
    
System.out.println("/**Materias disponibles**/\n"
        + "\n1. Posiones\n2. Defensas contra las artes oscuras\n3. Adivinacion"
        + "\n4. Astronomia\n5. Historia de la magia\n6. Herbologia"
        + "\n7. Encantamientos\n8. Vuelo\n");
}

private int ChoiceM(){

 Scanner  eleccion= new Scanner(System.in);
 int choice=-1;
 while(choice<1||choice>8){
 try{
     System.out.print("Elija su eleccion: ");
     choice = Integer.parseInt(eleccion.nextLine());
 }
 
 catch(NumberFormatException e){
 System.out.println("Ivalido, ingrese de nuevo");}
 
 }
  return choice;         

}

public String Arraysubject(int x){
    String ArrayS[]=new String[7];
    ArrayS[0]=materia1;
    ArrayS[1]=materia2;        
    ArrayS[2]=materia3;
    ArrayS[3]=materia4;
    ArrayS[4]=materia5;
    ArrayS[5]=materia6;
    ArrayS[6]=materia7;
    ArrayS[7]=materia8;
    return ArrayS[x];
       
}

ArrayList<String> ArregloLlenar = new ArrayList<String>();
public ArrayList<String> ArrayLTeacher(ArrayList<String> a ,String x){


if (!a.contains(x)){
    a.add(x);
    System.out.println("Materia  agregada");
    return a;
    }
else if (a.contains(x)){
    System.out.println("Materia ya existente");
    
}
       return ArregloLlenar; 
}




}

