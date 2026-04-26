import java.util.Scanner;

public class AplicacionUtilidadesConsola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner para leer entrada por consola
        int opcion, subopcion = 0;
        final var VALOR_PI = Math.PI;
        System.out.println("******Bienvenido al Programa de Utilidades********");

        do {
            //opciones del menú
            System.out.println("Menú: ");
            System.out.println("1. Calcular Área de una Figura (sub-opción: Círculo o Rectángulo).");
            System.out.println("2. Calcular Edad Futura.");
            System.out.println("3. Verificar si un Número es Primo.");
            System.out.println("4. Salir del programa.");
            System.out.println("Por favor ingrese el número según la opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Para opción 1. calcular area.
                    System.out.println("***** Calculadora de área... *****");
                    do {
                        // Preguntar subopciones de opción 1.
                        System.out.println("Subopciones:\n 1 - Circulo. \n 2 - Rectángulo. \n Ingrese número según la figura:");
                        subopcion = sc.nextInt();
                        if (subopcion == 1) {
                            double areaCirculo;
                            System.out.println("Por favor ingrese el radio del circulo (cm): ");
                            double radioCirculo = sc.nextDouble();
                            areaCirculo = VALOR_PI * radioCirculo * radioCirculo;
                            System.out.println("----------------------------------------------------------------------");
                            System.out.println("***************************-RESULTADO-********************************");
                            System.out.println("----------------------------------------------------------------------");
                            System.out.printf("El área del circulo de radio %.2f cm es: %.2f cm2 %n", radioCirculo, areaCirculo);
                            System.out.println("----------------------------------------------------------------------");
                            break;

                        } else if (subopcion == 2) {
                            double areaRectangulo;
                            System.out.println("Por favor ingrese la longitud del rectángulo (cm): ");
                            double longitud = sc.nextDouble();
                            System.out.println("Por favor ingrese el ancho del rectángulo (cm): ");
                            double ancho = sc.nextDouble();
                            areaRectangulo = longitud * ancho;
                            System.out.println("----------------------------------------------------------------------");
                            System.out.println("***************************-RESULTADO-********************************");
                            System.out.println("----------------------------------------------------------------------");
                            System.out.printf("El área del rectángulo de ancho %.2f cm y longitud %.2f cm es: %.2f cm2 %n", ancho,longitud, areaRectangulo);
                            System.out.println("----------------------------------------------------------------------");
                            break;
                        } else {
                            System.out.println("------------ !! - Ingrese un número válido. ------------");
                        }
                    } while (subopcion != 1 || subopcion != 2);
                    break;
                case 2:
                    // Para opción 2. Calculadora de edad futura
                    System.out.println("***** Calculadora de edad futura... *****");
                    System.out.println("Por favor ingrese su año de nacimiento: ");
                    int anioNacimiento = sc.nextInt();
                    System.out.println("Por favor ingrese el año a proyectar: ");
                    int anioFuturo = sc.nextInt();
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("***************************-RESULTADO-********************************");
                    System.out.println("----------------------------------------------------------------------");    
                    System.out.println("La edad que tendrá en el " +anioFuturo+ " será: "+ (anioFuturo-anioNacimiento) + " años.");
                    System.out.println("----------------------------------------------------------------------");
                    break;
                case 3:
                    // Para opción 3. Verificador de numero primo
                    System.out.println("***** Verificador de número primo... *****");
                    System.out.println("Por favor ingrese el número a validar: ");
                    int primo = sc.nextInt();
                    do {
                        if (primo < 0) {
                            System.out.println("------------ !! - Ingrese un número válido. ------------");
                        } else {
                            if (primo == 1 || primo == 0 || (primo != 2 && primo % 2 == 0)) {
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("***************************-RESULTADO-********************************");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("El número " + primo + " no es un número primo.");
                                System.out.println("----------------------------------------------------------------------");
                                break;
                            } else if (primo == 2 || (primo % 1 == 0 && primo % primo == 0)) {
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("***************************-RESULTADO-********************************");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("El número " + primo + " es primo.");
                                System.out.println("----------------------------------------------------------------------");
                                break;
                            }
                        }
                    } while (primo > 0);
                    break;
                default:
                    if (opcion == 4) {
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
