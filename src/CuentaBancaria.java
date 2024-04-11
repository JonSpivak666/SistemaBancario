public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado correctamente. Saldo actual: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro realizado correctamente. Saldo actual: " + saldo);
            } else {
                System.out.println("Fondos insuficientes para realizar el retiro.");
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es: " + saldo);
    }
}

