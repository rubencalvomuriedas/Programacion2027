import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {

    /*
    Ejercicio 2: Realiza un programa que muestre un menú de opciones como el siguiente:
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir (incluir manejo de división por 0)
    5. Salir
    El menú debe de repetirse hasta que se escoja la opción 5 (Salir).
     */

        double num1 = 0.0, num2 = 0.0;
        Scanner sc = new Scanner(System.in);
        String opcion = "5";

        do {
            sc = new Scanner(System.in);
            System.out.println("Ingrese la opcion del menu que desea realizar: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = sc.nextLine();

        }
    }
}
