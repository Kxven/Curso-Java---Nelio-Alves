package src.Consumer.entities;

public class Products{
    private String name;
    private double preco;


    public Products( String name,double preco ){
        this.name = name;
        this.preco = preco;
    }

    public Products( ){
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){
        this.name = name;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco( double preco ){
        this.preco = preco;
    }

    public static void staticPriceUpdate(Products p ){
        p.setPreco(p.getPreco() * 1.1);
    }

    public void noStaticPriceUpdate(){
        setPreco(getPreco() * 1.1);
    }
    @Override
    public String toString(){
        return "Products{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                '}';
    }
}
