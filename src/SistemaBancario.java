import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(1000); // Saldo inicial

        while (true) {
            System.out.println("Bienvenido al sistema bancario. Seleccione una opción:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestro sistema bancario.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}
