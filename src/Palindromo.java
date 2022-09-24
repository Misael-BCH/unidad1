import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class Palindromo  {

    public static void main (String[]args){
        System.out.println("Introduce la palabra a evaluar");
        Scanner s=new Scanner(System.in);


        String cad=s.nextLine();
        //todas minusculas
        cad=cad.toLowerCase();
        //se limpian todos los caracteres extraños.  
        cad=cad.replace(" ","");
        cad=cad.replace(".","");
        cad=cad.replace("\n","");
        cad=cad.replace("í","i");
        cad=cad.replace("á","a");
        cad=cad.replace("é","e");
        cad=cad.replace(",","");


        ArrayDeque<Character>pila=new ArrayDeque<>();
        Queue<Character>cola=new ArrayDeque<>();
        for(int i=0; i<cad.length();i++){
            Character letra=cad.charAt(i);
            pila.push(letra); //pilas push y pop
            cola.add(letra); // colas poll y add
        }
        System.out.println(pila);
        System.out.println(cola);
        boolean palindromo=true;
        while (!pila.isEmpty()){
          if (pila.pop()!=cola.poll()){
              palindromo=false;
              break;
          }
        }
        if (palindromo)
            System.out.println("la palabra es palíndromo");
           else
        System.out.println("la palabra NO es palíndromo");
    }
}
