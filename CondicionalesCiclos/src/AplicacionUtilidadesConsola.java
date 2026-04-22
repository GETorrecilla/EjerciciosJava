import java.util.Scanner;

public class AplicacionUtilidadesConsola {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion, subopcion = 0;
        final var VALOR_PI =  Math.PI;
        System.out.println("******Bienvenido al Programa de Utilidades********");

        do{
        System.out.println("Menú: ");
        System.out.println("1. Calcular Área de una Figura (sub-opción: Círculo o Rectángulo).");
        System.out.println("2. Calcular Edad Futura.");
        System.out.println("3. Verificar si un Número es Primo.");
        System.out.println("4. Salir del programa.");
        System.out.println("Por favor ingrese el número según la opción: ");
        opcion = sc.nextInt();
        switch(opcion) {
            case 1:
                do {
                    System.out.println("Subopciones:\n 1 - Circulo. \n 2 - Rectángulo. \n Ingrese número según la figura:");
                    subopcion = sc.nextInt();
                    if(subopcion == 1){
                        double areaCirculo;
                        System.out.println("Por favor ingrese el radio del circulo: ");
                        double radioCirculo = sc.nextDouble();
                        areaCirculo = VALOR_PI*radioCirculo*radioCirculo;
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("***************************-RESULTADO-********************************");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("El área del circulo de radio %.2f es: %.2f %n",radioCirculo, areaCirculo);
                        System.out.println("----------------------------------------------------------------------");
                        break;

                    } else if (subopcion == 2){
                        double areaRectangulo;
                        System.out.println("Por favor ingrese la longitud del rectángulo: ");
                        double longitud = sc.nextDouble();
                        System.out.println("Por favor ingrese el ancho del rectángulo: ");
                        double ancho = sc.nextDouble();
                        areaRectangulo = longitud * ancho;
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("***************************-RESULTADO-********************************");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("El área del rectángulo de ancho %.2f y longitud %.2f es: %.2f %n",ancho, longitud, areaRectangulo);
                        System.out.println("----------------------------------------------------------------------");
                        break;
                    } else {
                        System.out.println("------------ !! - Ingrese un número válido. ------------");
                    }
                } while(subopcion != 1 || subopcion != 2);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                if(opcion == 4){
                    System.out.println("¡Gracias por utilizar este programa!");
                    break;
                } else {
                    System.out.println("------------ !! - Por favor intente de nuevo. ------------");
                    continue;
                }
        }
        } while (opcion != 4);
        
    }
}
