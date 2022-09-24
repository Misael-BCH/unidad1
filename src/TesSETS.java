import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TesSETS {
                                                //Sets elimina los duplicados
    public static void main (String[]args){
        //declaracion e inicializacion
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(3);
        System.out.println(set);
         // elimina duplicados
        /*set.clear();//borra los Sets
        System.out.println(set);*/
        ArrayList<Integer> duplicados=new ArrayList<>();
        // delcara lista con elementos duplicados
        duplicados.add(1);
        duplicados.add(2);
        duplicados.add(2);
        duplicados.add(2);
        duplicados.add(2);
        duplicados.add(3);
        duplicados.add(4);
        duplicados.add(5);

        Set<Integer>SinDup=new HashSet<>();
        SinDup.addAll(duplicados);
        System.out.println(SinDup);

    }
}
