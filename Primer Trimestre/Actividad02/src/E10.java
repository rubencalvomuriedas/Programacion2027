import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {

    /*
    Ejercicio 10: . Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha
    leído algún número negativo o no
    */
        Scanner sc = new Scanner(System.in);
        boolean negativo = false;
        System.out.println("Introduce numero(no nulos)");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero" + i + ":");
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("El numero no puede ser cero");
            } else if (numero < 0) {
                negativo = true;
            }
        }
        if (negativo) {
            System.out.println("Error: numeros negativos");
        } else {
            System.out.println("Correcto: Todos los numero son positivos");
        }
    }
}

