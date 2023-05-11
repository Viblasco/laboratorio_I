
package Tp3_persona;

import entidades.Jubilado;
import entidades.Trabajador;
import entidades.Persona;
import entidades.Registro;

public class personaApp {

    
    public static void main(String[] args) {
        
      Trabajador t =new Trabajador(500,true,"Maria", 2589722, "1999-08-15","La Pampa 34");
      Jubilado j =new Jubilado("Juan Perez", 2568973, "1950-09-15","San Juan 66");
      
      Registro r =new Registro();
      System.out.println("Procesamiento de los registros del Jubilado");
      r.procesarDatos(j);
      System.out.println("Procesamiento de los registros del trabajador");
      r.procesarDatos(t);
      
    }
    
}
