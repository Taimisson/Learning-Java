package EstruturaRepetitiva;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        long resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é " + resultado);




//        int n = sc.nextInt();
//
//        int fat = 1;
//        for (int i = 1; i <= n; i++) {
//            fat = fat * i;
//        }
//
//        System.out.println(fat);

    }

    public static long calcularFatorial(int n) {
        // Caso base: fatorial de 0 ou 1 é 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Chamada recursiva para calcular o fatorial de n-1
            return n * calcularFatorial(n - 1);
        }
    }
}
