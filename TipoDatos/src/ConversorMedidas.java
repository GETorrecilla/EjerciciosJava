import java.util.Scanner;

public class ConversorMedidas {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        final double CM_POR_METRO = 100.0;
        final double LIBRAS_POR_KG = 2.20462;
        final double FACTOR_CELSIUS_FAHRENHEIT = 1.8;
        final double OFFSET_FAHRENHEIT = 32.0;
        final var LITROS_POR_GALON = 0.264;

        System.out.println("*************** Conversor de Medidas **************");
         // Metros a Centímetros
        System.out.print("Por favor ingrese la cantidad de metros: ");
        double metros = sc.nextDouble();
        var centrimetros = metros * CM_POR_METRO;
        System.out.println(metros + " metros equivalen a "+centrimetros+" centímetros.\n");

        // Kilogramos a Libras
        System.out.print("Por favor ingrese la cantidad de Kilogramos: ");
        double kg = sc.nextDouble();
        var libras = kg * LIBRAS_POR_KG;
        System.out.printf("%.2f Kg equivalen a %.2f Lb. %n%n",kg,libras);
        
        // Grados Celsius a Grados Fahrenheit
        System.out.print("Por favor ingrese los grados Celsius: ");
        double gc = sc.nextDouble();
        var gf = gc * FACTOR_CELSIUS_FAHRENHEIT+OFFSET_FAHRENHEIT;
        System.out.printf("%.1f°C equivalen a %.1f°F.%n%n",gc,gf);

        // Litros a Galones
        System.out.print("Por favor ingrese la cantidad en litros: ");
        double litros = sc.nextDouble();
        var galones = litros * LITROS_POR_GALON;
        System.out.printf("%.2f litros equivalen a %.2f Galones.%n%n",litros,galones);

        //Despedida
        System.out.println("       ¡Gracias por utilizar el conversor!");
        System.out.println("********* Final del conversor de medidas **********");

    }

}
