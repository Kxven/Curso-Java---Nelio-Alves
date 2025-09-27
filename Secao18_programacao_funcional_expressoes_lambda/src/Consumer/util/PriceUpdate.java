package src.Consumer.util;

import src.Consumer.entities.Products;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Products>{
    @Override
    public void accept( Products p ){
        p.setPreco(p.getPreco() * 1.1);
    }
}
