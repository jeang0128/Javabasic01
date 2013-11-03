
package app.clase2.persona;

public class Persona {

    
    public String nombre;
    public String apellidos;    
    public int edad;
    
/*public Persona(String nombres, String apellidos, int edad) {
    this.nombre=nombres;  //this significa a la misma clase persona
    this.apellidos=apellidos;
    this.edad=edad;
    
    }*/

    public void setNombresyApellidos(String name, String ape){
        this.nombre = name;
        this.apellidos = ape;
        System.out.println(nombre+"..."+apellidos);
        }

    public void printNombreCompleto(){
    
         System.out.println(nombre+" "+apellidos);
    
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        
}
