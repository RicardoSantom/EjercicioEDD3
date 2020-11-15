/*
 *It asks the user for the data of a triangle and calculates its area.
 * It also calculates the area of a triangle by default of the system.
 * It displays the results on the screen.
 */
package com.mycompany.ejercicioedd3;

import java.util.Scanner;

/**
 *
 * @author Ricardo Santiago Tomé
 * @version 15/11/2020
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle triangleUser;
        triangleUser = new Triangle();
        
        System.out.println("¿Cuál es la altura del triángulo?");
        Scanner reader =new Scanner (System.in);
        triangleUser.setHeight (reader.nextFloat());
        
        System.out.println("¿Cuál es la base del triángulo?");
        reader =new Scanner (System.in);
        triangleUser.setBase (reader.nextFloat());
        
        System.out.println("El área del triángulo introducido por el usuario es : "+triangleUser.calculateArea());
        
        Triangle triangleSystem =new Triangle(5,6);
        
        System.out.println("¿El área del triángulo del sistema es: " + triangleSystem.calculateArea());
        
    }
    
}
