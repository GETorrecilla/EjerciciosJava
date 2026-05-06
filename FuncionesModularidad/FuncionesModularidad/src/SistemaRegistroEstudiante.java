import java.util.Scanner;

public class SistemaRegistroEstudiante {
    static String nombreGlobal;
    static double [] notasGlobal = new double[3];
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    registrarEstudiante(sc);
                    break;
                case 2:
                    mostrarInfoEstudiante();
                    break;
                case 3:
                    if(calcularPromedioEstudiante()==0.00 && nombreGlobal== null){
                        System.out.println("No existe un estudiante con notas registradas.");
                    } else {
                        System.out.printf("El promedio del estudiante es: %.2f %n",calcularPromedioEstudiante());
                    }
                    break;
                default:
                    if (opcion == 0) {
                        System.out.println("¡Gracias por utilizar el sistema de registro de estudiantes!");
                        break;
                    } else {
                        System.out.println("------------ !! - Por favor intente de nuevo. ------------");
                        continue;
                    }
            }
        } while (opcion != 0); // Se repite mientras no sea la opción Salir
    }

    public static void menu() {
        System.out.println("-----------------------------------------------------");
        System.out.println("\n------- Sistema de Registro de Estudiantes -------");
        System.out.println("1. Registrar datos de un estudiante");
        System.out.println("2. Mostrar datos del estudiante actual");
        System.out.println("3. Calcular promedio de notas del estudiante actual");
        System.out.println("0. Salir");
        System.out.println("-----------------------------------------------------");
        System.out.println("Ingrese su opción:");
    }

    public static void registrarEstudiante(Scanner sc) {
        String nombre;
        do {
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = sc.nextLine();
            nombreGlobal = nombre;
        } while (!validarNombre(nombre));

        double notas [] = new double[3];
        for(int i = 0; i < notas.length; i++){
            do {
                System.out.println("Ingrese la nota No." +(i+1)+": ");
                notas[i] = sc.nextDouble();
                notasGlobal[i] = notas[i];
            } while (validarNota(notas[i])==false);
        }
        
    }

    public static void mostrarInfoEstudiante() {
        if(nombreGlobal == null || nombreGlobal.equals("N/A") || nombreGlobal.isBlank()){
            System.out.println("¡¡¡No se ha registrado ningún estudiante!!!");
        } else {
            System.out.println("El nombre del estudiante es: "+nombreGlobal);
            System.out.println("Sus notas son: ");
            for(int i=0; i<notasGlobal.length; i++) {
                System.out.println("Nota "+(i+1)+": "+notasGlobal[i]);
            }
        }
    }

    public static double calcularPromedioEstudiante() {
        double suma=0;
        double promedio;
        if(notasGlobal.length > 0) {
            for(int i=0; i<notasGlobal.length; i++){
                suma+=notasGlobal[i];
            }
            promedio = suma/notasGlobal.length;
        } else {
            promedio = 0.0;
        }
        return promedio;
    }


    public static boolean validarNota(double nota) {
            return nota >= 0.0 && nota <= 100.0;
    }

    public static boolean validarNombre(String nombre){
        return nombre != null && !nombre.isBlank();
    
    }

}
