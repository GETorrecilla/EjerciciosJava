import java.util.Scanner;

public class CalculadoraCompra {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Escaner para leer entradas

        final var TASA_IMPUESTO = 0.15; // 15% de impuesto

        System.out.println("*****************************************************");
        System.out.println("****************Calculadora de Compras***************");
        System.out.println("*****************************************************");

        /*
         * Solicitando datos al usuario: precio unitario, cantidad de artículos, dinero
         */
        System.out.print("Por favor ingrese el precio unitario del articulo: ");
        var precio = sc.nextDouble();
        System.out.print("Por favor ingrese la cantidad de articulos comprados: ");
        var cantidad = sc.nextInt();
        System.out.print("Por favor ingrese la cantidad de dinero con que pagará: ");
        var dinero = sc.nextDouble();

        sc.nextLine();

        //Cálcular el subtotal, el monto del impuesto, el total de la compra, el cambio 

        var subtotal = precio * cantidad;
        var montoImpuesto = subtotal * TASA_IMPUESTO;
        var totalCompra = subtotal+montoImpuesto;
        var devuelto = dinero - totalCompra;

       // Impresión de resultados de los cálculos
        System.out.println("\n---------------------Resultado-------------------");
        System.out.printf("El subtotal de la compra es: $%.2f%n", subtotal);
        System.out.printf("El monto del impuesto (%.0f%%) es: $%.2f%n", TASA_IMPUESTO*100,montoImpuesto);
        System.out.printf("El total de la compra es: $%.2f%n", totalCompra);
        System.out.printf("El monto dedevuelto de la compra es: $%.2f%n", devuelto);

        System.out.println("\n*************************************************");
        System.out.println("**********   ¡¡Gracias por su compra!!   ********");
        System.out.println("*************************************************");

    }
}