import java.util.Scanner;

public class E11 {
    public static void main(String[] args){
         /*
    Ejercicio 11: Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
    indicando cuántos son positivos y cuantos negativos
     */
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduce 10 numeros, sin ser 0");

        for (int i = 1; i <= 10; i++){
            System.out.println("Numero " + i + ": ");
            int numero = sc.nextInt();

            if(numero > 0){
                positivos++;
            }
            if(numero < 0){
                negativos++;
            }
        }
    System.out.println("El numero de positivos es: " + positivos++);
    System.out.println("El numero de negativos es: " + negativos++);
    }
}
