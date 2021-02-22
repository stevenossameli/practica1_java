import java.util.Scanner;

/*
coded By Steven Ossa
Desarrollar un programa para mostrar los primeros n números pares, siendo n un valor que el
usuario ingresará por consola.
Recordá que un número es par cuando es divisible por 2.
 */

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mostrar los n primeros números pares");
        System.out.print("Ingresá el valor de n: ");
        int n = sc.nextInt();

        int count = 0;
        int i = 1;

        while (count < n) {

            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }

            i++;
        }
    }
}
