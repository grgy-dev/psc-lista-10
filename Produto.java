public class Produto {
    private String nome;
    private double preco;
    private String codigoBarras;
    private String validade;

    public Produto(String nome, double preco, String codigoBarras, String validade) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
        this.validade = validade;
    }

    public void vender() {
        System.out.println("Produto vendido: " + nome);
    }
}
