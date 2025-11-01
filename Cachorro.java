public class Cachorro {
    private double peso;
    private String raca;
    private double altura;
    private String cor;

    public Cachorro(double peso, String raca, double altura, String cor) {
        this.peso = peso;
        this.raca = raca;
        this.altura = altura;
        this.cor = cor;
    }

    public void latir() {
        System.out.println("O cachorro está latindo.");
    }
}
