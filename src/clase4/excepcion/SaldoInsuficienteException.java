package clase4.excepcion;

public class SaldoInsuficienteException extends Exception {

    public double saldo, cuantoDesea;

    public SaldoInsuficienteException(double saldo, double cuantoDesea) {
        super("En su cuenta tiene " + saldo + " soles. No puede prestarse "
                + cuantoDesea + " soles.");
        this.saldo = saldo;
        this.cuantoDesea = cuantoDesea;
    }
}
