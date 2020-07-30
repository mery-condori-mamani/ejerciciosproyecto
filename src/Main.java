import biblioteca.Biblioteca;
import biblioteca.Libro;
import biblioteca.Persona;
import ejercicios1.Ciclos;
import ejercicios1.EstructurasCondicionales;
import ejercicios1.ProgramaSimple;

public class Main {
    public static void main(String[] args) {
       /*  // Tener una biblioteca
        Libro caperucita = new Libro();
        Libro laSirenita = new Libro();
        Libro blancaNieves = new Libro();
        Libro sherk = new Libro();
        Libro[] librosDeCuentos = { caperucita, sherk, blancaNieves, laSirenita };
        Biblioteca andrews = new Biblioteca("Andrews", librosDeCuentos);

        Persona persona1 = new Persona("Miguel");
        Persona persona2 = new Persona("Mery");
        andrews.registrarVisita(persona1);

        andrews.prestarLibro(persona1, "La cirenita");*/




       // se crea una instancia de la clase ProgramasSimples,

      ProgramasSimples simple1 = new ProgramasSimples();
      EjerSuma ejer1 = new EjerSuma();
      dibujosAsterisco dib1= new dibujosAsterisco();
      practicandoEjercicios pract = new practicandoEjercicios();
      ProgramaSimple prog1 = new ProgramaSimple();
      EstructurasCondicionales probl1 = new EstructurasCondicionales();
      Ciclos ciclos1 = new Ciclos();

      ciclos1.divisores();

      /*String caden = simple1.invertirCadena("hola");
      System.out.println(caden);*/
    }
}
