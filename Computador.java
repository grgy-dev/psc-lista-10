public class Computador {
    private String processador;
    private int ram;
    private int armazenamento;
    private String placaVideo;

    public Computador(String processador, int ram, int armazenamento, String placaVideo) {
        this.processador = processador;
        this.ram = ram;
        this.armazenamento = armazenamento;
        this.placaVideo = placaVideo;
    }

    public void ligar() {
        System.out.println("Computador ligado.");
    }
}
