/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.animales;

public class Tigre extends Animal{
    
    public Tigre(String nombre, int edad){
        this.setNombre(nombre);
        this.setEdad(edad);
        
    public void hacerRuido(boolean molestar)
    {
        
        System.out.println("GRRRRRR");
    }
    
}
