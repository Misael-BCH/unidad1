package unidad2;
import java.util.Scanner;
public class Pote {

    public Pote() {

        Scanner s=new Scanner(System.in);
        System.out.println("numero");
        long num=s.nextLong();
        System.out.println("Potencia");
        long pot=s.nextLong();
        System.out.println(pot(num,pot));
    }


    public long pot(long n, long pot) {
        if (pot == 0)
            return 1;
           if (pot == 1)
            return 1;
        else
            return n*pot(n,pot-1);
    }

    public static void main(String[]args){
        new Factorial();
    }
}

