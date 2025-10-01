package src.streams.Exercicios;

import src.streams.Exercicios.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio2{
    public static void main( String[] args ){
        //Fazer um programa para ler os dados(nome, email e salário)
        //De funcionários a partir de um arquivo em formato .csv.
        //Mostrar em ordem alfabética, o email dos funcionarios com salario > que um dado fornecido pelo usuario
        //Mostrar tambem a soma dos salários dos funcionários cujo nome começa com a letra "M"

        //Input file:
        //Maria,maria@gmail.com,3200.00
        //Alex,alex@gmail.com,1900.00
        //Marco,marco@gmail.com,1700.00
        //Bob,bob@gmail.com,3500.00
        //Anna,anna@gmail.com,2800.00

        //Enter full file path: c:\temp\in.txt
        //Enter salary: 2000.00
        //Email of people whose salary is more than 2000.00:
        //anna@gmail.com
        //bob@gmail.com
        //maria@gmail.com
        //Sum of salary of people whose name starts with 'M': 4900.00

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho para o arquivo");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Funcionario> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Funcionario(fields[0],fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            //Mostrar em ordem alfabética, o email dos funcionarios com salario > que um dado fornecido pelo usuario

            System.out.println("Mostrar o email dos funcionarios com salario maior que: ");
            double s = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter( p -> p.getSalary() > s)
                    .map( p -> p.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
                    //Enter salary: 2000.00
        System.out.println("Email dos funcionários com valor maior que: " + s);
            emails.forEach(System.out::println);
            System.out.println();

            double sum = list.stream()
                    .filter(p -> p.getNome().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x,y) -> x + y);
            System.out.println("Soma dos salarios dos funcionários que começam com a letra 'M': " + sum);

        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

