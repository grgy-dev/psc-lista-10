public class Carro {
    private String motor;
    private String chassi;
    private int pneus;
    private String caixaDeMarcha;

    public Carro(String motor, String chassi, int pneus, String caixaDeMarcha) {
        this.motor = motor;
        this.chassi = chassi;
        this.pneus = pneus;
        this.caixaDeMarcha = caixaDeMarcha;
    }

    public void acelerar() {
        System.out.println("O carro acelerou.");
    }
}
