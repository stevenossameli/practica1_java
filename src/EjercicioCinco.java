import java.util.Scanner;

public class EjercicioCinco {

/*
    Coded By Steven Ossa
    Desarrollar un programa para mostrar por consola los primeros n números naturales que
    tienen al menos m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.
    Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa deberá mostrar por consola
    los primeros 5 números naturales que tienen, al menos, 2 dígitos 3. En este caso la salida
    será: 33, 133, 233, 303, 313.
*/

    public static void digitos(int n, int m, int d) {

        // convertir a char el valor de d
        char dc = Integer.valueOf(d).toString().charAt(0);

        int count = 0;
        int i = 0;

        while (count < n) {

            i++;

            String numero = Integer.valueOf(i).toString();
            long num = numero.chars().filter(ch -> ch == dc).count();

            if (num == m) {
                System.out.println(numero);
                count++;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresá el valor de n (numero de veces): ");
        int n = sc.nextInt();
        System.out.print("Ingresá el valor de m (cantidad de dígitos): ");
        int m = sc.nextInt();
        System.out.print("Ingresá el valor de d (dígito): ");
        int d = sc.nextInt();

        digitos(n, m, d);
    }
}
