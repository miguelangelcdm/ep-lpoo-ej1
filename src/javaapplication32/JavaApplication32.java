/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador=0;
        System.out.println("ingrese numero: ");
        int numero=input.nextInt();
        for (int i = 1; i < numero+1; i++) {
            if (numero%i!=0) {
                contador++;
            }
        }
        if (contador<2) {
            System.out.println("el numero no es primo");
        }else   System.out.println("numero primo");
      
        // TODO code application logic here
        
    }
    
}
