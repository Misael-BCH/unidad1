package unidad2;

import java.util.Scanner;

public class Factorial {

    public Factorial() {

        Scanner s=new Scanner(System.in);
        System.out.println("numero factorial");
        long n=s.nextLong();

        System.out.println(fact(n));
    }


    public long fact(long n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[]args){
        new Factorial();
    }
}