package src.streams.Exercicios;

import src.streams.Exercicios.entities.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Exercicio3{
    public static void main( String[] args ){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho para o arquivo");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Produto> produtos = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                produtos.add(new Produto(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            // 1) Perguntar valor mínimo e listar em ordem alfabética os produtos acima desse valor
            System.out.print("Informe um valor mínimo de preço: ");
            double minValor = sc.nextDouble();

            produtos.stream()
                    .filter(p -> p.getPreco() > minValor)
                    .map(p -> p.getNome())
                    .sorted()
                    .collect(Collectors.toList());


            // 2) Soma dos preços da categoria "Informatica"
            double sumInformatica = produtos.stream()
                    .filter(p -> p.getCategoria().equalsIgnoreCase("Informatica"))
                    .mapToDouble(Produto::getPreco).sum();
            System.out.println("Soma dos preços da categoria informatica: " + sumInformatica);

            // 3) Média dos preços da categoria "Vestuário"
            double media = produtos.stream()
                    .filter(p -> p.getCategoria().equalsIgnoreCase("Vestuário"))
                    .mapToDouble(Produto::getPreco)
                    .average()
                    .orElse(0.0);
            System.out.println("Media dos produtos da categoria Vestuario: " + media);

            // 4) Produto mais caro e mais barato
            Comparator<Produto> comp = Comparator.comparing(Produto::getPreco);
            Optional<Produto> maisCaro = produtos.stream()
                    .max(comp);
            Optional<Produto> maisBarato = produtos.stream()
                    .min(comp);
            maisCaro.ifPresent(p -> System.out.println("Produto mais caro: " + p));
            maisBarato.ifPresent(p -> System.out.println("Produto mais barato: " + p));

        }catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
