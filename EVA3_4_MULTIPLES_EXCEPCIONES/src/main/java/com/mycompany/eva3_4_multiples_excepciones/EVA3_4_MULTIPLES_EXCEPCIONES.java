/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Doan Escobar
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
int x, y;


try {
    Scanner input = new Scanner (System.in);
        System.out.println("Introduce el valor (entero) de x:");
        x= input.nextInt();
        System.out.println("Introduce el valor (entero) e y :");
       y= input.nextInt();
        int resu = x / y;
         System.out.println("La division de " +x + "/"+ y +"es:"+ resu);
         
    }catch (InputMismatchException e){
            System.out.println("El valor no es valido vuelve a capturar: " +e.getMessage());
            }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0: " + e.getMessage());
            }
        System.out.println("´Programa terminado con exito");
  
        
        
          }  
}
