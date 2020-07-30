package biblioteca;

public class Biblioteca {
    // atributos
    private String nombre;
    String direccion;
    Estante[] estantes;
    Mesa[] mesas;
    Silla[] sillas;
    Libro[] libros;
    Persona[] registro;
    // Persona recepcionista;

    // contructor
    public Biblioteca(String nombre, String direccion, Estante[] estantes, Mesa[] mesas, Libro[] libros, Silla[] sillas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estantes = estantes;
        this.mesas = mesas;
        this.sillas = sillas;
        this.libros = libros;
    }
    // sobrecarga de constructores
    public Biblioteca(String nombre, Libro[] libros) {
        this.nombre = nombre;
        this.libros = libros;
        this.registro = new Persona[10];
    }

    // metodos
    public void registrarVisita(Persona persona) {
        System.out.println("Se registro a la persona: " + persona.nombre);
    }
    public void registrarVisita(Persona personaRegistrar, Persona personaResgistradora){} //sobrecarga de funciones
    public void prestarLibro(Persona persona, String tituloLibro) {
        System.out.println("Se presto el libro: " + tituloLibro +" a " + persona.nombre);
    }
    public void recibirLibroPrestado(Persona persona, Libro libro) {}
    private int contarCantidaDeLibros(Libro[] libros) {
        return libros.length;
    }
}
