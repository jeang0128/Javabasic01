/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5.sockets.socketbasico;

public class TestCliente {
    public static void main(String[] args) {
        Cliente cli = new Cliente("192.168.14.100",99);
        cli.doConectar();
    }
}
