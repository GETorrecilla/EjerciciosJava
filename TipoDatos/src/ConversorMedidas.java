import java.util.Scanner;

public class ConversorMedidas {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        final double CM_POR_METRO = 100.0;
        final double LIBRAS_POR_KG = 2.20462;
        final double FACTOR_CELSIUS_FAHRENHEIT = 1.8;
        final double OFFSET_FAHRENHEIT = 32.0;

        System.out.println("*************** Conversor de Medidas **************");
         // Metros a Centímetros
        System.out.print("Por favor ingrese la cantidad de metros: ");
        double metros = sc.nextDouble();
        double centrimetros = metros * CM_POR_METRO;
        System.out.println(metros + " metros equivalen a "+centrimetros+" centímetros.\n");

        // Kilogramos a Libras
        System.out.print("Por favor ingrese la cantidad de Kilogramos: ");
        double kg = sc.nextDouble();
        double libras = kg * LIBRAS_POR_KG;
        System.out.println(kg + "Kg equivalen a "+libras+"Lb.\n");
        
        // Grados Celsius a Grados Fahrenheit
        System.out.print("Por favor ingrese los grados Celsius: ");
        double gc = sc.nextDouble();
        double gf = gc * FACTOR_CELSIUS_FAHRENHEIT+OFFSET_FAHRENHEIT;
        System.out.println(gc + "°C equivalen a "+gf+" °F.\n");
        System.out.println("       ¡Gracias por utilizar el conversor!");
        System.out.println("********* Final del conversor de medidas **********");

    }

}
