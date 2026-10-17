package ejercicio3;

public class Estudiante {
    private String nombre;
    private double[] notas; // arreglo para almacenar multiples notas
    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    public double calcularPromedio() {
        if (notas == null || notas.length == 0) {
            return 0.0;
        }
        
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
    public boolean estaAprobado() {
        double promedio = calcularPromedio();
        if (promedio >= 6.0) {
            return true;
        } else {
            return false;
        }
    }
    public void mostrarInformacion() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.printf("Promedio: %.2f \n", calcularPromedio());
        System.out.println("Estado: " + (estaAprobado() ? "Aprobado" : "Reprobado") + "\n");
    }
    public String getNombre() {
        return nombre;
    }

    public double[] getNotas() {
        return notas;
    }
}
