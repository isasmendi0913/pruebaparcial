// Método main para probar la clase
    public static void main(String[] args) {
        Producto miProducto = new Producto("Laptop Lenovo", 750.50, 10);

       
        System.out.println("--- Datos Iniciales ---");
        System.out.println("Producto: " + miProducto.getNombre());
        System.out.println("Precio: $" + miProducto.getPrecio());
        System.out.println("Stock: " + miProducto.getStock());

        miProducto.actualizarStock(5);
        System.out.println("\n--- Stock actualizado (+5) ---");
        System.out.println("Stock actual: " + miProducto.getStock());

       
        miProducto.actualizarStock(-3);
        System.out.println("\n--- Stock actualizado (-3) ---");
        System.out.println("Stock actual: " + miProducto.getStock());
    }
}