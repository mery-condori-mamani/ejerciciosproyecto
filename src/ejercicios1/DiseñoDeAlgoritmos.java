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
            aux += Integer.toString(ultimoValor);
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


    }
    public void mediaArmonica (){
        System.out.print("Cuantos numeros: ");
        Scanner scan = new Scanner(System.in);
        double cantidadDeNumeros = scan.nextInt();
        double aux = 0;
        double sumatoria = 0;
        double mediaArmonica = 0;
        for (int i=0; i<cantidadDeNumeros;i++){
            System.out.print("n" + (i+1) + " = ");
            double numeros = scan.nextInt();
            aux = 1/numeros;
            sumatoria = sumatoria + aux;
        }
        mediaArmonica = cantidadDeNumeros/sumatoria;
        System.out.print("H = " + mediaArmonica);
    }
    public void numerosPalindromos (){
        System.out.print("Ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int numeroInvertido = invertirNumero(numero);
        if (numero == numeroInvertido){
            System.out.println(numero + " es palindromo");
        } else {
            System.out.println(numero + " no es palindromo");
        }
    }
    public void palabrasPalindromas (){
        System.out.println("Ingrese palabra: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        String palabraInvertida = this.invertirPalabra(palabra);
        if (palabra.equals(palabraInvertida)){
            System.out.println(palabra + " es palindromo");
        } else {
            System.out.println(palabra + " no es palindromo");
        }
    }
    private String invertirPalabra (String palabra){
        String palabraInvertida= "";
        for (int i = (palabra.length()-1); i>=0 ;i--){
            palabraInvertida += palabra.charAt(i);
        }
        return palabraInvertida;
    }
    public void palabrasPalindromasSinEspacio (){
        System.out.println("Ingrese palabra: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        String aux = palabra.replaceAll("\\s","");
        String palabraInvertida = this.invertirPalabraSinEspacio(aux);
        if (aux.equals(palabraInvertida)){
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
    private String invertirPalabraSinEspacio (String aux){
        String palabraInvertida= "";
        for (int i = (aux.length()-1); i>=0 ;i--){
            palabraInvertida += aux.charAt(i);
        }
        return palabraInvertida;
    }
}
