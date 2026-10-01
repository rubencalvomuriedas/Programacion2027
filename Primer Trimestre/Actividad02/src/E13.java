import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {

        /*
        Ejercicio 13: Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros
        números naturales.
         */

        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int multiplicacion = 1;
         for(int i = 1; i <=10; i++){
             suma += i;
             multiplicacion *= i;
         }

        System.out.println("La suma de los 10 primeros números naturales es: " + suma);
        System.out.println("La multiplicacion de los 10 primeros números naturales es: " + multiplicacion);
    }
}
