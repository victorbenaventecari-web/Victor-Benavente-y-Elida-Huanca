import java.util.Scanner;

public class problema1 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
       System.out.print("Ingrese edad: ");
        boolean tieneEntrada = true;
        int edad = teclado.nextInt();
        if (tieneEntrada == true) {
            if (edad >= 18) {
                System.out.println("Puede entrar a cualquier película.");
            } else {
                System.out.println("Solo puede entrar a películas familiares.");
            }

        } else {
            System.out.println("No puede ingresar al cine.");
        }

    }
}
