package EstruturaRepetitiva;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcao = "1 - Álcool \n2 - Gasolina \n3 - Diesel \n4 - Fim \n Selecione o tipo:";
        System.out.print(opcao);
        int tipo = sc.nextInt();

        int alcool = 0, gasolina = 0, diesel = 0;

        while (tipo != 4) {
            System.out.print(opcao);
            if (tipo == 1) {
                alcool += 1;
            }
            else if (tipo == 2) {
                gasolina += 1;
            }
            else if (tipo == 3) {
                diesel += 1;
            }

            tipo = sc.nextInt();
        }


        System.out.println("Muito Obrigado");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
