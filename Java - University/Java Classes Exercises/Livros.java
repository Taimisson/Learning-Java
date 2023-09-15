public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Amor", "Taiso", 2003, 234, 50);
        livro.informacoesLivro();
        System.out.println("Preço por página do Livro: R$" + livro.calcularPrecoPorPagina());
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;
    private int quantidadePaginas;
    private double preco;

    public Livro(String titulo, String autor, int anoPublicado) {
        this(titulo, autor, anoPublicado, 0, 0.0); // Chama o construtor completo com valores padrão.
    }

    public Livro(String titulo, String autor, int anoPublicado, int quantidadePaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.quantidadePaginas = quantidadePaginas;
        this.preco = preco;
    }

    // Métodos GET
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public double getPreco() {
        return preco;
    }

    // Métodos SET
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Outros
    public double calcularPrecoPorPagina() {
        if (preco == 0 || quantidadePaginas == 0) {
            return 0.0; // Evitar divisão por zero.
        }
        double precoPorPagina = preco / quantidadePaginas;

        // Formatar o resultado para ter até 2 casas decimais.
        return (double) Math.round(precoPorPagina * 100) / 100;
    }


    public void informacoesLivro() {
        System.out.println("Informações do Livro:");

        if (titulo != null && !titulo.isEmpty()) {
            System.out.println("Título do Livro: " + titulo);
        }

        if (autor != null && !autor.isEmpty()) {
            System.out.println("Autor do Livro: " + autor);
        }

        if (anoPublicado != 0) {
            System.out.println("Ano de Publicação: " + anoPublicado);
        }

        if (quantidadePaginas != 0) {
            System.out.println("Quantidade de Páginas: " + quantidadePaginas);
        }

        if (preco != 0.0) {
            System.out.println("Preço do Livro: R$" + preco);
        }
    }

}
