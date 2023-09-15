// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//a) Crie a classe Aluno com os seguintes atributos:

//
//- nome
//- matrícula
//- nota do grau A
//- nota do grau B
//
//b) Crie os métodos de acesso e um construtor que recebe parâmetros para inicializar todos os atributos da classe
//
//c) Crie o método calculaMediaFinal(), que retorna a média final do aluno: (GrauA * 0,33) + (GrauB * 0,67)
//
//d) Crie o método imprimeInfo(), que imprime todas as informações do aluno de maneira organizada, incluindo a sua média final

public class Main{
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Brandamente Brasil", "1585248", 5, 9);
        Aluno aluno1 = new Aluno("Radigunda Cercená", "2254879", 8, 2);
        Aluno aluno2 = new Aluno("Vitimado José Araújo", "0085994", 7, 1);

        System.out.println("Informações do Aluno 1: \n");
        aluno.imprimeInfo();
        System.out.println();
        System.out.println("Informações do Aluno 2: \n");
        aluno1.imprimeInfo();
        System.out.println();
        System.out.println("Informações do Aluno 3: \n");
        aluno2.imprimeInfo();
        System.out.println();

        aluno1.setGrauA(9);
        System.out.println("Média final atualizada: "+ aluno1.calculaMediaFinal());
        System.out.println("Matrícula do Vitimado: " + aluno2.getMatricula());
        aluno.setMatricula("1585228");
        System.out.print("Matrícula do Brandamente: " + aluno.getMatricula());
    }
}

class Aluno{
    private String nome;
    private String matricula;

    private double grauA, grauB;

    public Aluno(String nome, String matricula, double grauA, double grauB){
        this.nome = nome;
        this.matricula = matricula;
        this.grauA = grauA;
        this.grauB = grauB;
    }

    // Métodos de GET
    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public double getGrauA(){
        return grauA;
    }

    public double getGrauB(){
        return grauB;
    }

    // Métodos de SET

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setGrauA(double grauA){
        this.grauA = grauA;
    }

    public void setGrauB(double grauB){
        this.grauB = grauB;
    }

    // Outros métodos

    public double calculaMediaFinal(){
        double mediaFinal = (this.grauA * 0.33) + (this.grauB * 0.67);
        return Math.round(mediaFinal * 100.0) / 100.0;
    }

    public void imprimeInfo(){
        System.out.printf("\t Nome: %s%n", getNome());
        System.out.printf("\t Matrícula: %s%n", getMatricula());
        System.out.printf("\t Grau A: %.2f%n", getGrauA());
        System.out.printf("\t Grau B: %.2f%n", getGrauB());
        System.out.printf("\t Nota final: %.2f%n", calculaMediaFinal());
    }
}