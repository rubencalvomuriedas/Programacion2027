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
        System.out.println("Ejercicio 1. ");
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
        System.out.println("Ejercicio 2. ");
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
        System.out.println("Ejercicio 3. ");
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

        System.out.println("El máximo es: ");
        System.out.println("El mínimos es: ");

        /*
        Ejercicio 4: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego  muestre por separado la suma de todos los valores positivos y negativos.
        */
        System.out.println("Ejercicio 4. ");
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
        System.out.println("La suma de positivos es: " + sumaP);
        System.out.println("La suma de negativos es: " + sumaN);



        /*
        Ejercicio 5: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
        */
        System.out.println("Ejercicio 5. ");
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


        /*
        Ejercicio 6: Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
        N, escriba M en todas sus posiciones y lo muestre por pantalla.
         */
        System.out.println("Ejercicio 6. ");
        sc = new Scanner((System.in));
        System.out.println("Introduce el valor de N: ");
        int n = sc.nextInt();
        System.out.println("Introduce el valor de M: ");
        double m = sc.nextDouble();

        if(n>0){
            double arrayN [] = new double[n];
            Arrays.fill(arrayN, m);
            System.out.println(Arrays.toString(arrayN));

            for(int i = 0; i < arrayN.length; i++){
                arrayN[i] = m;
                System.out.println(arrayN[i]);
            }
        }
        else{
            System.out.println("Error, imposible crear arrays en negativo.");
        }


        /*
        Ejercicio 7: Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
        todos los valores desde P hasta Q, y lo muestre por pantalla.
         */

        System.out.println("Ejercicio 7: ");
        sc = new Scanner((System.in));
        System.out.println("Introduce el valor de P: ");
        int p = sc.nextInt();
        System.out.println("Introduce el valor de q: ");
        int q = sc.nextInt();

        int dimension = Math.abs(q-p) -1;
        int [] numeros7 = new int [dimension];
        for(int i = 0; i < numeros7.length; i++) {
            if (q > p) {
                numeros7[i] = p + (i + 1);
                System.out.println(numeros7[i]);
            } else {
                numeros7[i] = q + (i + 1);
                System.out.println(numeros7[i]);
            }
        }

        /*
        Ejercicio 8: Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
        mostrará cuántos valores del array son igual o superiores a R.
        */
        System.out.println("Ejercicio 8. ");
        sc = new Scanner(System.in);
        double [] numeros8 = new double [100];

        for(int i = 0; i < numeros8.length; i++){
            numeros8 [i] = Math.random();
        }

        System.out.println("Introduce el valor de R (entre 0 y 1)");
        double r = sc.nextDouble();
        int contadorMayores = 0, contadorMenores = 0;

        for(int i = 0; i < numeros8.length; i++){
            if(numeros8 [i] >= r){
                contadorMayores++;
            }
            else{
                contadorMenores++;
            }
        }
        System.out.println("Los numeros mayores que R son: " + contadorMayores);
        System.out.println("Los numeros menores que R son: " + contadorMenores);


        /*
        Ejercicio 9: Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
        enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
        y mostrará en qué posiciones del array aparece N.
         */
        System.out.println("Ejercicio 9. ");
        sc = new Scanner(System.in);

        int [] numeros9 = new int [100];

        for(int i = 0; i < numeros9.length; i++){
            numeros9 [i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("Introduce el valor de N");
        int nBuscar = sc.nextInt();

        for(int i = 0; i < numeros9.length; i++){
            if(numeros9[i] == nBuscar){
                System.out.println("Aparece en la posicion: " +i);
            }
        }

        /*
        Ejercicio 10: Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
        Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado.
        Luego mostrará la altura media, máxima y mínima, así como cuántas personas miden por encima y
        por debajo de la media.
         */
        System.out.println("Ejercicio 10. ");
        sc = new Scanner(System.in);
        System.out.println("Introduce el valor de N");
        int nAlturas = sc.nextInt();
        double [] alturas = new double [nAlturas];
        double sumaAlturas = 0.0, mediaAlturas = 0.0, maximaAlturas = -Double.MAX_VALUE, minimaAlturas = Double.MAX_VALUE;

        for(int i = 0; i < alturas.length ; i++){
            System.out.println("Introduce el valor de la altura " + (i+1) + ": ");
            alturas[i] = sc.nextDouble();
            sumaAlturas += alturas[i];
        }

        mediaAlturas = sumaAlturas / alturas.length;

        int contadorAlturas = 0;
        for(int i = 0; i < alturas.length; i++){

            maximaAlturas = Math.max(alturas[i], maximaAlturas);
            minimaAlturas = Math.min(alturas[i], minimaAlturas);

            if(alturas[i] >= mediaAlturas){
                contadorAlturas++;
            }
        }

        System.out.println("La media es: " + mediaAlturas);
        System.out.println("La altura maxima es: " + maximaAlturas);
        System.out.println("La altura minima es: " + minimaAlturas);
        System.out.println("Personas por encima de la media: " + contadorAlturas);
        System.out.println("Persona por debajo de la media: " + (Math.abs(alturas.length - contadorAlturas)));


        /*
        Ejercicio 11: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
        el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
        del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
         */
        System.out.println("Ejercicio 11. ");
        sc = new Scanner(System.in);
        int [] array1 = new int [100];
        int [] array2 = new int [100];

        for (int i = 0; i < array1.length; i++){
            array1[i] = i + 1;
        }

        for (int i = 0; i < array2.length; i++){
            array2[i] = array1[(array1.length - 1) - i ];
        }

        for(int num : array2){
            System.out.println(num);
        }

        /*
        Ejercicio 12: Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
        a. Mostrar valores.
        b. Introducir valor.
        c. Salir.
        La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
        posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
        que el usuario elija la opción ‘c’ que terminará el programa.
         */
        System.out.println("Ejercicio 12. ");
        sc = new Scanner(System.in);
        int [] array3 =   new int [10];

        String opcion = "c";

        int contadorPosicion = 0;
        do{
            System.out.println("Escoja la opcion deseada: ");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor: ");
            System.out.println("c. Salir");
            opcion = sc.nextLine();


            switch (opcion) {
                case "a":
                    System.out.println(Arrays.toString(array3));
                    break;

                case "b":
                    sc = new Scanner(System.in);
                    System.out.println("Introduce la posicion donde quieras insertar el valor: ");
                    contadorPosicion = sc.nextInt();
                    if(contadorPosicion < array3.length && contadorPosicion >= 0){
                        array3[contadorPosicion] = sc.nextInt();
                    }
                    else{
                        System.out.println("No se pueden insertar porque la posicion no coincide");
                    }
                    break;

                case "c":
                    System.out.println("El menu se cerrara");
                    break;

                default:
                    System.out.println("Por favor escoja una opcion correcta");

            }

        }while(!opcion.equals("c")); //opcion.equals("c") == false


        /*
        Ejercicio 13: Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
        luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un valor inicial V,
        y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9…
        Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al usuario V, I además de
        N (nº de valores a crear).
         */
    }
}
