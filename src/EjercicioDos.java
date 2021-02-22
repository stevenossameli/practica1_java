import java.util.Scanner;

/*
coded By Steven Ossa
Desarrollar un programa para mostrar los primeros n múltiplos m, siendo n y m valores que el
usuario ingresará por consola.
Recordá que un número a es múltiplo de b si a es divisible por b.
 */

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresá el valor de n: ");
        int n = sc.nextInt();

        System.out.println();

        System.out.print("Ingresá el valor de m: ");
        int m = sc.nextInt();

        int count = 0;
        int i = 1;

        while (count < n) {

            if (i % m == 0) {
                System.out.println(i);
                count++;
            }

            i++;
        }
    }
}
