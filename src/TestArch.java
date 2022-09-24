import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class TestArch {

    public static void main (String[]args){
       try{
           Stream<String> filas= Files.lines(Paths.get("./src/productos/"));
           filas.forEach(System.out::println);

         /*  Double suma=filas.map(c->c.split(","))
                   .map(arr->Double.parseDouble(arr[1]))
                   .reduce(0d,(a,b)->a+b/4);

           System.out.println(suma);*/
           List<Productos> productos=new ArrayList<>();
          filas
                   .map(fila->fila.split(","))
                  .map(fila->new Productos(fila[0],Double.parseDouble(fila[1]),Integer.parseInt(fila[2])))
                   .collect(Collectors.toList());

           filas.close();
           productos.add(new Productos("Gansito",20.00,10));
          // Productos.forEach
       } catch(Exception e){
           e.printStackTrace();
       }

    }
}
