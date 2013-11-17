package clase4.colecciones;

public class Estudiante implements Comparable<Estudiante> {

    private String nombres;
    private String apellidos;
    private String direccion;
    private int codMatricula;
    
    
    public Estudiante(String nombres, String apellidos){
    this.nombres=nombres;
    this.apellidos=apellidos;
    }

    
    @Override
    public int compareTo(Estudiante o) {
        String apellidos = o.getApellidos().toLowerCase();
        String apellidosLocal = this.getApellidos().toLowerCase();
        return apellidosLocal.compareTo(apellidos);
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    /**
     * @return the codMatricula
     */
    public int getCodMatricula() {
        return codMatricula;
    }

    /**
     * @param codMatricula the codMatricula to set
     */
    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }
    public void printEstudiante(){
        System.out.println(this.apellidos+" "+this.nombres);}
    
}
