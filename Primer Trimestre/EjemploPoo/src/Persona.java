public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String genero;

    public Persona(String nombre, String apellidos, int edad, String dni, String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDni() {
        return this.dni;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + '\'' +
                ", apellidos='" + this.apellidos + '\'' +
                ", edad=" + this.edad +
                ", dni='" + this.dni + '\'' +
                ", genero='" + this.genero + '\'' +
                '}';
    }


}
