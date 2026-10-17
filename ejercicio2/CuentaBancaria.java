package ejercicio2;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo < 0) {
            this.saldo = 0.0;
        } else {
            this.saldo = saldo;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
        else {
            System.out.println(" Error El monto a depositar debe ser mayor que cero.");
        }

    }
    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                this.saldo -= monto;
            } else {
                System.out.println("Error: Fondos insuficientes para realizar el retiro.");
            }
        } else {
            System.out.println("Error: El monto a retirar debe ser mayor que cero.");
        }
    }

    public void consulta (String  titular, double saldo) {
        
            System.out.println("Consulta realizada  del titular " + titular + " con éxito. Saldo actual: $" + saldo);

        }
    
}
