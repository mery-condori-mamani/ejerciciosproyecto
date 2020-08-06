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
    }
    public void tablaDeMultiplicar2 () {
        System.out.println("La tabla de multiplicar es de: ");
        int llenado = 0;
        int aux = 1;
        int aux2 = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
             llenado = (i+1)*(j+1);
             System.out.printf("%5d ", llenado );
             // para alinear a la derecha se usa [%(cantidad de espacio)d]
                // y una [,] para separa y añadir lo que se imprimira
                // para la izquierda resta la cantidad de espacio
            }
            System.out.println("");
        }
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
    public void dibujosDeAsteriscosTriangulo(){
        System.out.print("Ingrese altura: ");
        Scanner scan = new Scanner(System.in);
        int altura = scan.nextInt();
        int asteriscos = 0;
        
        for (int i=0; i<altura; i++){
            for (int j=0; j<altura; j++){
                if (j <= asteriscos + i){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
   /* public void dibujoDeAsteriscosHexagono (){
        System.out.print("");
    }*/
    public void calculoDePi () {
        System.out.print("Ingrese numero de terminos a sumar: ");
        Scanner scan = new Scanner(System.in);
        double numero = scan.nextInt();
        double i = 1;
        double j = 3;
        double pi = 0.0;
        double aux =0;
        double aux2 = 0;
        int contador = 0;

        while (contador<numero ){
            if( contador < numero){
                aux += (1 / i);
                i += 4;
                contador ++;
            }
            if ( contador < numero){
                aux2 -= (1 / j);
                j += 4;
                contador = contador + 1;
            }
            pi = 4 * ( aux + aux2);
        }
        System.out.print(pi);
    }
    public void sumaDeFracciones (){
        double fraccion = 0.5;
        int potencia = 1;
        double suma = 0;
        System.out.print("Potencia " + " " + " Fraccion " + "        " + " Suma ");
        System.out.println("");
        while (fraccion >= 0.000001){
            suma += fraccion;
            System.out.print("" + potencia + "          " + fraccion + "               " + suma);
            System.out.println("");
            fraccion = fraccion * (0.5);
            potencia += 1;
        }
    }
    public void e (){
        double factorial = 0;
        double primerFactorial = 0.0;
        double segundoFactorial =0.0;
        double e = 0.0;
        double primerAux = 0.0;
        double segundoAux = 0.0;
        double res = 1;

        while (primerFactorial - segundoFactorial < 0.0001 ){
            primerAux = this.calculoDelFactorialNumero(factorial, res);
            primerFactorial = 1 / primerAux;
            factorial++;
            e = e + primerFactorial;
            segundoAux = this.calculoDelFactorialNumero(factorial, res);
            segundoFactorial= 1/ segundoAux;
            factorial++;
            e = e + segundoFactorial;
        }
        System.out.print("EL factorial es: " + e);
    }
    private double calculoDelFactorialNumero(double factorial, double res ){
        if (factorial > 1) {
            for (double i = 1.0 ; i <= factorial; i++) {
                res = res * i;
            }
        } else {
            res = 1;
        }
        return res;
    }
}