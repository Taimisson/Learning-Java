import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double raio, area;



        System.out.print("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        area = 3.14159 * Math.pow(raio, 2);

        Locale.setDefault(Locale.US);
        System.out.printf("A área do círculo é de: %.4f ", area);


    }




}
