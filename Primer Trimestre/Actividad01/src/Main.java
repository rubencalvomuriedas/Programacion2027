//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    /*
    Ejercicio 1: Escribe un programa que dé los “buenos días”.
     */

    System.out.println("\nEjercicio 01");
    System.out.println("¡Hola buenos dias mundo!");

    /*
    Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
     */

    System.out.println("\nEjercicio 02");
    double lado = 5;
    double area = lado * lado;
    System.out.println("lado: " + lado);
    System.out.println("area: " + area);

    /*
    Ejercicio 3: Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por
    teclado
    */

    System.out.println("\nEjercicio 03");
    Scanner sc = new Scanner(System.in);
    System.out.println("introduce el valor del lado del cuadrado: ");
    double lado2 = sc.nextDouble();

    double area2 = lado2 * lado2;
    System.out.println("lado = " + lado2);
    System.out.println("area = " + area2);

    /*
    Ejercicio 4: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
    producto y división.
     */

    System.out.println("\nEjercicio 04");
    sc = new Scanner(System.in);
    System.out.println("Introduce el primer numero: ");
    double numero1 = sc.nextDouble();
    System.out.println("Introduce el segundo numero: ");
    double numero2 = sc.nextDouble();

    double suma = numero1 + numero2;
    double resta = numero1 - numero2;
    double multiplicacion = numero1 * numero2;
    double division = numero1 / numero2;

    System.out.println("suma: = " + suma);
    System.out.println("resta: = " + resta);
    System.out.println("multiplicacion: = " + multiplicacion);
    System.out.println("division: = " + division);

    /*
    Ejercicio 5: Escribe un programa que toma como dato de entrada un número que corresponde a la
    longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
    volumen de la esfera que corresponden con dicho radio
     */

    System.out.println("\nEjercicio 05");
    sc = new Scanner(System.in);
    System.out.println("ingresar el radio: ");
    double radio = sc.nextDouble();

    double circulo = 2 * Math.PI * radio;
    System.out.println("el radio es: " + circulo);
    double area3 = Math.PI * radio * radio;
    System.out.println("el area es: " + area3);
    double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    System.out.println("el volumen es: " + volumen);

    /*
    Ejercicico 6: Escribe un programa que dado el precio de un artículo y el precio de venta real nos
    muestre el porcentaje de descuento realizado
     */

    System.out.println("\nEjercicio 06");
    sc = new Scanner(System.in);
    System.out.println("Introduce precio del articulo: ");
    double precioV = sc.nextDouble();
    System.out.println("el precio del articulo es: " + precioV);
    System.out.println("Introduce precio del articulo: ");
    double precioR = sc.nextDouble();
    System.out.println("el precio real es: " + precioR);

    double porcentaje = ((precioV - precioR) / precioV) *100.0;
    System.out.println("porcentaje es: " + porcentaje + " % ");

    /*
    Ejercicio 7: Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
    y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
     */

    System.out.println("\nEjercicio 07");
    sc = new Scanner(System.in);

    System.out.println("Ingresar millas marinas: ");
    double millas = sc.nextDouble();
    System.out.println("millas son: " + millas);

    double metros = millas * 1852.0;
    System.out.println("metros son: " + metros);

    /*
    Ejercicio 8: Escribe un programa que lee dos números y los visualiza en orden ascendente.
     */

    System.out.println("\nEjercicio 08");
    sc = new Scanner(System.in);

    System.out.println("Ingresar numeros: ");
    double Numero1 = sc.nextDouble();
    System.out.println("Numero 1: " + Numero1);
    double Numero2 = sc.nextDouble();
    System.out.println("Numero 2: " + Numero2);

    double menor = Math.min(Numero1, Numero2);
    double mayor = Math.max(Numero1, Numero2);
    System.out.println("numeros en orden ascendente: " +  menor + " - " + mayor);

    /*
    Ejercicio 9: Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
     */

    System.out.println("\nEjercicio 09");
    sc = new Scanner(System.in);

    System.out.println("Ingresar numeros: ");
    double numero4 = sc.nextDouble();
    System.out.println("numero1 : " + numero4);
    double numero5 = sc.nextDouble();
    System.out.println("numero2: " + numero5);

    System.out.println("mayor: " + Math.max(numero4, numero5));
    System.out.println("iguales = " + (numero4 == numero5));


    /*
    Ejercicio 10: Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
     */

    System.out.println("\nEjercicio 10");
    sc = new Scanner(System.in);

    System.out.println("Numeros: ");
    double numero6 = sc.nextDouble();
    System.out.println("numero 1: " + numero6);
    double numero7 = sc.nextDouble();
    System.out.println("numero 2: " + numero7);
    double numero8 = sc.nextDouble();
    System.out.println("numero 3: " + numero8);

    double max = Math.max(Math.max(numero6, numero7), numero8);
    System.out.println("El mayor es: " + max);

    /*
    Ejercicio 11: Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta,
    producto y división. (Ten en cuenta la división por cero)
     */

    System.out.println("\nEjercicio 11");
    sc = new Scanner(System.in);

    System.out.println("Escriba los numeros: ");
    double numero9 = sc.nextDouble();
    System.out.println("numero 1: " + numero9);
    double numero10 = sc.nextDouble();
    System.out.println("numero 2: " + numero10);

    

}

