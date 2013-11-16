
package practica.granja;


public class Alimento {
    
    private String nombre;
    private String tipo;   //  tipo de alimento: carne, fruta o cereal
    private String unidad_de_medida;
    private double costoxunidad;
    private String valor_nutricional;
    private String lista_de_nutrientes;
    private int cantidad_de_nutrientes;

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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the unidad_de_medida
     */
    public String getUnidad_de_medida() {
        return unidad_de_medida;
    }

    /**
     * @param unidad_de_medida the unidad_de_medida to set
     */
    public void setUnidad_de_medida(String unidad_de_medida) {
        this.unidad_de_medida = unidad_de_medida;
    }

    /**
     * @return the costoxunidad
     */
    public double getCostoxunidad() {
        return costoxunidad;
    }

    /**
     * @param costoxunidad the costoxunidad to set
     */
    public void setCostoxunidad(double costoxunidad) {
        this.costoxunidad = costoxunidad;
    }

    /**
     * @return the valor_nutricional
     */
    public String getValor_nutricional() {
        return valor_nutricional;
    }

    /**
     * @param valor_nutricional the valor_nutricional to set
     */
    public void setValor_nutricional(String valor_nutricional) {
        this.valor_nutricional = valor_nutricional;
    }

    /**
     * @return the lista_de_nutrientes
     */
    public String getLista_de_nutrientes() {
        return lista_de_nutrientes;
    }

    /**
     * @param lista_de_nutrientes the lista_de_nutrientes to set
     */
    public void setLista_de_nutrientes(String lista_de_nutrientes) {
        this.lista_de_nutrientes = lista_de_nutrientes;
    }

    /**
     * @return the cantidad_de_nutrientes
     */
    public int getCantidad_de_nutrientes() {
        return cantidad_de_nutrientes;
    }

    /**
     * @param cantidad_de_nutrientes the cantidad_de_nutrientes to set
     */
    public void setCantidad_de_nutrientes(int cantidad_de_nutrientes) {
        this.cantidad_de_nutrientes = cantidad_de_nutrientes;
    }
  
       
}
