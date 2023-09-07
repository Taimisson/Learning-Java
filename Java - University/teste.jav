public class Produto {
    private String nome;
    private double valor;
    private String descricao;
    private int quantidadeEmEstoque;

    public Produto(String nome, double valor, String descricao, int quantidadeEmEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}