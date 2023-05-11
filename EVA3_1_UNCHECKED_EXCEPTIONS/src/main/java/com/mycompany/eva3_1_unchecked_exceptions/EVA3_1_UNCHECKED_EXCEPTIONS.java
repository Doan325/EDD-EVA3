

package com.mycompany.eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author Doan Escobar
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
        System.out.println("INICIALIZANDO EL PROGRAMA");
        int x= 5, y = 0;
        System.out.println("INICALIZANDO LAS VARIABLES");
       int resu = x / y;
        System.out.println("CALCULANDO LA DIVISION");
        System.out.println("Division = " + resu);
        
        Scanner input = new Scanner (System.in);
         int nume = input.nextInt();
         System.out.println("tu numero es:"+ nume);
       
         int [] arreglo = new int [5];//0 -(N-1)
         arreglo [0] = 100;
         arreglo [1] = 200;
         arreglo [2] = 300;
         arreglo [3] = 400;
         arreglo [4] = 500;
         arreglo [5] = 600;
          Prueba objPrueba = null;
          System.out.println("Valor de x = "+ objPrueba.x);
                  
         
         
    }
}
class Prueba {
public int x;
}
