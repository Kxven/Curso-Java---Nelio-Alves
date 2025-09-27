package src.Function;

import src.Function.entities.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.00));
        list.add(new Products("Mouse", 50.00));
        list.add(new Products("Tablet", 350.50));
        list.add(new Products("HD CASE", 80.90));

        //implementação da interface
        //List<String> nomes = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //Reference method com método estático
        //List<String> nomes = list.stream().map(Products::staticUpperCaseName).collect(Collectors.toList());

        //Methodo reference não estático!
        //List<String> nomes = list.stream().map(Products::NoStaticUpperCaseName).collect(Collectors.toList());

        ////Expressão lambda declarada
        //Function<Products, String> func = p -> p.getName().toUpperCase();
        //List<String> nomes =  list.stream().map(func).collect(Collectors.toList());

        //Expressão lambda inline
        List<String> nomes =  list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        nomes.forEach(System.out::println);

    }
}
