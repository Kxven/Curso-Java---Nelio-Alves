package src.Predicate;

import src.Predicate.ProductPredicate;
import src.Predicate.entities.Products;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Products>  list = new ArrayList<>();

        list.add(new Products("Tv", 900.00));
        list.add(new Products("Mouse", 50.00));
        list.add(new Products("Tablet", 350.50));
        list.add(new Products("HD CASE", 80.90));

        //forma comun!
        //list.removeIf(p -> p.getPreco() >= 100.00);


        //removeIf com usando uma interface funcional
        //list.removeIf(new ProductPredicate());


        /*Method reference com método static -> Coloca a Classe onde o método está(Poducts) usa os :: e o nome do methodo(statusProductPredicate)*/
        //list.removeIf(Products::staticProductPredicate);

        //Methodo reference não estático!
        //list.removeIf(Products::noStaticProductPredicate);


        //Expressão lambda declarada
        //Predicate<Products> pred = p -> p.getPreco() >= 100.0;
        //list.removeIf(pred);

        //Expressão lambda inline
        list.removeIf(p -> p.getPreco() > 100.0);

        for(Products  p : list){
            System.out.println(p);
        }
    }
}
