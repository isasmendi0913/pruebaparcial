package ejercicio2;
public class Main{
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);

        System.out.println("--- Datos Iniciales ---");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo: $" + cuenta.getSaldo());

        cuenta.depositar(500.0);
        System.out.println("\n--- Depósito realizado (+$500) ---");
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        cuenta.retirar(200.0);
        System.out.println("\n--- Retiro realizado (-$200) ---");
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        cuenta.consulta(cuenta.getTitular(), cuenta.getSaldo());
    }
}