import java.util.Scanner;

public class EjercicioOperadores {
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 1.
        System.out.println("Ejercicio No. 1: ");
        double operacion = 6 / 2 * (1 + 2);
        System.out.println("El resultado de la operación es: " + operacion);
        // El resultado es 9 porque primero se resuelve el parentesis y posterior,
        // multiplicación y
        // división tiene la misma jerarquia, se realiza la operación de izquierda a
        // derecha.

        // Ejercicio 2.
        /*
         * el precio del producto Pernil Iberic D'Engreix Llen. Azuaga en porción de 100
         * gramos
         * cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€.
         * ¿Crees que es correcto el precio?
         * Programa calcula correctamente el precio por kilo del producto.
         */
        System.out.println("\nEjercicio No. 2: ");
        double precio_gramos = 5.95; // por 100 gramos
        double precio_kilos = precio_gramos * 1000 / 100;
        System.out.println("Si el precio por cada 100g es: " + precio_gramos + " euros.");
        System.out.println("El precio del kilo de Pernil Iberic[...] corresponde a: " + precio_kilos + " euros.");

        // Ejercicio 3.
        /*
         * El agua de las granjas de Minnesota, Iowa, Illinois, Wisconsin, Missouri,
         * Tennesse,
         * Arkansas, Misssissipi y Louisiana desemboca en el Océano Atlántico
         * produciendo un fenómeno
         * llamado zona muerta. Debido a los altos niveles de nitrógeno y fósforo que
         * traen estas aguas
         * los peces mueren en grandes cantidades.
         * Para evitar que mueran cientos y cientos de peces, la ONG Salvemos los peces
         * de colores
         * ha decidido poner en cuarentena a 284 peces rojos y 163 peces azules en un
         * gigantesco acuario,
         * para devolverlos al mar cuando estén curados. ¿Cuántos peces hay en total
         * dentro del acuario?
         */
        System.out.println("\nEjercicio No. 3: ");
        int pecesRojos = 284;
        int pecesAzules = 163;
        System.out.println("En el acuario hay " + (pecesRojos + pecesAzules) + " peces entre rojos y azules.");

        // Ejercicio 4.
        /*
         * La posibilidad de ir al cine entre semana pagando un precio reducido es una
         * tradición en las
         * salas de cine españolas, lo que se conoce como El día del espectador.
         * En algunos cines, el día del espectador suele ser los miércoles y las
         * entradas se reducen
         * hasta en un 70%. La única pega es que suele ir mucha más gente...
         * 
         * Para aprovechar el día del espectador, Carmen decide ir al cine con sus
         * amigos y sale de su
         * casa con 23€. Al regresar se da cuenta que le quedan 12.75€
         * ¿Sabrías programar cuánto se ha gastado?
         */
        System.out.println("\nEjercicio No. 4: ");
        double dinero = 23;
        double restante = 12.75;
        System.out
                .println("Carmen decide ir a cine con " + dinero + " euros y gasta " + (dinero - restante) + " euros.");

        // Ejercicio 5.
        /*
         * El videojuego en el ordenador está viviendo una nueva época de oro con un
         * montón de juegos
         * exclusivos. Para comprarte un PC Gamer deberás fijarte principalmente en el
         * procesador,
         * la tarjeta gráfica, la memoria RAM... pero sobre todo en los accesorios como
         * el teclado y ratón.
         * 
         * Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta
         * 660€ con todos
         * los accesorios incluidos. Sin embargo, el vendedor te descuenta el 10% por
         * pronto pago
         * ¿Cuánto tienes que pagar en total por el ordenador con todos los accesorios?
         */
        System.out.println("\nEjercicio No. 5: ");
        double precio_pc = 660;
        double descuento_pc = 1 - 0.10;
        System.out.println("Para comprar el ordenador con todos los accesorios debo pagar en total: "
                + (precio_pc * descuento_pc) + " euros.");

        // Ejercicio 6.
        /*
         * En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de
         * enero y finalizan
         * a final de marzo. Por otro lado, las rebajas de verano empiezan durante la
         * primera semana del
         * mes de julio y finalizan durante el mes de septiembre.
         * 
         * Para aprovechar la temporada de rebajas he salido de compras.
         * He pagado 34€ por unos pantalones que tenían un descuento del 15%.
         * ¿Qué precio tenían antes de aplicar el descuento?
         */
        System.out.println("\nEjercicio No. 6: ");
        double valor_pant = 34;
        double descuento_pant = 0.15;
        valor_pant += valor_pant * descuento_pant;
        System.out.println("Los pantalones tenian un valor de " + valor_pant + " euros antes del descuento.");

        // Ejercicio 7.
        /*
         * Escribe un programa que solicite al usuario dos números y luego realice las
         * operaciones de suma,
         * resta, multiplicación y división con esos números. Muestra los resultados en
         * la consola.
         */
        System.out.println("\nEjercicio No. 7: ");
        System.out.println("\n***Programa que opera dos numeros***");

        System.out.print("Por favor ingrese el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Por favor ingrese el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("------------Resultados-----------------");
        System.out.println("La suma de estos numeros es: "+(num1+num2));
        System.out.println("La resta de estos numeros es: "+(num1-num2));
        System.out.println("La multiplicación de estos numeros es: "+(num1*num2));
        System.out.printf("La división de estos numeros es: %.2f",(num1/num2));

        //Ejercicio 8.
        /*Crea un programa que calcule el área y el perímetro de un rectángulo. Solicita al usuario 
        la longitud y el ancho del rectángulo.
         */
        System.out.println("\n\nEjercicio No. 8: ");
        System.out.println("\n *** Programa para calcular área y perímetro de rectángulo***");
        System.out.print("Por favor ingrese la longitud del rectángulo (cm): ");
        double longitud = sc.nextDouble();
        System.out.print("Por favor ingrese el ancho del rectángulo (cm): ");
        double ancho = sc.nextDouble();
        System.out.println("El área del rectángulo es: "+(longitud*ancho)+"cm2.");
        System.out.println("El perímetro del rectángulo es: "+(2*(longitud+ancho))+"cm."); 

        //Ejercicio 9.
        /*Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit
         y Kelvin. Usa las siguientes fórmulas:
            Fahrenheit = Celsius * 9/5 + 32
            Kelvin = Celsius + 273.15
         */
        System.out.println("\n\nEjercicio No. 8: ");
        System.out.println("***Conversor de temperatura***");
        System.out.print("Por favor ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius*(9.0/5))+32;
        double kelvin = celsius + 273.15;
        System.out.printf("%n La temperatuta %.2f °C equivale a %.2f °F y a %.2f °K",celsius, fahrenheit,kelvin);

        //Ejercicio 10.
        /*Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.
         */
        System.out.println("\n\nEjercicio No. 9: ");
        System.out.println("***Programa que calcula la media aritmética***");
        System.out.print("Por favor ingrese el 1er número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Por favor ingrese el 2do número: ");
        double numero2 = sc.nextDouble();
        System.out.print("Por favor ingrese el 3er número: ");
        double numero3 = sc.nextDouble();
        double media = (numero1+numero2+numero3)/3;
        System.out.println("------------------------------------");
        System.out.println("La media de estos números es: "+media);


    
    }

}
