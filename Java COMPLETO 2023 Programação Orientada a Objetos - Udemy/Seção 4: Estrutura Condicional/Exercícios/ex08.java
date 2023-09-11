package EstruturaCondicional;
import java.util.Scanner;
public class ex08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        double imposto;
        if (salario < 2001) {
            System.out.println("Isento");
        } else if (salario < 3001) {
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("Imposto = R$ %.2f", imposto);
        } else if (salario < 4501) {
            imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
            System.out.printf("Imposto = R$ %.2f", imposto);
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("Imposto = R$ %.2f", imposto);
        }

        sc.close();

    }
}
