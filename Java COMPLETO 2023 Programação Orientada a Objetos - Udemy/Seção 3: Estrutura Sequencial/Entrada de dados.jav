import java.util.Scanner;

public class Dados {
    public static void main(String[] args){
        // Scanner para fazer a aentrada de dados, vamos criar um objeto do tipo "Scanner" da seguinte forma;

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
            
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
            
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


//        String x;
//        System.out.print("Digite uma palvara ou frase: ");
//        x = sc.next();
//        System.out.println("Você digitou: " + x);
//
//        int y;
//        System.out.print("Digite um número inteiro: ");
//        y = sc.nextInt();
//        System.out.println("Você digitou: " + y);
//
//
//        double z;
//        System.out.print("Digite um número flutuante: ");
//        z = sc.nextDouble();
//        System.out.printf("Você digitou: %.2f%n", z);
//
//        char w;
//        System.out.print("Digite um caractere: ");
//        w = sc.next().charAt(0); // Pegar a primeira letra!
//        System.out.printf("Você digitou: %s ", w);

        sc.close();
    }
}
