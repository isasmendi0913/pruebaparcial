package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan Pérez", new double[]{7.5, 8.0, 6.5});
        estudiante.mostrarInformacion();

        Estudiante estudiante2 = new Estudiante("María López", new double[]{5.0, 4.5, 6.0});
        estudiante2.mostrarInformacion();

        Estudiante estudiante3 = new Estudiante("Pedro Rodríguez", null);
        estudiante3.mostrarInformacion();
    }
}