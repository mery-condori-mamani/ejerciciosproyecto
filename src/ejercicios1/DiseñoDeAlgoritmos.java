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
        //int numeroInvertido = this.invertirNumero(numero);
        int multiplicadoDigitos = this.multiplicarDigitos(numero);
        System.out.println(multiplicadoDigitos);
    }
    public int invertirNumero (int numero){
        String aux ="";
        while (numero>0){
            int ultimoValor = numero%10;
            aux = Integer.toString(ultimoValor);
            numero = numero/10;
        }
        return Integer.parseInt(aux);
    }
    public int multiplicarDigitos (int numeroInvertido){
        int res =0;
        int aux1 =0;
        int contador =2;
        String aux ="";
        while (numeroInvertido>0){
            int ultimoValor = numeroInvertido%10;
            aux = Integer.toString(ultimoValor);
            numeroInvertido = numeroInvertido/10;
            if (contador <=7){
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
