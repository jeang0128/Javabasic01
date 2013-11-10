
package clase3.objeto.interfaces.posicion;


public class Teodolito {
    
    public static void main(String[] args) {
        
        Position carro = new Auto(20,30);
        Position jesus = new Persona(25,28);
        
        
        Teodolito.getDistancia(carro, jesus);
        
    }
    
    public static void getDistancia(Position p1, Position p2){
       double d1 = p1.getLatitud()- p2.getLatitud();
       double d2 = p1.getLongitud()- p2.getLatitud();
       
        System.out.println("la distancia es : "+Math.sqrt(d1*d1 + d2*d2));
    }
}
