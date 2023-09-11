package EstruturaCondicional;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qnt = sc.nextInt();

        double total;
        if (cod == 1) {
            total = qnt * 4;
        } else if (cod == 2) {
            total = qnt * 4.5;
        } else if (cod == 3) {
            total = qnt * 5;
        } else if (cod == 4) {
            total = qnt * 2;
        } else {
            total = qnt * 1.50;
        }

        System.out.printf("TOTAL: R$ %.2f%n", total);

        sc.close();
    }
}
