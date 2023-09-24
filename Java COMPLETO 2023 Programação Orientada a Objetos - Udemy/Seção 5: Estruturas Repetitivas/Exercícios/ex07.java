package EstruturaRepetitiva;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("Divisão impossível");
            } else {
                double divisao = (double) a / b;
                System.out.printf("Média: %.2f%n", divisao);
            }
        }

        sc.close();

    }

}
