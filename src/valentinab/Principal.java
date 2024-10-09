
package valentinab;

import valentinab.base.Universidad;
import valentinab.base.Profesor;
import valentinab.base.Asignatura;

public class Principal {
    public static void main(String[] args) {
        
       Universidad universidad1 = new Universidad();
       Profesor profesor1 = new Profesor();
       Asignatura asignatura1 = new Asignatura();
       
       Universidad universidad2 = new Universidad("Universidad de Cartagena", "Cartagena, Bolívar", 9, 33500);
       Profesor profesor2 = new Profesor("Jhon Carlos Arrieta Arrieta", "Ingeniería de Sistemas", 8, "jarrieta2@unicartagena.edu.co");
       Asignatura asignatura2 = new Asignatura("Programación Orientada a Objetos", "Curso orientado a la creación de aplicaciones robustas y escalables a partir de conceptos de POO", 
                         3, profesor2);
    
       System.out.println("     Código: 7502410031");
       System.out.println(" Valentina Barragán Martínez");
       System.out.println("*****************************");
       
       System.out.println("");
       
       universidad1.mostrarDatos();
       System.out.println("");
       profesor1.mostrarDatos();
       System.out.println("");
       asignatura1.mostrarDatos();
       System.out.println("");
        
       System.out.println("*****************************");
       System.out.println("");
        
       universidad2.mostrarDatos();
       System.out.println("");
       profesor2.mostrarDatos();
       System.out.println("");
       asignatura2.mostrarDatos();
       System.out.println("");
    }
}
