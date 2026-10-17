# pruebaparcial
git comandos y POOI


 ## Ejercicio 1: Gestión de un Producto
Consigna :
Crear una clase llamada Producto con los atributos privados: nombre (String), precio (double) y stock (int).
Implementar un constructor que reciba los tres valores y validar que el precio y el stock no sean negativos (si lo son, dejarlos en 0).
Crear un método público void actualizarStock(int cantidad) que permita sumar o restar stock (validando que no quede en negativo).
En el método main, instanciar un producto, modificar su stock y mostrar sus datos por consola.
Para Git:
Crear un repositorio y trabajar sobre el
Crear una rama llamada feature/clase-producto mediante git switch -c feature/clase-producto.
—------------------------------------------------------------------------------------------------------------------------
 ## Ejercicio 2: Gestión de Cuenta Bancaria
Consigna:
Crear una clase llamada CuentaBancaria con los atributos privados: titular (String) y saldo (double).
Implementar un constructor que reciba el titular y un saldo inicial (si el saldo inicial es negativo, asignarle 0.0).
Crear los métodos públicos depositar(double monto) (suma al saldo si el monto es mayor a 0) y retirar(double monto) (resta al saldo solo si hay suficiente dinero disponible; de lo contrario, mostrar un mensaje de error).
Agregar un método para consultar el saldo o mostrar los datos de la cuenta. En el Main, probar realizar operaciones de depósito y retiro.
para Git:
Crear y posicionarse en una nueva rama llamada feature/cuenta-bancaria usando git switch -c feature/cuenta-bancaria.
Recuerda crear tu Repositorio para trabajar.
—------------------------------------------------------------------------------------------------------------------------
 ## Ejercicio 3: Registro de Alumnos y Promedios
Consigna:
Crear una clase Estudiante con los atributos privados: nombre (String) y notas 
Crear un constructor que reciba el nombre y las notas del alumno.
Implementar un método público double calcularPromedio() que sume todas las notas, las divida por la cantidad total y retorne el valor del promedio de los alumnos ingresados.
Implementar un método boolean estaAprobado() que retorne true si el promedio es mayor o igual a 6.0, y false en caso contrario.
En el Main, crear un par de estudiantes y mostrar por pantalla sus nombres, promedios y si están aprobados o desaprobados.
para Git:
Crear una rama llamada feature/sistema-estudiantes.
Recuerda crear el repositorio
