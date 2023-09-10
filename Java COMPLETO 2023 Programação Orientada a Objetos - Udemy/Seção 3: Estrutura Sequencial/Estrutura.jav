// Sintaxe:

int idade = 25;
double atura = 1,75;
char sexo = "F";

 // Tipos primitivos
 // Números inteiros: byte, short, int, long
 // Ponto flutuante: float, double
 // Caractere unicode: char
 // Valor verdade: boolean

 
 public class Main{

    public static void main(String[] args){

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}

// %f = ponto flutuante
// %d = inteiro
// %s = texto
// %n = quebra de linha


//import java.util.Locale;
//
//public class Main {
//
//    public static void main(String[] args) {
//
////        int y = 22;
//        double x = 10.35784;
//
////        System.out.println(y);
////        System.out.println(x);
////        System.out.println("Bom dia!");
//
//        // Printar formatado
//        System.out.println(x);
//        System.out.printf("%.2f%n", x);
//        System.out.printf("%.4f%n", x);
//        Locale.setDefault(Locale.US);
//        System.out.printf("%.4f%n", x);
//
//        System.out.println("RESULTADO = " + x + " METROS");
//
//        System.out.printf("RESULTADO = %.2f metros %n", x);
//    }
//}



