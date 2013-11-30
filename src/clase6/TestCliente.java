
package clase6;

//import clase5.sockets.socketinfinito.*;

import clase5.sockets.socketbasico.Cliente;


//import clase5.sockets.socketbasico.*;

public class TestCliente {
    public static void main(String[] args) {
        Cliente cli = new Cliente("192.168.14.14",99);
        cli.doConectar();
    }
}
