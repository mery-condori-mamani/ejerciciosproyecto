package ejercicios1;

import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println("Ingrse el dividendo: ");
        Scanner scan = new Scanner(System.in);
        int dividendo = scan.nextInt();
        System.out.println("Ingrse el divisor: ");
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
        System.out.println("Ingrese cantidad de palabra: ");
        Scanner scan= new Scanner(System.in);
        int cantidadPalabra = scan.nextInt();
        System.out.println("Ingrese las palabras: ");
        String palabrasIngresadas = "";
        String palabras ="";
        for (int i =0; i<cantidadPalabra; i++){
            palabras = scan.nextLine();
            palabrasIngresadas += palabras;
            System.out.println("las palabras son: " + i + " " + palabrasIngresadas);


        }

    }
}
