package clase6;

//import clase5.sockets.socketinfinito.*;
import clase5.sockets.socketbasico.*;

public class TestServidor {
    
    
    public static void main(String[] args) {
        
        Servidor servi = new Servidor(99);
        servi.ejecutar();
                
    }
}
