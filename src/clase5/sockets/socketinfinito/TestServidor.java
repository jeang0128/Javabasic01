package clase5.sockets.socketinfinito;

import clase5.sockets.socketbasico.*;

public class TestServidor {
    
    
    public static void main(String[] args) {
        
        Servidor server = new Servidor(99);
        server.ejecutar();
                
    }
}
