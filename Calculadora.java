import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Ingrese número 1: ");
        double num1 = t.nextDouble();
        System.out.print("Ingrese número 2: ");
        double num2 = t.nextDouble();
        System.out.println("\nSeleccione una operación:");
        System.out.println("1 = suma");
        System.out.println("2 = resta");
        System.out.println("3 = multiplicación");
        System.out.println("4 = división");
        System.out.print("Opción: ");
        int operacion = t.nextInt();
        switch (operacion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("El resultado de la división es: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
        t.close();
    }
}
