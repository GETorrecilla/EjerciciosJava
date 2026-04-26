import java.util.Scanner;

public class SistemaIndustrial {
    static Scanner sc = new Scanner(System.in);
    static int stockMateria = 500; //kg
    static int materiaPrima = 25; //kg
    static int produccionMaxima = 20; //piezas
    static boolean estaFuncionando = true;
    static int piezasProducidas = 0;
    
    public static void main(String[] args) {
        login(); //llamado al metodo
    }

    public static void login(){
        final var codigoEmpleado = 4567; //con turno 1,2, 3
        int codigo = 0; // Para entrada de codigo
        int turno = 0; // Para entradas de turno
        int intentos = 0;
        Boolean isCorrecto = false; //bandera
        
        System.out.println("******Bienvenido al sistema Industrial********");
        System.out.println("----------------------------------------------");
        do{
            System.out.println("Por favor ingrese su código de empleado: ");
            codigo = sc.nextInt();
            System.out.println("Por favor ingrese su no. de turno: ");
            turno = sc.nextInt();
            if (codigo == codigoEmpleado && (turno == 1 || turno == 2 || turno == 3)) {
                isCorrecto = true;
                System.out.println("****** Bienvenido ******");
                menu();                
            } else{
                System.out.println("--------- ¡Datos ingresados inválidos!  -----------");
                intentos++;
            }
        } while(!isCorrecto && intentos < 3);
        if(intentos == 3){
            System.out.println("--------- ¡Acceso denegado! --------");
        }
    }

    public static void menu() {
        int opcion;
        do {
            System.out.println("Menú: ");
            System.out.println("1. Producir piezas");
            System.out.println("2. Ver stock de materia prima");
            System.out.println("3. Reportar daño de máquina");
            System.out.println("4. Cerrar turno");
            System.out.println("Por favor ingrese el número según la opción: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Produciendo piezas...");
                    produccionPiezas();
                    break;
                case 2:
                    System.out.println("El Stock de materia prima es: "+stockMateria + "Kg.");
                    break;
                case 3:
                    System.out.println("Reportando daño...");
                    reportarDanio();
                    break;
                case 4:
                    System.out.println("------------Resumen turno--------------");
                    System.out.print("Total de piezas producidas: "+piezasProducidas +" unidad(es). \n");
                    System.out.print("Materia prima restante: "+stockMateria +"Kg \n");
                    String estado;
                    if(estaFuncionando){
                        estado = "Funcionando.";
                    } else {
                        estado = "Fuera de servicio.";
                    }
                    System.out.print("El estado de la máquina es: "+estado +" \n");
                    System.out.println("---------------------------------------");
                    System.out.println("Su turno ha terminado. ¡Hasta pronto!");
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
    }

    public static void produccionPiezas(){
        System.out.println("Por favor ingrese la cantidad de piezas a fabricar: ");
        int piezasProduccion = sc.nextInt();
        if(piezasProduccion>0 && piezasProduccion < produccionMaxima){
            int materiaNecesaria = piezasProduccion * materiaPrima;
            if(materiaNecesaria <= stockMateria){
                stockMateria -= materiaNecesaria;
                System.out.println("----------------------------------");
                System.out.println("Producción realizada con éxito.");
                System.out.println("Stock restante: "+stockMateria +"Kg.");
                System.out.println("----------------------------------");
                piezasProducidas += piezasProduccion;
            } else {
                System.out.println("Stock de materia prima insuficiente.");
            }
        } else {
            System.out.println("¡Piezas a producir inválidas!");
        }
    }
    public static void reportarDanio(){
        System.out.println("----------------------------------");
        System.out.println("Máquina en mantenimiento.");
        System.out.println("Producción detenida.");
        System.out.println("----------------------------------");
        estaFuncionando = false;
    }
}
