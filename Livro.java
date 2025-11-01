public class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private String genero;

    public Livro(String titulo, String autor, int numPaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public void ler() {
        System.out.println("Lendo o livro: " + titulo);
    }
}
