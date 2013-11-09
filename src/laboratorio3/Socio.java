
package laboratorio3;


public class Socio {
private int codigo;
private String nombre;
private String direccion;
// Generar SET y GET
public Socio(int c, String n, String d) {
this.codigo = c;
this.nombre = n;
this.direccion = d;
} 

@Override
public String toString(){
String cadena = "Codigo : " + this.getCodigo();
cadena += "nombre: " + this.getNombre();
cadena += "direccion: " + this.getDireccion();
return cadena;
}

@Override
public boolean equals(Object o){
Socio s = (Socio)o;
if(     this.getCodigo() == s.getCodigo() && 
        this.getNombre().equals(s.getNombre()) &&
        this.getDireccion().equals(s.getDireccion()) ){
return true;
} else {
return false;
} 
}

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
