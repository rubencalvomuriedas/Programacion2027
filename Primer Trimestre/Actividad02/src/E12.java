import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {

    /*
    Ejercicio 12: Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca
    un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos
    negativos.
     */

        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduce secuencia de números e introduce el 0 para finalizarla:");

        int numero;
        do {
            System.out.print("Número: ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

        } while (numero != 0);


        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
    }
}
