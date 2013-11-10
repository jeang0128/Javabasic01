
package clase3.objeto.interfaces.capital;


public class Imprenta {
    public static void main(String[] args) {
        
        Capitalizable[] array = new Capitalizable[3];
        
        array[0] = new Palabra("MIL NOVECIENTOS NOVENTAY TRES");
        array[1] = new Oracion("la tierra es azul");
        array[2] = new Palabra("JAVA Y SQL");
        
        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i].cambiarMayuscula());
            System.out.println(array[i].cambiarMinuscula());
        }
        
    }
}
