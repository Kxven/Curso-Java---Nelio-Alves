package src.functions.model.services;

import src.Function.entities.Products;

import java.util.List;
import java.util.function.Predicate;

public class ProductService{
    public double somaFiltrada( List<Products> list,Predicate<Products> criterio ){
        double sum = 0.0;
       for(Products p : list){
           if(criterio.test(p)){
               sum += p.getPreco();
           }
       }
       return sum;
    }
}
