public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private double media;

    public Aluno(String nome, String matricula, String curso, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.media = media;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }
}
