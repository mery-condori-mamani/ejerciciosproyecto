package ejercicios1;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;


public class EstructurasCondicionales {
    public void determinarPar () {
        System.out.println("Ingrese numero: ");
        Scanner scan= new Scanner(System.in);
        int numero = scan.nextInt();

        // Determinar si el numero es par o impar
        int res = numero%2;
        if (res != 0){
            System.out.println("El numero " + numero + " es impar");
        }else {
            System.out.println("El numero " + numero + " es par");
        }
    }
    public void añosBisiestos (){
        System.out.println("Ingrese un año: ");
        Scanner scan = new Scanner(System.in);
        int año = scan.nextInt();

        // DEterminar si el año es bisiesto o no
        int res = año % 4;

        if (res!= 0 ){
            System.out.println("El año " + año + " no es  bisiesto");
        } else {
            if (año%100 != 0){
                System.out.println("El año " + año + " es  bisiesto");
            } else {
                if (año%400 ==0){
                    System.out.println("El año " + año + " es  bisiesto");
                } else {
                    System.out.println("El año " + año + " no es  bisiesto");
                }
            }
        }
    }
    public void division (){
        System.out.println("Ingrese el dividendo: ");
        Scanner scan = new Scanner(System.in);
        int dividendo = scan.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = scan.nextInt();

        // Realizando la division

        int cociente = dividendo/divisor;
        int resto = dividendo%divisor;

        if (resto== 0){
            System.out.println("La division es exacta.");
            System.out.println("Cociente: " + cociente);
            System.out.println("Resto: " + resto);
        } else {
            System.out.println("La division no es exacta.");
            System.out.println("Cociente: " + cociente);
            System.out.println("Resto: " + resto);
        }
    }
    public void palabraMasLarga (){
        System.out.println("Ingrese palabra1: ");
        Scanner scan= new Scanner(System.in);
        String palabras1 = scan.nextLine();
        System.out.println("Ingrese palabra2: ");
        String palabra2 = scan.nextLine();

        if (palabras1.length() == palabra2.length()){
            System.out.println("las dos palabras tienen el mismo largo");

        } else {
            if (palabras1.length()>palabra2.length()){
                int aux = palabras1.length() - palabra2.length();
                System.out.println("la palabra " + palabras1 + " tiene " + aux + " letras mas que " + palabra2 );
            } else {
                int aux = palabra2.length() - palabras1.length();
                System.out.println("la palabra " + palabra2 + " tiene " + aux + " letras mas que " + palabras1 );
            }
        }
    }
    public void ordenamiento (){
        System.out.println("Ingrese cantidad de numeros: ");
        Scanner scan = new Scanner(System.in);
        int cantidadNumero = scan.nextInt();
        System.out.println("Ingrese los numeros: ");
        scan.nextLine();
        String numero = "";
        int aux=0;

        String resultado = "";
        int mayor = 0;
        int menor =0;

        for (int i =0; i<cantidadNumero; i++) {
            for (int j = 0; j < cantidadNumero; j++) {
                numero = scan.nextLine();
                aux = Integer.parseInt(numero);
                if (i > 0) {
                    if (aux <= menor) {
                        menor = aux;
                        resultado += menor;

                    } else {
                        menor = menor;
                    }
                }
            }
            System.out.print("Los numeros ordenados son: " + resultado);
        }
    }
    public void letraNumero (){
        System.out.println("Ingrese el caracter: ");
    }
    public void calculadora (){

    }
    public void edad () {
        System.out.println("Ingrese fecha de nacimiento: ");
        Scanner scan = new Scanner(System.in);
        int diaNac = scan.nextInt();
        int mesNac = scan.nextInt();
        int añoNac = scan.nextInt();

        LocalDate fechaActual = LocalDate.now();

        LocalDate edad = fechaActual.minusYears(añoNac);
        edad = edad.minusDays(diaNac);
        edad = edad.minusMonths(mesNac);

        int dias = edad.getDayOfMonth();
        int meses = edad.getMonthValue();
        int años = edad.getYear();

        //System.out.println("Usted tiene " + edad + " en total");
        //System.out.println("Usted tiene " + años + " años " + meses + " meses " + dias + " dias");
    }
    public void setDeTenis () {
        System.out.print("Juegos ganados por A: ");
        Scanner scan = new Scanner(System.in);
        int numJuegGanPorA = scan.nextInt();
        System.out.print("Juegos ganados por B: ");
        int numJuegGanPorB = scan.nextInt();

        int diferenciaA = numJuegGanPorA-numJuegGanPorB;
        int diferenciaB = numJuegGanPorB - numJuegGanPorA;


        if (numJuegGanPorA >= 6 || numJuegGanPorB >= 6
                && diferenciaA ==2 ||
                diferenciaB ==2){
            if (numJuegGanPorA >= 6 && numJuegGanPorB < 6 &&
                    numJuegGanPorA < 8 && numJuegGanPorB > 3) {
                System.out.println("Gano A ");
            }
            if (numJuegGanPorB >= 6 && numJuegGanPorA < 6 &&
                numJuegGanPorB < 8 && numJuegGanPorA > 3) {
            System.out.println("Gano B ");
            }
        }
        if (numJuegGanPorA <= 6 && numJuegGanPorB <=6 && diferenciaA<2 && diferenciaB<2){
             System.out.println("Aun no termina ");
        } else {
            if (diferenciaA>2 || diferenciaB>2 || numJuegGanPorA>=6 && numJuegGanPorB>=6){
                System.out.println("Invalido ");
            }
        }
    }
    public void triangulos (){
        System.out.print("Ingrese a: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.print("Ingrese b: ");
        double b = scan.nextDouble();
        System.out.print("Ingrese c: ");
        double c = scan.nextDouble();

        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("No es triangulo valido");
        } else {
            if ((a==b&&a!=c)||(a==c&&a!=b )||(b==c&&b!=a)) {
                System.out.println("Es un triangulo isoseles");
            }
            if (a!=b && a!=c && b!=c) {
                System.out.println("Es triangulo escaleno");
            }
            if (a==b&&a==c&&b==c) {
                System.out.println("Es triangulo equilatero");
            }
        }
    }
    public void indiceCorporal (){
        System.out.print("Ingrese la estatura: ");
        Scanner scan= new Scanner(System.in);
        double estatura = scan.nextDouble();
        System.out.print("Ingrese el peso: ");
        double peso = scan.nextDouble();
        System.out.print("Ingrese su edad: ");
        int edad =scan.nextInt();

        double indiceDeMasaCorporal = peso/Math.pow(estatura,2);

        if (indiceDeMasaCorporal < 22.0 && edad < 45){
            System.out.println("Existe un riesgo BAJO");
        }
        if (indiceDeMasaCorporal < 22.0 && edad >= 45){
            System.out.println("Existe un riesgo MEDIO");
        }
        if (indiceDeMasaCorporal >= 22.0 && edad < 45){
            System.out.println("Existe un riesgo MEDIO");
        }
        if (indiceDeMasaCorporal >= 22.0 && edad >= 45){
            System.out.println("Existe un riesgo ALTO");
        }
        //System.out.println(indiceDeMasaCorporal);
    }
}

