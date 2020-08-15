package ejercicios1;

import java.util.Scanner;

public class DiseñoDeAlgoritmos {
    public void digitos (){
        System.out.println("Ingrese numero: ");
        Scanner scan = new Scanner(System.in);
        String numero = scan.nextLine();
        int numeroDeDigitos = numero.length();
        System.out.println(numero + " tiene " + numeroDeDigitos + " digitos.");
    }
    public void digitoVerificador (){
        System.out.println("Ingrese numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int moduloNumero = 0;
        int restaModulo = 0;

        int multiplicadoDigitos = this.multiplicarDigitos(numero);
        moduloNumero = multiplicadoDigitos % 11;
        restaModulo = Math.abs(moduloNumero - 11);

        System.out.println(numero + "-" + restaModulo);
    }
    public int invertirNumero (int numero){
        String aux = "";
        while (numero > 0){
            int ultimoValor = numero % 10;
            aux = Integer.toString(ultimoValor);
            numero = numero / 10;
        }
        return Integer.parseInt(aux);
    }
    public int multiplicarDigitos (int numeroInvertido){
        int res =0;
        int aux1 =0;
        int contador =2;
        while (numeroInvertido > 0){
            if (contador <=7){
            int ultimoValor = numeroInvertido%10;
            numeroInvertido = numeroInvertido/10;
            res = ultimoValor*contador;
            aux1 = aux1 +res;
            contador++;
            } else {
                contador =2;
            }
        }
        return aux1;
    }

    public void ecuacionPrimerGrado (){
        System.out.println("Ingrese a: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("Ingrese b: ");
        double b = scan.nextDouble();
        double x = 0.0;
        if (a != 0 ){
            x = -1 * (b / a);
            System.out.println("Solucion unica: " + x);
        } else {
            if (a==0 && b !=0){
                System.out.println("Sin solucion");
            }
            if (a==0 && b==0){
                System.out.println("No hay solucion unica");
            }
        }
    }
    public void caballoDeAjedrez (){
        System.out.print("Ingrese coordenadas del caballo");
        Scanner scan = new Scanner(System.in);
        int fila = scan.nextInt();
        int columna = scan.nextInt();

        System.out.print("Fila: " + fila);
        System.out.print("Columna: " + columna);

        int [][] matriz8x8 = {};
        if (fila <= 0){

        }

    }
}
