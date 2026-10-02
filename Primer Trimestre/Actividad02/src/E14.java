import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {

        /*
        Ejercicio 14: Escribe un programa que calcula el salario neto semanal de un trabajador en función del
        número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
        • Las primeras 35 horas se pagan a tarifa normal.
        • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
        • Las tasas de impuestos son:
        • Los primeros 500 euros son libres de impuestos.
        • Los siguientes 400 tienen un 25% de impuestos.
        • Los restantes un 45% de impuestos.
        Escribir nombre, salario bruto, tasas y salario neto.
         */

        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        double tarifaNormal = 25.0;

        System.out.println("Nombre del trabajador: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce el numero de horas trabajadas: ");
        double horasTrabajadas = sc.nextDouble();

        double salarioBruto = 0.0;
        double salarioNeto = 0.0;
        if(horasTrabajadas >0 && horasTrabajadas <= 35){
            salarioBruto = tarifaNormal * horasTrabajadas;
        } else if(horasTrabajadas > 35){
            salarioBruto = 1.5 * tarifaNormal * (horasTrabajadas-35) + 35 * tarifaNormal;
        }else{
            System.out.println("Las horas trabjadas no pueden ser negativas");
        }

        if(salarioBruto <= 500){
            salarioNeto = salarioBruto;
        } else if (salarioBruto > 500&& salarioBruto <= 900) {
            salarioNeto = 500 + (salarioBruto - 500) * 0.75;
        } else if (salarioBruto > 900) {
            salarioNeto = 500 +  (salarioBruto - 500) * 0.75 + (salarioBruto - 900) * 0.55;
        }

        System.out.println("El nombre del trabajador es: " + nombre);
        System.out.println("El numero de horas trabajadas es: " +horasTrabajadas);
        System.out.println("La tarifa por hora es: " + tarifaNormal);
        System.out.println("La salario bruto es: " + salarioBruto);
        System.out.println("La salario neto es: " + salarioNeto);
        System.out.println("Las tasas aplicadas son: " + (salarioBruto - salarioNeto));
    }
}
