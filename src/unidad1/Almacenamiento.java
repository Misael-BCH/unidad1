package unidad1;

import org.w3c.dom.css.CSSValue;
import org.w3c.dom.css.CSSValueList;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class Almacenamiento {
    public static void main (String[]args){
int regreso=1;
int seleccion;
String napo;
double pr;
int ve;
int co;
int ex;
        Scanner sc=new Scanner(System.in);
Scanner c=new Scanner(System.in);
        try{
            Stream<String> filas = Files.lines((Paths.get("./src/unidad1/mercancia/")));
           //filas.forEach(System.out::println);

            List<Mercancia> mercancia=new ArrayList<>();

                    mercancia=filas.map(fila->fila.split(","))
                    .map(fila-> {
                        return new Mercancia
                       (fila[0], Double.parseDouble(fila[1]) , Integer.parseInt(fila[2]), Integer.parseInt(fila[3]), Integer.parseInt(fila[4]));}
                    )
                    .collect(Collectors.toList());
//System.out.println(mercancia);
            filas.close();
            //mercancia.add(new Mercancia("gomitas",26.00,30,40,55));
            //System.out.println(mercancia);
            while (regreso==1) {
                System.out.println(">>>>     Menú     <<<<");
                System.out.println("<<<<<Agregar producto -> preciona 1 >>>>>");
                System.out.println("<<<<<Eliminar producto -> presiona 2 >>>>>");
                System.out.println("<<<<<Modificar producto -> presiona 3 >>>>>");
                seleccion= sc.nextInt();

                switch (seleccion) {
                    case 1:
                        System.out.println("Introdusca el nombre del producto");
                        napo=c.nextLine();
                        System.out.println("Introdusca el precio del producto");
                        pr=c.nextDouble();
                        System.out.println("Introdusca el numero de ventas del producto");
                        ve=c.nextInt();
                        System.out.println("Introdusca el numero de compras del producto");
                        co=c.nextInt();
                        System.out.println("introdusca la cantidad de existencias del producto");
                        ex=c.nextInt();
                        mercancia.add(new Mercancia(napo,pr,ve,co,ex));
                        System.out.println(mercancia);
                        try{
                            Files.writeString(Paths.get("./src/unidad1/mercancia/"), mercancia.stream()
                                    .map(mercancia2->mercancia2.toString())
                                    .reduce("",(a,b)->a.toString()+b.toString()+"\n"));

                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("presiona 1 para seguir o 2 para salir");
                        regreso= sc.nextInt();
                        break;


                    case 2:
                        System.out.println(mercancia);
                        System.out.println("introdusca el numero de producto que desea borrar");
                        ex=c.nextInt();
                        mercancia.remove(ex);
                        System.out.println(mercancia);
                        break;

                    case 3:

                }
            }


        } catch(Exception e){
            e.printStackTrace();
        }

    }
    }

