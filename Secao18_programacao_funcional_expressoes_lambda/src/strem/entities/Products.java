package src.strem.entities;

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


    @Override
    public String toString(){
        return "Products{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                '}';
    }
}