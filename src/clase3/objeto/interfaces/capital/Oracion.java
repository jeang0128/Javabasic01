
package clase3.objeto.interfaces.capital;


public class Oracion implements Capitalizable{
    
    private String texto;

    public Oracion(String texto) {
        this.texto = texto;
    }
    
    
    @Override
    public String cambiarMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiarMinuscula() {
        return texto.toLowerCase();
    }
    
    
}
