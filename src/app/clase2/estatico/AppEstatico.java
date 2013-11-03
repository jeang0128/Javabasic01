/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.estatico;

public class AppEstatico {
    
    public static void main(String[] args) {
      AppEstatico.metodoEstatico();
        
       
    }
    
    public static void metodoEstatico(){
    
        double euro = Estatico.dolaraEuro(10d);
        System.out.println(euro);
    }
            
    public static void atributoEstatico(){
        
        System.out.println(Estatico.contador);
        Estatico estaUn = new Estatico();
        Estatico estaDo = new Estatico();
        Estatico estaTre = new Estatico();
        System.out.println(Estatico.contador);
    }        
    
}
