import java.util.Scanner;

public class bienvenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("MENÚ DE OPCIONES");
        System.out.println("1. Registrar");
        System.out.println("2. Buscar");
        System.out.println("3. Eliminar");
        System.out.println("4. Salir");
        System.out.print("Elija una opción: ");
        
        int opcion = teclado.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Usted está en la opción Registrar");
                break;
            case 2:
                System.out.println("Usted está en la opción Buscar");
                break;
            case 3:
                System.out.println("Usted está en la opción Eliminar");
                break;
            case 4:
                System.out.println("Usted está saliendo del programa");
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        teclado.close();
    }
}