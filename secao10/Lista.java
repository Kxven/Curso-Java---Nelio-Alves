import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista{
    public static void main( String[] args ){
        List<String> list = new ArrayList<>();
        list.add("Keven");
        list.add("Tiago");
        list.add("João");
        list.add("Maria");
        list.add("Ma");
        list.add("Me");
        list.add("Mi");

        System.out.println(list);

        System.out.println(list.size());

        //add elementos no meio da lista
        list.add(2,"BOB");
        System.out.println(list);

        //list.remove(2);

        System.out.println(list);
        //Remover os nomes da lista que a inicial(charAt(0) é igual a "M"
        //list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println(list);

        System.out.println("--------------------------");
        System.out.println();


        //Deixar na lista somente as pessoas que iniciam com a letra "m"
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        System.out.println(result);
        for ( String x : result ) {
            System.out.println(x);
        }

        System.out.println("--------------------------");
        System.out.println();
        //Pegar o primeiro elemento que atenda um predicato
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);
    }
}


