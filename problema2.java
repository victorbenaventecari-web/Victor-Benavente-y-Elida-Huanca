import java.util.Scanner;

public class problema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double monto = teclado.nextDouble();

        if (monto > 100) {
            System.out.print("¿Tiene membresía? (1 = si / 2 = no): ");
            int membresia = teclado.nextInt();

            if (membresia == 1) {
                double descuento = monto * 0.20;
                double total = monto - descuento;
                System.out.println("Descuento del 20%: S/" + descuento);
                System.out.println("Total a pagar: S/" + total);
            } else {
                double descuento = monto * 0.10;
                double total = monto - descuento;
                System.out.println("Descuento del 10%: S/" + descuento);
                System.out.println("Total a pagar: S/" + total);
            }
            
        } else {
            System.out.println("No aplica descuento");
            System.out.println("Total a pagar: S/" + monto);
        }
    }
}
