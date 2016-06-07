/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepcion;

/**
 *
 * @author T-107
 */
public class PrimaraExepcion {
    public static void main(String[] args) {
        //Veremos primero las mas comunes de las unchecked
        float x=4;
        int y=0;
        System.out.println(x/y);
        
        String falsoNumero="5";
        int numeroReal=5;
        System.out.println("Este es antes de la excepción");
        int suma=Integer.parseInt(falsoNumero)+numeroReal;
        System.out.println("Todo esta bien hasta aquí");
        
        
    }
    
}
