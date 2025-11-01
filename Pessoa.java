public class Pessoa {
    private String nome;
    private int idade;
    private String rg;
    private String cpf;

    public Pessoa(String nome, int idade, String rg, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }
}
