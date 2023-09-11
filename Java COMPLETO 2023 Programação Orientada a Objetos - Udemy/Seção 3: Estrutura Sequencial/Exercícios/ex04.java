import java.util.Scanner;

public class ex04 {

    public static void main(String[] args){

        int num, horasTrabalhadas;
        double valorHora, salario;
        

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = valorHora * horasTrabalhadas;
        
        System.out.printf("NUMBER = %d", num);
        System.out.println();
        System.out.printf("SALARY = U$ %.2f", salario);

    }
}
