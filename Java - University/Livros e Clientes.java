import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = criarCliente(sc);

        System.out.println("\n\tInformações dos Clientes:");
        System.out.println(cliente1);

        imprimirPrecoPorPagina(cliente1);
        sc.close();
    }
    private static Cliente criarCliente(@NotNull Scanner sc){
        System.out.println("Informe o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.println("Informe o título do livro do cliente:");
        String tituloLivro = sc.nextLine();

        System.out.println("Informe o autor do livro do cliente:");
        String autorLivro = sc.nextLine();

        System.out.println("Informe o preço do livro do cliente:");
        double precoLivro = sc.nextDouble();

        System.out.println("Informe a quantidade de páginas do livro do cliente:");
        int quantidadePaginasLivro = sc.nextInt();

        // Criar o livro com base nas informações fornecidas
        Livro livro = new Livro(tituloLivro, autorLivro, quantidadePaginasLivro, precoLivro);

        return new Cliente(nome, livro);
    }

    private static void imprimirPrecoPorPagina(Cliente cliente){
        if (cliente.getLivro() != null){
            double precoPorPagina = cliente.getLivro().calcularPrecoPorPagina();
            System.out.println();
            System.out.println("O cliente " + cliente.getNome() + " está com livro " + cliente.getLivro().getTitulo() + ", e o preço por página deste livro é R$" + String.format("%.2f", precoPorPagina));
        }
    }
}


class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;
    private int quantidadePaginas;
    private double preco;

    public Livro(String titulo, String autor, int anoPublicado, int quantidadePaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.quantidadePaginas = quantidadePaginas;
        this.preco = preco;
    }
    public Livro(String titulo, String autor, int quantidadePaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
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

class Cliente{
    private String nome, email, senha;
    private char sexo;
    private int idade;
    private Livro livro;

    public Cliente(){

    }

    public Cliente(String nome, int idade, char sexo, String email, String senha){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }

    public Cliente(String nome, int idade, char sexo, String email, String senha, Livro livro){
        this(nome, idade, sexo, email, senha);
        this.livro = livro;

    }

    public Cliente(String nome, Livro livro){
        this.nome = nome;
        this.livro = livro;
    }

    // Métodos de acesso aos atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Livro getLivro() {
        return livro;
    }

    public void imprimeInformacoes(){
        System.out.println();
        System.out.println("Informações do Cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("E-mail: " + email);
        System.out.println("Senha: " + senha);

        if (livro != null){
            System.out.println("Livro: " + livro.getTitulo());
        }
    }

    public String toString(){
        String clienteInfo = "\tNOME: " + nome + "\n";
        clienteInfo += "\tIDADE: " + idade + "\n";
        clienteInfo += "\tSEXO: " + sexo + "\n";
        clienteInfo += "\tE-MAIL: " + email + "\n";
        clienteInfo += "\tSENHA: " + senha + "\n";

        if (livro != null) {
            clienteInfo += "\tLIVRO: " + livro.getTitulo();
        }

        return clienteInfo;
    }
}
