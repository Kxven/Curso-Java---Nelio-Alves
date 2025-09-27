package src.Function.util;

import src.Function.entities.Products;

import java.util.function.Function;

public class UpperCaseName implements Function<Products, String>{

    @Override
    public String apply( Products p ){
        return p.getName().toUpperCase();
    }
}
