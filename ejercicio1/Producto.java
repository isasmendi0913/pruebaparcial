package ejercicio1;
public class Producto {

    private String nombre;
    private double precio;
    private int stock;
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        if (precio < 0) {
            this.precio = 0.0;
        } else {
            this.precio = precio;
        }
        if (stock < 0) {
            this.stock = 0;
        } else {
            this.stock = stock;
        }
    }
     public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    public void actualizarStock(int i) {
        this.stock += i;
        if (this.stock < 0) {
            this.stock = 0;
        }
    }
}
   
