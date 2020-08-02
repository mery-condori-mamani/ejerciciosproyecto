package ejercicios1;

import java.util.Scanner;

public class Ciclos {
    public void multiplos (){
        System.out.print("Ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int j = 10;
        int multiplos = 0;
        for (int i =1; i <= j ; i++){
            multiplos = numero * i;
            System.out.println(numero + " X " + i + " = " + multiplos);
        }
    }
    public void potenciasDeDos (){
        System.out.print("Ingrese numero: ");
        Scanner scan = new Scanner(System.in);
        int numeroCantVecesAPotenciar = scan.nextInt();
        int base = 2;
        double resultado = 0;
        for (int i = 0; i <= numeroCantVecesAPotenciar; i++){
            resultado = Math.pow(base,i);
            System.out.print(" " + resultado + " ");
        }
    }
    public void sumaEntreNumeros (){
        System.out.print("Ingrese primer numero: ");
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int numero2 = scan.nextInt();
        int suma = 0;

        for (int i = numero1+1; i < numero2; i++){
            suma += i;
        }
        System.out.println("La suma es: " + suma);
    }
    public void tablaDeMultiplicar (){
        System.out.println("La tabla de multiplicar es de: ");
        int llenado =0;
        for (int i = 1; i <=10; i ++){
            for (int j =1; j <=10; j++){
                llenado = i*j;
                System.out.print("" + llenado + "     ");
            }
            System.out.println("");
        }
        /*for (int i = 1; i <=10; i ++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("");
            }
            System.out.println("");
        }*/
    }
    public void divisores (){
        System.out.print("Ingrese numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int resultado = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0){
                resultado = numero / i;
                System.out.print(i + " ");
            }
        }
    }
    public void tiempoDeViaje(){
        System.out.print("Duracion tramo: ");
        Scanner scan = new Scanner(System.in);
        int tiempoTotalViaje = 0;
        int res = 0;
        int hora = 0;
        int aux=1;

        while ( aux >0){
            int tramo = scan.nextInt();
            System.out.print("Duracion tramo: " + tramo);
            tiempoTotalViaje += tramo;
            if (tramo == 0){
                aux = 0;
            }
            if (tiempoTotalViaje <= 60){
                res = tiempoTotalViaje;
            }else {
                hora = tiempoTotalViaje / 60 ;
                tiempoTotalViaje = tiempoTotalViaje % 60;
            }
        }
        if (res<10){
            System.out.println("");
            System.out.println("Tiempo total de viaje: " + hora +
                    ":0" + res + " horas");
        } else {
            System.out.println("");
            System.out.println("Tiempo total de viaje: " + hora +
                    ":" + res + " horas");
        }
    }
    public void dibujosDeAsteriscoRectangulo (){
        System.out.print("Ingrese altura: ");
        Scanner scan = new Scanner(System.in);
        int altura = scan.nextInt();

        System.out.print("Ingrese ancho: ");
        int ancho = scan.nextInt();
        System.out.println("Altura: " + altura);
        System.out.println("Ancho: " + ancho);
        for (int i =0; i < altura; i++){
            for (int j=0; j<ancho; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
