package src.strem;

import src.Function.entities.Products;
import src.functions.model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){

        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.00));
        list.add(new Products("Mouse", 50.00));
        list.add(new Products("Tablet", 350.50));
        list.add(new Products("HD CASE", 80.90));

    }
}
