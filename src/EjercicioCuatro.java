import java.util.Scanner;

/*
Coded By Steven Ossa
Desarrollar un programa para mostrar por consola los primeros n números primos, siendo n
un valor que el usuario ingresará por consola.
 */

public class EjercicioCuatro {

    public static boolean esPrimo(int n){
        int contador = 2;
        boolean primo = true;
        while((primo) && (contador!=n)){
            if(n % contador == 0){
                primo = false;
            }
            contador++;
        }

        return primo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mostrar los primeros n números primos");
        System.out.print("Ingresá el valor de n: ");
        int n = sc.nextInt();

        int contador = 0;
        int i = 1;

        while(contador < n){

            i++;

            if(esPrimo(i)){
                System.out.println(i);
                contador++;
            }

        }
    }
}
