
package clase3.objeto.interfaces.posicion;


public class Persona implements Position{
    private String nombre;
    private String sexo;
    
    private double longitud;
    private double latitud;

    public Persona(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }
    
    
   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override  // luego de crear la interface y getter and setter 
    public double getLongitud() {// el programa te obliga a crear estos metodos abstractos
        return longitud;
    }

    @Override
    public double getLatitud() {
        return latitud;
    }
}
