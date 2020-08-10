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

}
