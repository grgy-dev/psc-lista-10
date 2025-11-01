public class Casa {
    private String endereco;
    private int numComodos;
    private double tamanho;
    private String cor;

    public Casa(String endereco, int numComodos, double tamanho, String cor) {
        this.endereco = endereco;
        this.numComodos = numComodos;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void abrirPorta() {
        System.out.println("A porta da casa foi aberta.");
    }
}
