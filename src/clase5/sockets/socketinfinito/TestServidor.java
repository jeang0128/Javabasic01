package clase5.sockets.socketinfinito;

import clase5.sockets.socketbasico.*;
import clase6.Servi;

public class TestServidor {
    
    
    public static void main(String[] args) {
        
        Servi server = new Servi(99);
        server.ejecutar();
                
    }
}
