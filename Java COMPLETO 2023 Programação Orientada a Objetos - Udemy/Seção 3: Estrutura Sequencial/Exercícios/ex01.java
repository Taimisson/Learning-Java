import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        // Exercício 01

        int a,b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        a = sc.nextInt();

        System.out.print("Digite outro número: ");
        b = sc.nextInt();

        System.out.printf("Soma = %d", a+b);

    }

}
