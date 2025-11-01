public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Gregory", 22, "123456", "111.222.333-44");
        p.falar();

        Carro c = new Carro("V8", "ABC123", 4, "Automática");
        c.acelerar();

        Livro l = new Livro("Java Básico", "Autor X", 300, "Tecnologia");
        l.ler();

        Aluno a = new Aluno("Gregory", "325210793", "Computação", 9.5);
        a.estudar();
    }
}
