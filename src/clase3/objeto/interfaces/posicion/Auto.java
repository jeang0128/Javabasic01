
package clase3.objeto.interfaces.posicion;

    
public class Auto implements Position{
    private int numeroPuertas ;
    private String color;
    
    private double longitud;
    private double latitud;

    public Auto(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }
    
      @Override
    public double getLongitud() {
        return longitud;
    }

    @Override
    public double getLatitud() {
        return latitud;
    }
   

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
