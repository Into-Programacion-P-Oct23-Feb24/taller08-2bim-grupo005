/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double celsius;
        String cadena = "";
        int f = 20;
        for (int farenheit = 1; farenheit <= 20; farenheit ++) {
            celsius = (double) (f - 32) * 5 / 9;
            cadena= String.format("%s%d Farenheit son: %.2f Celsius\n",
                    cadena, f, celsius);
            f = f + 4;
        }
        System.out.printf("%s", cadena);
        
    }
    
}
