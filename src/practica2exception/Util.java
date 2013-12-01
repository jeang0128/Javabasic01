package practica2exception;



public class Util {
    
    String respu;
     
    public static String estaEnRango(int valor, int desde, int hasta) throws FueraDeRangoException {
    
        try {
            if(desde<valor && valor<hasta){
                System.out.println("El valor esta en el rango");
            }
        } catch (FueraDeRangoException e) {
            System.out.println("ErRoR..."+e.toString();
        }
         
            return  respu;   
    }
}
