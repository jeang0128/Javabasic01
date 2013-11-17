package clase4.excepcion;

public class Cuenta {

    String nombre;
    double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public double retirarCajero(double cuantoDesea) throws SaldoInsuficienteException {

    double saldoActual = 5000;
        if (saldo < cuantoDesea) {
            throw new SaldoInsuficienteException(saldo, cuantoDesea);
        }else {
            return saldo - cuantoDesea;

        }
        
 }
}
