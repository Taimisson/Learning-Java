package EstruturaCondicional;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        num = sc.nextInt();

        if (num > 0) {
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número negativo!");
        }


    }
}