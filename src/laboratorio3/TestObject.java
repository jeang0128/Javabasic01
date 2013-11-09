
package laboratorio3;


public class TestObject {
 
    public static void main(String[] args) {
        Socio s1 = new Socio(302, "David", "Tecsup"); 
        Socio s2= new Socio(302, "David", "Tecsup");
        if (s1 == s2 ) {
        System.out.println("Comprobando referencia");
        }
        if (s1.equals(s2)){
        System.out.println("Comprobando el valor");
        }
    }
}
