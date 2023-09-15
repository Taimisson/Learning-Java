package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Sintaxe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int minutos = sc.nextInt();
        double conta = 50;

        if (minutos > 100) {
            conta += (minutos - 100) * 2;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        // a += b; -> a = a + b
        // a -= b; -> a = a + b
        // a *= b; -> a = a + b
        // a /= b; -> a = a + b
        // a %= b; -> a = a + b

        sc.close();
    }
}
