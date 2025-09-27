package src;

import src.entities.Products;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Products>{
    @Override
    public boolean test( Products p ){
        return p.getPreco() >= 100.0;
    }
}
