import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Tiene entrada? (1 = si / 2 = no): ");
        int tieneEntrada = teclado.nextInt();

        if (tieneEntrada == 1) {
            System.out.print("Ingrese su edad: ");
            int edad = teclado.nextInt();

            if (edad >= 18) {
                System.out.print("¿Compró entrada VIP? (1 = si / 2 = no): ");
                int esVip = teclado.nextInt();

                if (esVip == 1) {
                    System.out.println("Ingreso a zona VIP");
                } else {
                    System.out.println("Ingreso a zona general");
                }
            } else {
                System.out.print("¿Está acompañado por un adulto? (1 = si / 2 = no): ");
                int acompañado = teclado.nextInt();

                if (acompañado == 1) {
                    System.out.println("Ingreso permitido con acompañante");
                } else {
                    System.out.println("No puede ingresar solo");
                }
            }

        } else {
            System.out.println("No puede ingresar al concierto");
        }
    }
}