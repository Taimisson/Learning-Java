package EstruturaCondicional;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num;

        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número ímpar!");
        }

    }
}
