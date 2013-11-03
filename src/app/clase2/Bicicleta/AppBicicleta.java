
package app.clase2.Bicicleta;


public class AppBicicleta {
    
    public static void main(String[] args) {
        
        Bicicleta bicla = new Bicicleta();
        bicla.setModelo("monark");
        bicla.setMarca("256");
        
        bicla.cambiarLlantas();
        
        System.out.println(bicla.getMarca());
    }
    
}

