/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_finally;

/**
 *
 * @author Doan Escobar
 */
public class EVA3_5_FINALLY {

    
    public static void main(String[] args) {
try{
        int x = 3, y = 0;
int resu = x/ y ;
        System.out.println("Resultado " + resu);
    }   catch(ArithmeticException e){
            System.out.println("No se puede dividir etre cero");
}finally {
    //ES OPCIONAL 
    System.out.println("SIEMPRE ME VOY A EJECUTAR");
    
}
        System.out.println("Fin del programa");
    }
}
