import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Joaquim", 'M', 19, 1.78, 0, "Rua C, 145");

        Pessoa pessoa2 = new Pessoa("Manuelita", 'F', 30, 1.67, 3, "Rua dos Camelos, 12");

        Pessoa pessoa3 = new Pessoa("Pedro", 'M', 10, 1.91, 1, "Rua dos Gigantes, 189");

        pessoa1.imprimeInformacoes();
        pessoa2.imprimeInformacoes();
        pessoa3.imprimeInformacoes();

        if (pessoa1.isFilhoUnico())
            if (pessoa1.getSexo() == 'F')
                System.out.println(pessoa1.getNome() + "  filha única!");
            else
                System.out.println(pessoa1.getNome() + " é filho único!");
        else if (pessoa1.getSexo() == 'F')
            System.out.println(pessoa1.getNome() + " não é filha única!");
        else
            System.out.println(pessoa1.getNome() + " não é filho único!");
    }
}


class Pessoa{
    String nome;
    char sexo;
    int idade;
    double altura;
    int irmoes;
    String endereco;

    public Pessoa(String nome, char sexo, int idade, double altura, int irmoes, String endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.irmoes = irmoes;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public int getIrmoes() {
        return irmoes;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIrmoes(int irmoes) {
        this.irmoes = irmoes;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isFilhoUnico(){
        return irmoes == 0;
    }

    public void imprimeInformacoes() {
        System.out.printf("\nNome: %s \nSexo: %s \nIdade: %d \nAltura: %.2f \nQuant. Irmãos: %d \nEndereço: %s \n", nome, sexo, idade, altura, irmoes, endereco);
    }
}



