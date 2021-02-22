import java.util.Scanner;

/*
coded By Steven Ossa
Desarrollar un programa para informar si un número n es primo o no, siendo n un valor que el
usuario ingresará por consola.
Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.
 */

public class EjercicioTres {

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
        System.out.print("Ingresá un valor entero: ");
        int n = sc.nextInt();

        if(esPrimo(n)){
            System.out.println("el número " + n + " es primo");
        }else{
            System.out.println("el número " + n + " no es primo");
        }

    }
}
