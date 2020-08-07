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

    }
}
