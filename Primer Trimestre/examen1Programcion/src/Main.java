//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner entrada = new Scanner(System.in);
    int tamanoInicial = 0;
    System.out.println("Introducir la cantidad inicial de numeros a almacenar, debe ser mayor a 0: ");

    if(entrada.hasNextInt()){
        tamanoInicial = entrada.nextInt();
    }
    entrada.nextLine();

    if(tamanoInicial <= 0){
        System.out.println("Error, el tamaño debe ser mayor que 0, vuelve a intentarlo.");
    }

    int [] coleccion = new int[tamanoInicial];
    Arrays.fill(coleccion, 0);

    int opcion = 0;

    do{
        System.out.println("\n=============== MENÚ PRINCIPAL ===============");

        System.out.println("1. Modificar colección.");
        System.out.println("2. Estadísticas de la colección.");
        System.out.println("3. Ampliar el valor de la colección.");
        System.out.println("4. Salir.");
        System.out.println("Seleccione una opcion: ");

        if(entrada.hasNextInt()){
            opcion = entrada.nextInt();
        } else{
            opcion = 0;
        }
        entrada.nextLine();

        switch (opcion) {
            case 1:

                System.out.println("\n--- Modificar Colección ---");
                System.out.println("1. Insertar número.");
                System.out.println("2. Borrar numero de una posicion especifica.");
                System.out.println("3. Modificar número de una posición específica.");

                int subOpcion = 0;
                if (entrada.hasNextInt()) {
                    subOpcion = entrada.nextInt();
                }
                entrada.nextLine();

                if (subOpcion == 1) {

                    System.out.println("Introduce el numero a insertar: ");
                    int numInsertar = 0;
                    if (entrada.hasNextInt()) {
                        numInsertar = entrada.nextInt();
                    }
                    entrada.nextLine();

                    int posLibre = -1;
                    for (int i = 0; i < coleccion.length; i++) {
                        if (coleccion[i] == 0) {
                            posLibre = i;
                            break;
                        }
                    }

                    if (posLibre != -1) {
                        coleccion[posLibre] = numInsertar;
                        System.out.println("Numero insertado correctamente" + posLibre);
                    } else {
                        System.out.println("Error...");
                    }
                } else if (subOpcion == 2) {
                    System.out.print("Introduce la posición a borrar (0 a " + (coleccion.length - 1) + "): ");

                    int posBorrar = -1;

                    if (entrada.hasNextInt()) {
                        posBorrar = entrada.nextInt();
                    }
                    entrada.nextLine();

                    if (posBorrar >= 0 && posBorrar < coleccion.length) {
                        coleccion[posBorrar] = 0;
                        System.out.println("Posición " + posBorrar + " borrada correctamente.");
                    } else {
                        System.out.println("Error: Posicion fuera de rango...");
                    }
                } else if (subOpcion == 3) {
                    System.out.print("Introduce la posición a modificar (0 a " + (coleccion.length - 1) + "): ");
                    int posMod = -1;
                    if (entrada.hasNextInt()) {
                        posMod = entrada.nextInt();
                    }
                    entrada.nextLine();

                    if (posMod > 0 && posMod < coleccion.length) {
                        System.out.println("Introducir el nuevo valor: ");

                        int nuevoValor = 0;
                        if (entrada.hasNextInt()) {
                            nuevoValor = entrada.nextInt();
                        }
                        entrada.nextLine();

                        coleccion[posMod] = nuevoValor;
                        System.out.println("Posición " + posMod + " modificada con éxito");
                    } else {
                        System.out.println("Error: Posición fuera de rango.");
                    }
                    break;
                }

            case 2:

                System.out.println("\n--- Estadísticas de la colección ---");

                int sumaTotal = 0;
                int contadorNoNulos = 0;
                int maximo = 0;
                int minimo = 0;
                boolean primerNoNuloEncontrado = false;

                System.out.println("El estado actual es: ");
                for(int i = 0; i < coleccion.length; i++){
                    System.out.print(coleccion[i] + (i < coleccion.length - 1 ? ", " : ""));
                }
                 for(int valor: coleccion){
                     sumaTotal += valor;

                     if(valor !=0){
                         contadorNoNulos++;
                         if (!primerNoNuloEncontrado){
                             maximo = valor;
                             minimo = valor;
                             primerNoNuloEncontrado = true;
                         }else{
                             if(valor > maximo){
                                 minimo = valor;
                             }
                         }
                     }
                 }

                 System.out.println(" Suma total de los valores: " + sumaTotal);

                 if (contadorNoNulos > 0){
                     double media = sumaTotal / contadorNoNulos;

                     System.out.println("Media de todos los valores no nulos: " + media);
                     System.out.println("Mínimo de la colección: " + maximo);
                     System.out.println("Máximo de la colección: " + minimo);
                 }
                 break;

            case 3:

                System.out.println("introduce cuantas posiciones deseas añadir al tamaño actual: ");

                int incremento = 0;

                if(entrada.hasNextInt()){
                    incremento = entrada.nextInt();
                }
                entrada.nextLine();

                if(incremento > 0){
                    int nuevoTamano = coleccion.length + incremento;
                    int [] nuevaColeccion = new int[nuevoTamano];

                    for(int i = 0; i < coleccion.length; i++){
                        nuevaColeccion[i] = coleccion[i];
                    }
                    for(int i = coleccion.length; i < nuevaColeccion.length; i++){
                        nuevaColeccion[i] = 0;
                    }
                    coleccion = nuevaColeccion;

                    System.out.println("Coleccion ampliada con éxito, su nuevo tamaño es: " + coleccion.length);
                }else{
                    System.out.println("Error, la ampliacion debe ser un número mayor que 0.");
                }
                break;

            case 4:

                System.out.println("Saliendo... ");
                break;

            default:

                System.out.println("Opción no válida, introduzca un valor entre 1 y 4 ¡COMO PONE EN EL MENU!");
                break;
        }


    } while (opcion != 4);

    entrada.close();
}


