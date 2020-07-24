import java.util.Scanner;
import java.util.ArrayList;

public class EjerSuma {

    public static void ordenarNumeros () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desee ordenar: ");
        int canNum = scan.nextInt();
        System.out.println("Ingrese los numeros:" + canNum + " a ordenar ");

        int [] numeros = new int[canNum];

        for (int x = 0; x < canNum; x++){
            int numer = scan.nextInt();
            numeros[x] = numer;
        }
        scan.close();
        for (int i =0; i<canNum; i++){
            for (int j = 0; j< canNum -i -1; j++){
                if (numeros[j] > numeros[j+1]){
                    int aux = numeros [j];
                    numeros [j] = numeros [j+1];
                    numeros [j+1]= aux;
                    }
                }
            }
        System.out.println("Los numeros ordenados son: ");
        for (int i = 0; i < canNum; i++){
            System.out.print(numeros[i] + " ");
        }
    }

    public void horaFutura (){
        System.out.println("Ingrese la hora actual: ");
        Scanner scan = new Scanner(System.in);
        int horAct = scan.nextInt();
        System.out.println("Ingrese cantidad de horas: ");
        int canHor = scan.nextInt();
        int totHor= horAct + canHor;

        if (totHor<= 24){
            System.out.println("En " + canHor + " seran las " + totHor );
        } else {
            int aux = totHor % 24;
            System.out.println("En " + canHor + " seran las " + aux);
        }
    }
    public void horFut () {
        System.out.println("Ingrese la hora actual: ");
        Scanner scan = new Scanner(System.in);
        int horAct = scan.nextInt();
        System.out.println("Ingrese cantidad de horas: ");
        int canHor = scan.nextInt();
        int totHor = horAct + canHor;

        if (totHor <= 24) {
            System.out.println("En " + canHor + " horas, seran las " + totHor);
        } else {
            int x = totHor / 24;
            int tot = 0;
            for (int i =1; i <= x; i++) {
                int aux = totHor - 24 * i;
                tot = aux;
                }
            System.out.println("En " + canHor + " horas, seran las " + tot);
        }
    }

   public void parteDecimal (){
        System.out.println("Ingrese el numero: ");
        Scanner scan = new Scanner(System.in);
        Double num = scan.nextDouble();
        double aux =0.0;
        if (num>0) {
            double ultimoVal = num % 1;
            aux += ultimoVal;
        } else {
            double ultimoVal = -1 * num % 1;
            aux += ultimoVal;
        }
        System.out.println("El decimal es: " + aux);
    }

    public void dibAstHex (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Lado: ");
        int lados = scan.nextInt();

        int espacio = 0;
        int asterisco = lados;

        int asteriscoAbajo = (lados * 2) + (lados - 2) - 2;
        int espacioAbajo = 0;
        int cantEspacios = 1;
        int cantAster = 2;

        for(int i = 0 ; i < lados * 2 - 1 ; i++) {
            for(int j = 0; j < (lados * 2) + (lados - 2); j++) {
                if (i < lados){
                    if(espacio < lados - i - 1 || asterisco <= 0 ) {
                        System.out.print("1");//es
                        espacio++;
                    } else {
                        System.out.print("2");//ast
                        asterisco--;
                    }
                } else {
                    if (espacioAbajo < cantEspacios || asteriscoAbajo <= 0) {
                        System.out.print("3");//esp
                        espacioAbajo++;
                    } else {
                        System.out.print("4");//ast
                        asteriscoAbajo--;
                    }
                }
            }
            if(i >= lados) {
                cantAster += 2;
                asteriscoAbajo = (lados * 2) + (lados - 2) - cantAster;
                cantEspacios++;
                espacioAbajo = 0;
            } else {
                asterisco = lados + ((i+1)*2);
                espacio = 0;
            }
            System.out.println("");//es
        }
    }
    public void dibujoAsteriscoHexagono (){
        System.out.println("Ingrese cantidad de lados: ");
        Scanner scan = new Scanner(System.in);

        int lados = scan.nextInt();

        int asteriscos = lados;
        int espacio = 0;

        int astDer = (lados * 2) + (lados - 2) - 2;
        int espDer = 0;

        int cantAst =2;
        int cantEsp = 1;


        for(int i = 0 ; i < (lados * 2) + (lados-2); i++) {//fila
            for (int j = 0; j < (lados * 2)-1; j++) { //columna
                if (i<lados){
                    if (espacio < lados - i -3 || asteriscos<= 0){
                        System.out.print("1");//va
                        espacio++;
                    } else {
                        System.out.print("2");//as
                        espacio--;
                    }
                } else {
                    if (espDer<cantEsp||astDer<=0){
                        System.out.print("3");//vac
                        espDer++;
                    } else {
                        System.out.print("4");//as
                        espDer--;
                    }
                }
            }
            System.out.println("");

        }

    }
    /*public void figuraCuadrado (){
        System.out.println("Ingrese lados: ");
        Scanner scan = new Scanner(System.in);

        int lados = scan.nextInt();

        for (int j = 0; j <lados ; j ++ ){
            for (int i=0; i<lados -1; i++){
                System.out.print("*");//columna i
            }
            System.out.println("*"); //linea j
        }
    }*/
    public void notaNecesito (){
        Scanner scan = new Scanner(System.in);
       /* System.out.println("Ingrese cantidad de notas: ");
        int numeroNotas = scan.nextInt();*/
        System.out.println("Ingrese la primera nota: ");
        int nota1 = scan.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        int nota2 = scan.nextInt();
        System.out.println("Ingrese nota de laboratorio: ");
        int notaLaboratorio = scan.nextInt();

        int nota3 = 0;
        double notaCertamens =0;
        double notaFinal =0;

        do {
            nota3++;
            notaCertamens = (nota1 + nota2 + nota3) / 3;
            notaFinal = (notaCertamens * 0.70) + (notaLaboratorio * 0.30);
        } while (notaFinal < 60);

        System.out.println("La nota 3 que necesita es: "+ nota3);
    }
}
