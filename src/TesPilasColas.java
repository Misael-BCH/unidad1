import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TesPilasColas {
    public static void main (String[]args) {
        Queue<Integer> cola = new LinkedList<>();
    cola.add(1);
    cola.add(2);
    cola.add(3);
    cola.add(4); //atiende al primero en llegar

    System.out.println(cola);
    System.out.println(cola.peek());
        System.out.println(cola);
    System.out.println(cola.poll());// lo saca de la cola
        System.out.println(cola);
        //---------------------------------------------------
        ArrayDeque<String> pila=new ArrayDeque<>();
        pila.push("A");
        pila.push("n");
        pila.push("n");
        pila.push("A");
        //pila.push();

        System.out.println(pila);
        System.out.println(pila.peek()); //verificar quien esta en la cima
        System.out.println(pila);

        pila.pop(); //desapila el ultimo en entrar
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();


    }
}
