import java.util.Scanner;

public class dibujosAsterisco {

    public void dibHexa2 (){
        System.out.println("Lea el numero de lados: ");
        Scanner scan = new Scanner(System.in);

        int numLad = scan.nextInt();
        int asteriscos = numLad;
        int vacio = 0;
        int espAba = 0;
        int cantEsp = 1;
        int astAba = (numLad*2) + (numLad-2) - 2;
        int cantAst = 2;

        for (int i = 0; i < (numLad * 2) -1; i++){//filas
            for (int j= 0; j < (numLad * 2) + (numLad-2); j++){//columas
                if (i < numLad){
                    if (vacio<numLad-i-2|| asteriscos<=0){
                        System.out.print(" ");
                        vacio++;
                    } else {
                        System.out.print("*");
                        asteriscos--;
                    }
                } else {
                    if (espAba < cantEsp|| astAba <= 0){
                        System.out.print("");
                        espAba++;
                    } else {
                        System.out.print("*");
                        astAba--;
                    }
                }
            }
            if (i >= numLad){
                cantAst += 2;
                astAba = (numLad * 2) + (numLad - 2) - cantAst;
                cantEsp++;
                espAba =0;
            } else {
                asteriscos = numLad + ((i + 1 ) * 2);
                vacio = 0;
            }
            System.out.println("");
        }
    }
    public void cuadrado (){
        System.out.println("Ingrese la altura: ");
        Scanner scan = new Scanner(System.in);

        int altura = scan.nextInt();
        System.out.println("Ingrese el ancho: ");
        int ancho = scan.nextInt();

        for (int i = 0; i < altura; i ++){//altura
            for (int j = 0; j < ancho; j++){//ancho
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void triangulo () {
        System.out.println("Ingrese la altura: ");
        Scanner scan = new Scanner(System.in);

        int altura = scan.nextInt();
        int asterisco = 0;
        int vacio =altura+2;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura ; j++) {
                if (i<altura){
                    if (asterisco < altura -i ||vacio<=0){
                        System.out.print("*");
                        asterisco++;
                    } else {
                        System.out.print(" ");
                        vacio--;
                    }
                } else{
                    i--;
                    }
                //System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void matriz (){
        System.out.print("Inserte altura: ");
        Scanner scan= new Scanner(System.in);
        int altura = scan.nextInt();
        System.out.print("Inserte el ancho de la matriz: ");
        int ancho = scan.nextInt();

        int [][] matriz  = new int [altura][ancho];

        for (int i=0; i< ancho; i++ ){
            for (int j=0; j< altura; j++){
                System.out.print(matriz);
                if (i<altura){
                    System.out.print("*" + matriz[i][j]);
                }

            }
            System.out.println("");
        }





    }
     public void matrizTranspuesta() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lado: ");
        int lados = scan.nextInt();
        int m = lados * 2 - 1;
        int n = (lados * 2) + (lados - 2);
        char[][] matriz = new char[n][m];
        char [][] matrizT = new char[m][n];

        int espaciosArriba = lados - 1;
        int espaciosArribaDer = espaciosArriba;
        int asteriscosArriba = 1;
        int asteriscosMedio = lados;
        int espaciosAbajo = 1;
        int espaciosAbajoDer = 1;
        int asteriscosAbajo = m - 2;
        int cantFilasArriba = lados - 1;
        int cantFilasMedio = lados;
        int contAbajo = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if((espaciosArriba > 0 || asteriscosArriba > 0 || espaciosArribaDer > 0)
                            && cantFilasArriba > 0) {
                    if(espaciosArriba > 0) {
                        matriz[i][j] = ' ';
                        espaciosArriba--;
                    } else {
                        if(asteriscosArriba > 0) {
                            matriz[i][j] = '*';
                            asteriscosArriba--;
                        } else {
                            matriz[i][j] = ' ';
                            espaciosArribaDer--;
                        }
                    }
                } else {
                    if (cantFilasMedio >= 0){
                        matriz[i][j] = '*';
                    } else {
                        if (espaciosAbajo > 0) {
                            matriz[i][j] = ' ';
                            espaciosAbajo--;
                        } else {
                            if(asteriscosAbajo <= 0){
                                matriz[i][j] = ' ';
                                espaciosAbajoDer--;
                            } else{
                                matriz[i][j] = '*';
                                asteriscosAbajo--;
                            }
                        }
                    }
                }
            }
            if(cantFilasArriba > 1 ) {
                espaciosArriba = lados - (i+1*2);
                asteriscosArriba = ((i+1)*2 )+ 1;
                espaciosArribaDer = espaciosArriba;
                cantFilasArriba--;
            } else {
                if(cantFilasMedio >= 0) {
                    cantFilasMedio--;
                } else {
                    espaciosAbajo = contAbajo;
                    asteriscosAbajo = m - (contAbajo * 2);
                    espaciosAbajoDer = espaciosAbajo;
                    contAbajo++;
                }
            }
        }
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                 System.out.print(matriz[i][j]);
             }
             System.out.println("");
         }
        // trasnsponer matriz
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                 matrizT[j][i] = matriz [i][j];
             }
         }
         System.out.println("La matriz transpuesta es: ");
         for (int i=0; i<m;i++){
             for (int j=0; j<n;j++){
                 System.out.print(matrizT[i][j]);
             }
             System.out.println("");
         }
    }

}
