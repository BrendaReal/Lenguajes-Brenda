/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-107
 */
public class Animal {
    String nombre;
    String especie;
    boolean carnivoro;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal() {
    }
    
    
}
