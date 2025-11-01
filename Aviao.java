public class Aviao {
    private String companhia;
    private int capacidade;
    private int autonomia;
    private int motores;

    public Aviao(String companhia, int capacidade, int autonomia, int motores) {
        this.companhia = companhia;
        this.capacidade = capacidade;
        this.autonomia = autonomia;
        this.motores = motores;
    }

    public void voar() {
        System.out.println("O avião está voando.");
    }
}
