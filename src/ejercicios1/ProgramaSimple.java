package ejercicios1;

import javax.security.sasl.SaslClient;
import javax.xml.parsers.SAXParser;
import java.lang.reflect.Array;
import java.nio.channels.FileChannel;

import java.util.Scanner;
public class ProgramaSimple {
    public void saludo (){

        System.out.println("Ingrese nombre: ");
        Scanner scan = new Scanner(System.in);

        String nombre= scan.nextLine();
        scan.close();

        System.out.println("Hola, " + nombre);
    }
    public void circulos (){
        System.out.println("Ingrese radio del circulo: ");
        Scanner scan = new Scanner(System.in);

        int radio = scan.nextInt();
        scan.close();

        //Calcular el Perimetro
        double perimetro = 2* Math.PI*radio;
        System.out.println("El perimetro del circulo es: " + perimetro);
        //Calcular el Área

        double area= Math.PI*Math.pow(radio,2);
        System.out.println("El área del circulo es: " + area);
    }
    public void promedio (){
        System.out.println("Ingrese numero de notas: ");
        Scanner scan = new Scanner(System.in);
        int numNot = scan.nextInt();
        System.out.println("Ingrese las notas: ");
        int notas = scan.nextInt();
        scan.close();
        int sumatoria = 0;

        for (int i=0;i<numNot;i++){
            notas = scan.nextInt();
            sumatoria += notas;

        }
        //Calculando el Promedio
        double promedio = sumatoria/numNot;
        System.out.println("El promedio de las notas es: " + promedio);
    }
    public void conversionUnidades (){
        System.out.println("Ingrese la longitud a convertir: ");
        Scanner scan = new Scanner(System.in);
        final double pulgada= 2.54;
        int longitud = scan.nextInt();
        scan.close();

        //Calcular la conversion
        double longitudPulgadas = longitud/pulgada;

        System.out.println( longitud + " cm, convertido en pulgadas es de: " + longitudPulgadas + "plg");
    }
    public void numeroInvertido (){
        System.out.println("Ingrese el numero a invertir: ");
        Scanner scan = new Scanner(System.in);
        int numero= scan.nextInt();
        scan.close();

        //Invertir numero
       while (numero>0){
           String aux = "";
           int UltimoValor = numero % 10;
           aux = Integer.toString(UltimoValor);
           numero = numero/10;
           System.out.print(aux);
       }
    }
    //o tambien se puede resolver de la siguiente manera
    public void numeroInvertido2 (){
        System.out.println("Ingrese el numero a invertir: ");
        Scanner scan = new Scanner(System.in);
        scan.close();

        int numero = scan.nextInt();

        int numeroInv= this.numInvert(numero);
        System.out.println(numeroInv);

    }
    //Invertir el numero
    private int numInvert (int numero){
       String aux = "";
        do {
            int UltimoValor = numero % 10;
            aux += Integer.toString(UltimoValor);
            numero = Math.abs(numero/10);

        } while (numero>0);
        int valorInvert = Integer.parseInt(aux);
          return valorInvert;
    }
    public void pitagoras (){
        System.out.println("Ingrese el cateto a: ");
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Ingrese el cateto b: ");
        int b = scan.nextInt();
        scan.close();

        //Calculamos la hipotenusa
        double hipotenusa = Math.sqrt((Math.pow(a,2)+(Math.pow(b,2))));
        System.out.println("La hipotenusa dado los catetos es igual a: " + hipotenusa);
    }
    public void horaFutura (){
        System.out.println("Ingrese hora actual: ");
        Scanner scan= new Scanner(System.in);
        int horaActual = scan.nextInt();
        System.out.println("Ingrese cantidad de horas despues de la hora actual: ");
        int cantidadHoras= scan.nextInt();
        scan.close();

        // Calcular hora futura
        int horaFutura = horaActual+cantidadHoras;
        if (horaFutura<24){
            System.out.println("En " + cantidadHoras + " horas, el reloj, marcara las: " + horaFutura);
        } else {
            horaFutura = horaFutura%24;
            System.out.println("En " + cantidadHoras + " horas, el reloj, marcara las: " + horaFutura);
        }
    }
    public void parteDecimal (){
        System.out.println("Ingrese el numero: ");
        Scanner scan = new Scanner(System.in);
        Double numero= scan.nextDouble();
        scan.close();

        // Calcular la parte decimal

        double decimal = numero % 1;

        if (numero<0){
            decimal = Math.abs(decimal);
        }
        System.out.println("El decimal del numero es: " + decimal);
    }
    public void notaNecesito (){
        System.out.println("Ingrese la primera nota: ");
        Scanner scan = new Scanner(System.in);
        int nota1 = scan.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        int nota2 = scan.nextInt();
        System.out.println("Ingrese la nota de laboratorio: ");
        int notaLaboratorio = scan.nextInt();
        scan.close();

        int nota3 = 0;

        // Buscando la nota que necesito

        double promedioCertamenes = (nota1 + nota2 + nota3)/3;
        double notaFinal = promedioCertamenes*0.7 + notaLaboratorio*0.3;

        do {
            nota3++;
            promedioCertamenes = (nota1 + nota2 + nota3)/3;
            notaFinal = promedioCertamenes*0.7 + notaLaboratorio*0.3;

        } while (notaFinal<=60);
        System.out.println("La nota que necesito es de: " + nota3);
    }
    public void huevosALaCopa (){
        System.out.println("Ingrese temperatura original del huevo: " + " en grados Centigrados.");
        Scanner scan = new Scanner(System.in);
        int temperaturaOriginal = scan.nextInt();

        final int masaHuevoGrande = 67;
        final int masaHuevoPequeño = 47;
        final double densidad = 1.038;
        final double capacidadCalorifica = 3.7;
        final double conductividadTermica = 5.4 * Math.pow(10,-3);
        int temperaturaAAlcanzar = 70;

        final int temperaturaDeEbulliciion = 100;

        // Calculamos el tiempo en segundos para alcanzar su temperatura maxima
        double res = this.tiempoEnSegundos(
                temperaturaDeEbulliciion,
                temperaturaAAlcanzar,
                conductividadTermica,
                capacidadCalorifica,
                masaHuevoGrande,
                densidad,
                masaHuevoPequeño,
                temperaturaOriginal);

        System.out.println("EL tiempo en segundos es de: " + res );

    }
    private double tiempoEnSegundos (final int Tw,
                                     int Ty,
                                     final double K,
                                     final double c,
                                     final int M,
                                     final double d,
                                     final int mP,
                                     int To ){
        double tiempo = 0;
//        do {

            double contArriba = Math.pow(M, 2 / 3) * c * Math.pow(d, 1 / 3);
            double constAbajo = K * Math.pow(Math.PI, 2) * Math.pow(((4 * Math.PI) / 3), 2 / 3);
            double ln = Math.log1p(0.76 * ((To - Tw) / (Ty - Tw)));
            double contante1 = contArriba / constAbajo;
            tiempo = (contante1 * ln);

           // tiempo = ((( Math.pow(M,2/3))*c*Math.pow(d,1/3))/(K*Math.pow(Math.PI,2)*Math.pow(((4*Math.PI)/3),2/3))*Math.log(0.76*((To-Tw)/(Ty-Tw))));
    //        Ty++;
  //      } while (Ty < 70);

        return tiempo;
    }
}
