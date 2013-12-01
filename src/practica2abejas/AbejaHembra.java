
package practica2abejas;

public class AbejaHembra extends Abeja{
    public String nombre;  // hay 2 opciones: obrera o reina
    public int tiempovida; //tiempo de desarrollo

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempovida() {
        return tiempovida;
    }

    public void setTiempovida(int tiempovida) {
        this.tiempovida = tiempovida;
    }
    
    private void comer(){
    }
    private void trabajar(){
    }
    private void reproducirse(){
    }
}
