/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_throw_exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Doan Escobar
 */
public class EVA3_7_THROW_EXCEPTION {

    public static void main(String[] args) {
Prueba obj = new Prueba();
        try {
            obj.capturarMayorCero(-1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(EVA3_7_THROW_EXCEPTION.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
class Prueba{
    public void capturarMayorCero (int valor) throws Exception{
        if (valor >=  0) // voy a generar una excepcion
            throw new Exception (valor + "es negativo, solo se acepta valores positivos");
              System.out.println("El valor es " + valor);
        
    }
}