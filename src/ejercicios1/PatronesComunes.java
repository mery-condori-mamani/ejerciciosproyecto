package ejercicios1;
import java.util.Scanner;

public class ProgramasComunes {
    public void noMultiplo (){
        System.out.print("Ingrese numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int aux=0;
        for (int i =0; i<numero; i++){
            if (aux < numero){
                aux++;
                if (aux % 3 != 0 && aux % 7 != 0){
                    System.out.println(aux);

                }
            }
        }
    }
    public void sumaDeNaturales (){
        System.out.print("Ingrese n: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int s1 = 0;
        int s2 = 0;
        for (int i =0; i<=numero; i++){
            s1 = s1 +i;
        }
        System.out.println("S1: " + s1);
        // calculamos el s2 mediante la ecuacion
        s2 = (numero*(numero+1))/2;
        System.out.println("S2: " + s2);
        if (s1 == s2){
            System.out.print("Son iguales");
        }
    }
    public void numeroMayor (){
        System.out.print("Ingrese n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mayor =0;
        for (int i=0; i<n ; i++){
            int numero = scan.nextInt();
            if (numero>mayor){
                mayor = numero;
                mayor = mayor;
            }
        }
        System.out.print(mayor);
    }
    public void productosEspeciales (){
        System.out.print("Ingrse n: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        System.out.print("Ingrese potencia m:");
        int potencia = scan.nextInt();
        System.out.print("Ingrese coeficiente binomial: ");
        int k = scan.nextInt();

        System.out.print(this.factorial(numero));
        //System.out.print(this.potenciaFactorialCrecinete(numero, potencia));
        //System.out.print(this.coeficienteBinomial(numero, k));
       // System.out.print(this.numeroDeStirlingDelSegundoTipo());
    }
    private int factorial(int numero){
        int factorial =1;
        for (int i=0; i<numero;i++){
            factorial = factorial*(i+1);
        }
        return factorial;
    }
    private int  potenciaFactorialCrecinete(int numero, int potencia){

        int res =1;
        for (int i =0; i< potencia;i++){
            res = res*(numero+i);
        }
        return  res;
    }
    private  double coeficienteBinomial(int numero, int k){
        double res =1;
        res = this.factorial(numero)/(this.factorial(numero-k)*this.factorial(k));
        return res;
    }
    private double numeroDeStirlingDelSegundoTipo(){

        double res = 1;

        return res;
    }
    public void contarCombinacionesDeDados (){
        System.out.print("Ingrese el puntaje: ");
        Scanner scan = new Scanner(System.in);
        int puntaje = scan.nextInt();
        int combinaciones =0;
        int aux = 5;
        if (puntaje <= 7){
            for (int i = 0; i < puntaje; i++){
                combinaciones = i;
            }
            System.out.println("Hay " + combinaciones + " combinaciones para obtener " + puntaje);
        }
        if (puntaje > 7 && puntaje <= 12){
            for (int i = 7; i < puntaje; i++ ){
                combinaciones = aux;
                aux--;
            }
            System.out.println("Hay " + combinaciones + " combinaciones para obtener " + puntaje);
        }
        if (puntaje > 12){
            System.out.println("Hay 0 combinaciones para obtener " + puntaje);
        }
    }
    public void histograma (){
        System.out.println("Ingrese numeros: ");
        Scanner scan = new Scanner(System.in);
        int numeros = 1;
        String positivos = "";
        String negativos = "";
        while (numeros != 0){
            numeros = scan.nextInt();
            if (numeros < 0){
                negativos += "*";
            }
            if (numeros > 0){
                positivos += "*";
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
    public void masCortaYMasLarga (){
        System.out.println("Ingrese cantidad de palabras a ingresar: ");
        Scanner scan = new Scanner(System.in);
        int cantidadPalabras = scan.nextInt();
        String palabras = "";
        scan.nextLine();
        String palabraLarga ="";
        String palabraCorta ="";
        for (int i=0; i < cantidadPalabras; i++){
            palabras = scan.nextLine();
            System.out.print("Palabra " + (i + 1) + ": " + palabras);
            if (palabraLarga.length() < palabras.length()) {
                palabraLarga = palabras;
            }else {
                palabraCorta = palabras;
            }
        }
        System.out.println("");
        System.out.println("La palabra mas larga es: " + palabraLarga);
        System.out.println("La palabra mas corta es: " + palabraCorta);
    }
    public void piezasDeDomino (){

    }
    public void lanzarDados (){
        int aux =6;
        for (int i = 0; i<aux; i++){
            for (int j = 0; j < aux; j++){
                System.out.println( (i+1) + " " + (j+1));
            }
            System.out.println("");
        }
    }
}
