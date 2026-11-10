import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {

    private int id;
    private String fecha;
    private Tipo tipo;
    private double cantidad;

    private static int contadorMoviemiento = 0;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
    public Movimiento(){}

    public Movimiento(Tipo tipo, double cantidad){
        this.id = contadorMoviemiento;
        this.fecha = LocalDateTime.now().format(dtf);
        this.tipo = tipo;
        this.cantidad = cantidad;

        contadorMoviemiento++;
    }

    public int getId(){
        return this.id;
    }

    public String getFecha(){
        return this.fecha;
    }

    public Tipo getTipo(){
        return this.tipo;
    }

    public double getCantidad(){
        return this.cantidad;
    }

    public String mostrarInfoMovimiento(){
        String infoMovimiento = "";
        infoMovimiento += "ID: " + this.id + "\n";
        infoMovimiento += "Fecha: " + this.fecha + "\n";
        infoMovimiento += "Tipo: " + this.tipo + "\n";
        infoMovimiento += "Cantidad: " + this.cantidad + "€" + "\n";
        return infoMovimiento;
    }
}
