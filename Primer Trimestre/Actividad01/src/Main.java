//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    /*
    Ejercicio 1: Escribe un programa que dé los “buenos días”.
     */

    System.out.println("Ejercicio 01");
    System.out.println("¡Hola buenos dias mundo!");

    /*
    Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
     */

    System.out.println("Ejercicio 02");
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
    System.out.println("Introduce la longitud del radio: ");

    System.out.println("\nEjercicio 05");
    sc = new Scanner(System.in);
    System.out.println("ingresar el radio");
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
}

