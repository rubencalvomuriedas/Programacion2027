//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    String opcion = "";
    int victorias = 0;
    int derrotas = 0;
    int empates = 0;

    String Piedra;
    String Papel;
    String Tijeras;
    String eleccionJugador = "";

    String menu =
            "a. Jugar\n" +
            "b. Resultados\n" +
            "c. Salir";

    do {
        sc = new Scanner(System.in);

        System.out.print("");
        System.out.println(menu);
        System.out.print("");

        opcion = sc.nextLine();

        switch (opcion.toLowerCase()) {

            case "a":
                System.out.println("Haz tu jugada: ");
                sc = new Scanner(System.in);
                System.out.print("");
                System.out.println("\nP - Piedra\n" +
                        "L - Papel\n" +
                        "T - Tijeras\n" +
                        "S - Salir");
                eleccionJugador = sc.nextLine();

                switch (eleccionJugador.toUpperCase()) {
                    case "P":
                        eleccionJugador = "Piedra";
                        break;
                    case "L":
                        eleccionJugador = "Papel";
                        break;
                    case "T":
                        eleccionJugador = "Tijeras";
                        break;
                    case "S":
                        System.out.println("Regresando al menu... ");
                }

                int[] n = {1, 2, 3};
                int nRandom = n[(int) (Math.random() * n.length)];
                String jugadaRival;

                switch (nRandom) {
                    case 1:
                        jugadaRival = "Piedra";
                        break;
                    case 2:
                        jugadaRival = "Papel";
                        break;
                    case 3:
                        jugadaRival = "Tijeras";
                        break;
                    default:
                        jugadaRival = "";
                }
                System.out.print("");
                System.out.println("Tu eleccion es: " + eleccionJugador);
                System.out.println("El rival saca: " + jugadaRival);

                if (eleccionJugador.equals("Piedra") && jugadaRival.equals("Piedra")) {
                    System.out.println("EMPATE!!!");
                    empates++;
                } else if (eleccionJugador.equals("Piedra") && jugadaRival.equals("Tijeras")) {
                    System.out.println("VICTORIA!!!");
                    victorias ++;
                } else if (eleccionJugador.equals("Piedra") && jugadaRival.equals("Papel")) {
                    System.out.println("DERROTA!!!");
                    derrotas++;
                } else if (eleccionJugador.equals("Papel") && jugadaRival.equals("Papel")) {
                    System.out.println("EMPATE!!!");
                    empates++;
                } else if (eleccionJugador.equals("Papel") && jugadaRival.equals("Piedra")) {
                    System.out.println("VICTORIA!!!");
                    victorias++;
                } else if (eleccionJugador.equals("Papel") && jugadaRival.equals("Tijeras")) {
                    System.out.println("DERROTA!!!");
                    derrotas++;
                } else if (eleccionJugador.equals("Tijera") && jugadaRival.equals("Tijera")) {
                    System.out.println("EMPATE!!!");
                    empates++;
                } else if (eleccionJugador.equals("Tijera") && jugadaRival.equals("Papel")) {
                    System.out.println("VICTORIA!!!");
                    victorias++;
                } else if (eleccionJugador.equals("Tijera") && jugadaRival.equals("Piedra")) {
                    System.out.println("DERROTA!!!");
                    derrotas++;
                }

                break;

            case "b":
                System.out.println("");
                System.out.println("Victorias: " + victorias);
                System.out.println("Derrotas: " + derrotas);
                System.out.println("Empates: " + empates);

                break;

            case "c":
                System.out.println("\nSaliendo...");
                break;

            default:
                System.out.println("\nSeleccione una opcion correcta por favor...");
                break;
        }
    }while (!opcion.equals("c")) ;
}
