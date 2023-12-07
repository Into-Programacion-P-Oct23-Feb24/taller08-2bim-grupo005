/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        for (int num = 30; num >= 10; num--) {
            String cadena = " ";
            cadena = String.format("%s %d", cadena, num);
            contador = num;
            for (int i = 1; i < 4; i++) {
                contador = contador + num;
                cadena = String.format("%s-%d", cadena, contador);
            }
            System.out.printf("%s\n", cadena);
        }
    }

}
