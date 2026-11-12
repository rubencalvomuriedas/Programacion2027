//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc;

    final String ibanPattern = "[A-Z]{2}[0-9]{22}";
    final String titularPattern = "[a-z A-Z]{3,}";

    String titular = MiUtils.comprobarPatronRepetidamente(titularPattern, "Introduce un titular: ");
    String IBAN = MiUtils.comprobarPatronRepetidamente(ibanPattern, "Introduce un IBAN: ");

    CuentaBancaria miCuenta = new CuentaBancaria(IBAN, titular);

    String opcion = "";

    do {
        sc = new Scanner(System.in);

        MenuOpciones();
        opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                System.out.println(miCuenta.infoCuentaBancaria());
                break;

            case "2":
                System.out.println("El IBAN es: " + miCuenta.getIBAN());
                break;

            case "3":
                System.out.println("El Titular es: " + miCuenta.getTitular());

            case "4":
                System.out.println("El saldo es: " + miCuenta.getSaldo());
                break;

            case "5":
                ingresar(miCuenta);
                break;

            case "6":
                retirar(miCuenta);

            case "7":
                System.out.println(miCuenta.infoMovimientos());
                break;

            case "8":
                System.out.println("Saliendo...");

            default:
                System.out.println("Seleccione una opcion correcta (1-8)...");
        }
    } while (!opcion.equals("8"));

}

    private static void retirar (CuentaBancaria miCuenta){
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad a retirar: ");
        double retirar = sc.nextDouble();

        if (miCuenta.retirar(retirar)) {
            System.out.println("Operacion realizada con éxito.");
            if (Math.abs(retirar) > 3000) {
                System.out.println("Hacienda fue notificada con satisfacción.");
            }
        } else {
            System.out.println("No se puede realizar la operacion, su sueldo queda por debajo de -50€");
        }
    }

    private static void ingresar (CuentaBancaria miCuenta){
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad que desea ingresar: ");
        double cantidad = sc.nextDouble();

        if (miCuenta.ingresar(cantidad)) {
            System.out.println("Operacion realizada con éxito.");
            if (cantidad > 3000) {
                System.out.println("Hacienda fue notificada con satisfacción.");
            }
        } else {
            System.out.println("Error...");
        }
    }

    private static void MenuOpciones () {
        System.out.println("Escoga la opcion que desee:");
        System.out.println("1. Datos de la cuenta.");
        System.out.println("2. IBAN.");
        System.out.println("3. Titular");
        System.out.println("4. Saldo");
        System.out.println("5. Ingreso");
        System.out.println("6. Retirada");
        System.out.println("7. Movimientos");
        System.out.println("8. Salir");
    }



