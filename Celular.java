public class Celular {
    private String marca;
    private String modelo;
    private int armazenamento;
    private String sistema;

    public Celular(String marca, String modelo, int armazenamento, String sistema) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.sistema = sistema;
    }

    public void ligar() {
        System.out.println("Ligando o celular...");
    }
}
