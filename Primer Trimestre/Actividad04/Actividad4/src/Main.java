import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Ejercicio 1: Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre todos sus valores:
         */

        double [] numerosReales = new double [10];
        for (int i = 0; i < numerosReales.length; i++){
            System.out.println("Introduce el numero real " + (i+1) + ": ");
            numerosReales[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(numerosReales));



        /*
        Ejercicio 2: Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre la suma de todos los valores:
         */

        sc = new Scanner(System.in);
        double[] numerosReales2 = new double[10];
        double suma = 0.0;

        for(int i = 0; i < numerosReales2.length; i++){
            System.out.println("Introduce el numero real " + (i+1) + ": ");
            numerosReales[i] = sc.nextDouble();
            suma += numerosReales[i];
        }

        System.out.println("La sumes es: " + suma);


        /*
        Ejercicio 3: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
        */

        double [] numerosReales3 = new double [10];
        double max = - Double.MAX_VALUE, min = Double.MAX_VALUE;

        for (int i = 0; i < numerosReales3.length; i++) {
            System.out.println("Introduce el numero real " + (i+1) + ": ");
            numerosReales[i] = sc.nextDouble();
        }

        for (int i = 0; i < numerosReales3.length; i++) {
            max = Math.max(numerosReales3[i], max);
            min = Math.min(numerosReales3[i], min);
        }


        /*
        Ejercicio 4: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego  muestre por separado la suma de todos los valores positivos y negativos.
        */
        sc = new Scanner(System.in);
        double [] numerosReales4 = new double [10];
        double sumaP = 0.0, sumaN = 0.0;

        for (int i = 0; i < numerosReales4.length; i++) {
            System.out.println("Introduce el numero real " + (i+1) + ": ");
            numerosReales4[i] = sc.nextDouble();
            if(numerosReales4[i] >= 0) {
                sumaP += numerosReales4[i];
            }
            else{
                sumaN += numerosReales4[i];
            }

        }
        System.out.println("La suma es: " + sumaP);
        System.out.println("La suma es: " + sumaN);



        /*
        Ejercicio 5: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
        */
        sc = new Scanner(System.in);
        double [] numerosReales5 = new double [10];
        double suma5 = 0.0;

        for (int i = 0; i < numerosReales5.length; i++) {
            System.out.println("Introduce el numero real " + (i+1) + ": ");
            numerosReales4[i] = sc.nextDouble();
            suma5 += numerosReales5[i];

        }

        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + (suma / numerosReales5.length));

    }
}
