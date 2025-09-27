package src.Consumer;

import src.Consumer.util.PriceUpdate;
import src.Consumer.entities.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main{
    public static void main(String[] args){
        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.00));
        list.add(new Products("Mouse", 50.00));
        list.add(new Products("Tablet", 350.50));
        list.add(new Products("HD CASE", 80.90));

        //implementação da interface
        //list.forEach(new PriceUpdate());

        //Reference method com método estático
        //list.forEach(Products::staticPriceUpdate);

        //Methodo reference não estático!
        //list.forEach(Products::noStaticPriceUpdate);

        ////Expressão lambda declarada
        //Consumer<Products> cons = p -> p.setPreco(p.getPreco() * 1.1);
        //list.forEach(cons);

        //Expressão lambda inline
        list.forEach(p -> p.setPreco(p.getPreco() * 1.1));

        list.forEach(System.out::println);
    }
}
