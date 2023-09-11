package EstruturaCondicional;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        if (valor >= 0 & valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 & valor < 51) {
            System.out.println("Intervalo [25,50]");
        } else if (valor > 50 & valor < 76) {
            System.out.println("Intervalo [50,75]");
        } else if (valor > 75 & valor < 101) {
            System.out.println("Intevalo [75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
