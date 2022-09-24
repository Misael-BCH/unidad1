package unidad2;

import java.io.Console;
import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonacci {
    public Fibonacci(){
        System.out.println("Introduce el numero Fibonacci");
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        for(int i=0;i==0;i++){

        }
        //System.out.println(fib(n));


    }
    public int fib(int n){
    if(n==0 || n==1)
        return n;
    else
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[]args){
    new Fibonacci();
    }
}
