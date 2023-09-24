package EstruturaRepetitiva;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int quadrado = i*i;
            int cubo = i* i * i;

            System.out.printf("%d %d %d %n", i, quadrado, cubo);

        }
    }
}
