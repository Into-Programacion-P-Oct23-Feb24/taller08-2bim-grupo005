/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       entrada.useLocale(Locale.US);

       String nombre;
       String posicion;
       int edad;
       double estatura;
       double promedioEstaturas = 0;
       double promedioEdades = 0;
       String mensajeFinal = "";
       int jugador = 0;
       int edades = 0; 
       double estaturas = 0;
       String sumaEdades = ""; 
       
       System.out.println("Ingrese la cantidad de jugadores");
       jugador = entrada.nextInt();
       
       for (int i = 1; i <= jugador; i++){
           entrada.nextLine();
           System.out.println("Ingrese el nombre del jugador");
           nombre = entrada.nextLine();
           System.out.println("Ingrese la posicion del jugador");
           posicion = entrada.nextLine();
           System.out.println("Ingrese la estatura del jugador");
           estatura = entrada.nextDouble();
           System.out.println("Ingrese la edad del jugador");
           edad = entrada.nextInt();
           
           sumaEdades = String.format("%s%d ", sumaEdades,edad);
           
           mensajeFinal = String.format("%s%d.%s-%s-,edad %d, estatura %.2f\n",
                   mensajeFinal, i, nombre, posicion, edad,
                   estatura);
           
           edades = edades + edad;
           estaturas = estaturas + estatura;
           
           promedioEdades = edades / 1;
           promedioEstaturas = estaturas / i;
       }
       
       System.out.printf("Listado de Jugadores\n%s\n Listado de Edades:%s\n"
               + "Promedio de Edades: %.1f\nPromedio de Estaturas: %.2f\n"
               ,mensajeFinal,
               sumaEdades,
               promedioEdades, 
               promedioEstaturas);
       
    }
    
}
