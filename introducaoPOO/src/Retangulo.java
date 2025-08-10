public class Retangulo {
    public double altura;
    public double largura;

    public Double area(){
        //A = altura * largura
        return altura * largura;
    }
    public double perimetro(){
        //Perimetro = base + base + altura + altura
        return 2 * (altura + largura);
    }
    public double diagonal(){
        //diagonal ao quadrado = base ao quadrado + altura aom quadrado
        //d = raiz quadrada de b ao quadrado e altura ao quadrado
        return Math.sqrt(altura * altura + largura * largura);
    }





}
