package src.functions;

import src.Function.entities.Products;
import src.Predicate.ProductPredicate;
import src.functions.model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        //Criando funções que recebem funções como argumento(Funções como objetos de 1* ordem)
        //Exemplos de funções de Primeira ordem: removeIf(Predicate), foreach(Consumer), map(Function)

        //Problema exemplo: Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços dos produtos que começem com "T"

        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.00));
        list.add(new Products("Mouse", 50.00));
        list.add(new Products("Tablet", 350.50));
        list.add(new Products("HD CASE", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.somaFiltrada(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}
