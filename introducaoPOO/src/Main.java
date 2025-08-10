import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a altura: ");
        retangulo.altura = sc.nextDouble();
        System.out.println("Digite a largura: ");
        retangulo.largura = sc.nextDouble();

        System.out.println("Area: " + retangulo.area());
        System.out.println("perimetro: " + retangulo.perimetro());
        System.out.println("diagonal: " + retangulo.diagonal());

        sc.close();
    }
}