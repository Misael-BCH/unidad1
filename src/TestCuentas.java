import unidad1.Cuenta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCuentas {
    public static void main(String[]args){
        Cuenta c1=new Cuenta(125000.0,"Berlin",01);
        Cuenta c2=new Cuenta(5000.500,"Tokio",02);
        Cuenta c3=new Cuenta(123564.5,"Profesor",03);
        Cuenta c4=new Cuenta(789526.5,"Moscu",04);
        Cuenta c5=new Cuenta(1250.5,"Rio",05);

        ArrayList<Cuenta>cuentas=new ArrayList<>();
        cuentas.add(c1);
        cuentas.add(c2);
        cuentas.add(c3);
        cuentas.add(c4);
        cuentas.add(c5);

      cuentas.forEach(cuenta -> System.out.println(cuenta));

        System.out.println("/---------------------------------");

      List<Cuenta> filtradas=new ArrayList<>();
        filtradas=cuentas.stream().filter(cuenta -> cuenta.getSaldo()>5000).collect(Collectors.toList());
       // filtradas.forEach(cuenta -> System.out.println(cuenta));

        System.out.println("/---------------------------------");

        List<Cuenta> menorSeisMil=new ArrayList<>();
        menorSeisMil=cuentas.stream().filter(cuenta -> cuenta.getSaldo()<6000).collect(Collectors.toList());
        menorSeisMil.forEach(cuenta -> System.out.println(cuenta));

        System.out.println("/---------------------------------");
      List<Cuenta> nombres=new ArrayList<>();
      nombres=cuentas.stream().filter(cad->cad.getNombre().contains("i")).collect(Collectors.toList());
      nombres.forEach(c-> System.out.println(c));

        System.out.println("/---------------------------------");
        List<Cuenta> mayorMenor=new ArrayList<>();
        mayorMenor=cuentas.stream().filter(c -> c.getSaldo()>=2000  && c.getSaldo()<=20000 ).collect(Collectors.toList());
        //mayorMenor=cuentas.stream().filter(cuenta -> cuenta.getSaldo()<20000).collect(Collectors.toList());
        mayorMenor.forEach(cuenta -> System.out.println(cuenta));


        System.out.println("/---------------------------------");
        cuentas.stream().sorted(Comparator.comparing(Cuenta::getSaldo))
        .forEach(cuenta -> System.out.println(cuenta));

       /*System.out.println("/---------------------------------");
        List<unidad1.Cuenta> Saldo=new ArrayList<>();
        Saldo=cuentas.stream().filter(c -> c.getSaldo()).collect(Collectors.toList());
        Saldo.forEach(cuenta -> System.out.println(cuenta));*/


      // mostrar todas las cuentas que contengan una i en el nombre
      // mostrar todos los  que contengan un saldo menor a 6000
      // todo mostrar a tokio
      // todo mostrar a berlin

    }
}
