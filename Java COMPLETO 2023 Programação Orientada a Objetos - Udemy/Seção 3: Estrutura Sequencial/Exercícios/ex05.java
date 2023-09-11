import java.util.Scanner;

public class ex05 {

    public static void main(String[] args){

        int cod1, pecas1, cod2, pecas2;
        double valor1, valor2, totalValor;

        Scanner sc = new Scanner(System.in);

        cod1 = sc.nextInt();
        pecas1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        pecas2 = sc.nextInt();
        valor2 = sc.nextDouble();

        totalValor = (pecas1 * valor1) + (pecas2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", totalValor);



    }

}
