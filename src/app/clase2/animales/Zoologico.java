/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.animales;

public class Zoologico {
 
    public static void main(String[] args) {
        
        Tigre tito = new Tigre("tito", 15);
        tito.hacerRuido();
        tito.hacerRuido(true);
        tito.comer();
    }
    
}
