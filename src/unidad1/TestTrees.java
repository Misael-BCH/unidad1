package unidad1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
public class TestTrees {

    public static void main(String[]args){
        Random r=new Random();
        ArrayList<Integer>Listaenteros=new ArrayList<>();
        TreeSet<Integer>Treeenteros=new TreeSet<>();
        for (int i=0; i<1000;i++){
            Integer NAlea=r.nextInt(1000000);
            Listaenteros.add(NAlea);
            Treeenteros.add(NAlea);

        }
        Listaenteros.add(1000001);
        Treeenteros.add(1000001);

        //System.out.println(Listaenteros);
        //System.out.println(Treeenteros);

        double ti=System.currentTimeMillis();
        System.out.println(Treeenteros.contains(1000001));
        System.out.println(System.currentTimeMillis()-ti);

       /* for (Integer ele:Listaenteros){ //sirve para mostrar, no se puede modificar elementos de la lista
            System.out.println(ele);
        } */
        //for (Integer ele:Treeenteros){
          //  System.out.println(ele);

          Iterator<Integer> it=Listaenteros.iterator() ; //se pueden hacer modificaciones a los elementos de la lista
          while(it.hasNext()){
              System.out.println(it.next());
        }
    }
}
//velocidad tree
//Set no permite terminos duplicados