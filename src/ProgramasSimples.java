import java.util.Scanner;

public class ProgramasSimples {

    public String invertirCadena (String cadena ){
        //que voy a ejecutar en mi funcion
        String cadenaInvertida= "  ";

        //int tamCad = cadena.length();

        for (int x= cadena.length() -1;x >= 0 ; x--){
             cadenaInvertida += cadena.charAt(x);
        }
        return cadenaInvertida ;
        //System.out.println(" La cadena es; " + cad);
    }
    public void pitagoras (){
        System.out.println("Ingrese la base ");
        Scanner scan = new Scanner(System.in);
        String base = scan.nextLine();
        System.out.println("Ingrese la altura");
        String altura = scan.nextLine();

        int bas = Integer.parseInt(base);
        int alt = Integer.parseInt(altura);
        double hipoCuad = (Math.pow(bas,2)) + (Math.pow(alt,2));
        double hipotenusa = Math.sqrt(hipoCuad);
        scan.close();
        System.out.println("La hipotenusa es: " + hipotenusa);
    }

    public void saludo (){
        System.out.println("Ingrese su nombre ");
        Scanner scan = new Scanner(System.in);
        String nombre = "";
        nombre += scan.nextLine();
        scan.close();
        System.out.println("Hola " + nombre);
    }
    public void calcularAreaCirculo (){
        System.out.println("Ingrese el radio: ");
        Scanner leedor = new Scanner(System.in);
        String radioLeido = "";
        radioLeido += leedor.nextLine();
        leedor.close();
        double radio = Double.parseDouble(radioLeido);
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        /*double perimetroCirculo = Math.PI * 2 * radio;
        System.out.println("El Perimetro del circulo es: " + perimetroCirculo);*/
        System.out.println("El area del circulo es: " + areaCirculo);
    }
     public void calcularPerimetroCirculo (){
        System.out.println("Ingrese el radio: ");
        Scanner leer = new Scanner(System.in);
        String radioLeido = "";
        radioLeido += leer.nextLine();
        leer.close();
        double radio = Double.parseDouble(radioLeido);
        double perimetroCirculo = Math.PI * 2 * radio;
        System.out.println("El perimetro del circulo es: " + perimetroCirculo);
    }
    public void promedioNotas (){
        System.out.println("Ingrese notas: ");
        Scanner leerNotas = new Scanner(System.in);
        String nota1 = "";
        nota1 += leerNotas.nextInt();
        String nota2 = "";
        nota2 += leerNotas.nextInt();
        String nota3 = "";
        nota3 += leerNotas.nextInt();
        String nota4 = "";
        nota4 += leerNotas.nextInt();
        leerNotas.close();
        double not1 = Double.parseDouble(nota1);
        double not2 = Double.parseDouble(nota2);
        double not3 = Double.parseDouble(nota3);
        double not4 = Double.parseDouble(nota4);

        int i = 4;
        //for (i=0, i<= not4, i +);
        double suma = not1 + not2 + not3 + not4;
        double promedio = suma/i;
        System.out.println("El promedio es de: " + promedio );

    }

    public void convertorUnid (){
        System.out.println("Ingrese numero que desea convertir:");
        Scanner leernumber= new Scanner(System.in);
        String number= "";
        number = leernumber.nextLine();
        leernumber.close();
        double plg = 2.54;
        double numero = Double.parseDouble(number);
        double converti = numero / plg;
        System.out.println("El numero: " + numero + " en plg es igual a: " + converti);

    }
    public void numeroInvertido (){
        System.out.println("Ingrese numero a invertir: ");
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int res = this.invertirNumero(numero);

/*        String res= "" ;
        while (numero>0){
            int ultimoValor = numero % 10;
            res +=Integer.toString(ultimoValor);
            numero = numero/10;
        }
        int resfinal = Integer.parseInt(res);
        */
         System.out.println("El numero invertido es: " + res );
    }
    private int invertirNumero(int numero){
        String auxiliar = "";
        while (numero>0){
            int ultimoValor = numero % 10;
            auxiliar += Integer.toString(ultimoValor);
            numero = numero/10;
        }
        return Integer.parseInt(auxiliar);
    }
    public void inrtirCadena (String cadenaInvertir){
        String cadInv= " cdf ";
        for (int x=cadenaInvertir.length () -1;x >= 0 ; x--){
            cadInv += cadenaInvertir.charAt(x);
        }
        System.out.println(" La cadena es; " + cadInv);
    }

    public void promedioNot (){
        System.out.println("Ingrese el numero de notas : ");
        Scanner leerNotas = new Scanner(System.in);
        String nota = "";
        double sumatoria = 0;
        int nNots = Integer.parseInt(leerNotas.nextLine());
        System.out.println("Ingrese " + nNots + " notas");

        for (int i= 0; i < nNots; i++){
            nota = leerNotas.nextLine();
            double notas = Double.parseDouble(nota);
            sumatoria = sumatoria + notas;
        }
        leerNotas.close();

        double promedio = sumatoria/nNots;
        System.out.println("El promedio es de: " + promedio);
    }
    public void palbraCortaLarga (){
        System.out.println("Ingrese cantidad de palabras: ");
        Scanner scan = new Scanner(System.in);
        int cantPalabras = scan.nextInt();
        scan.nextLine();

        System.out.println("Ingrese las palabras: ");
        String palabra = scan.nextLine();
        String palabraMasLarga = palabra;
        String palabraMasCorta = palabra;


        for (int i=0; i<cantPalabras-1;i++){
            palabra = scan.nextLine();
            if (palabra.length()>palabraMasLarga.length()){
                palabraMasLarga = palabra;
            }else {
                if (palabra.length() < palabraMasCorta.length()){
                    palabraMasCorta = palabra;
                }
            }
        }
        System.out.println("La palabra mas larga es: " + palabraMasLarga);
        System.out.println("La palabra mas corta es: " + palabraMasCorta);
    }
}
