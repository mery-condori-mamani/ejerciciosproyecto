package ejercicios1;
import java.util.Scanner;

public class Ruteos {
    public void ojoConLaIdentacion (){
        int s =0;
        int t=0;
        for (int i =0; i<3;i++){
            for (int j =0; j<3; j++){
                s=s+1;
                if (i<j){
                    t = t+1;
                }
            }
        }
        System.out.println(t);
        System.out.print(s);

    }
    public void ojoConLaIdentacion2 (){
        int s=0;
        int t =0;
        for (int i =0; i<3;i++){
            for (int j=0; j<3;j++){
                s =s+1;
            if (i<j){
                t = t+1;
            }
            }
            System.out.println(t);
        }
        System.out.println(s);
    }
    public void ojoConLaIdentacion3 (){
        int s =0;
        int t =0;
        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                s = s+1;
        if (i<j){
            t = t+1;
            System.out.println(t);
        }
            }
        }
        System.out.println(s);
    }
    public void ruteosVarios1 (){
        int j =2;
        int c=1;
        boolean p =true;
        while (j>0){
            j = j-c;
            if (p){
                c = c+1;
            } else {
                p = false;
            }
        }
    }
    public void ruteosVarios2 (){
        int a=10;
        int c=1;
        int x=0;
        int y= x+1;
        int z=y;
        while (z<=y){
            z=z+c;
            y =2*x+z;
            if (y<4){
                y=y+1;
            } else {
                x=x-1;
            }
        }
        System.out.println(x + " " + y + " " + z);
    }
    public void ruteosVarios3 (){
        int a=11;
        double b= a/3;
        double c = a/2;
        int n =0;
        while (a== b+c){
            n += 1;
            b +=c;
            c = b-c;
            if (n%2==0){
                a = 2*a-3;
            }
            System.out.println(100*b+c);
        }
    }
    public void ruteosVarios4 (){
        boolean a = true;
        char []b = {'1'};
        int c =2;
        while (b[-1] != 378){
            //me falta concluir
        }
    }
}

