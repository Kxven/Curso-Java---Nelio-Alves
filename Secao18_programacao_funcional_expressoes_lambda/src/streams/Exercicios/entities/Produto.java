package src.streams.Exercicios.entities;

public class Produto{
    private String nome;
    private String categoria;
    private Double preco;

    public Produto(String nome, String categoria, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " (" + categoria + ") - R$" + String.format("%.2f", preco);
    }
}

