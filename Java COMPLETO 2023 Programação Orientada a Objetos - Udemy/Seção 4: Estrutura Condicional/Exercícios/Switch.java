package EstruturaCondicional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sábado";
            default -> "valor inválido";
        };

        System.out.println("Dia da semana: " + dia);

//        if (x == 1) {
//            dia = "domingo";
//        } else if (x == 2) {
//            dia = "segunda";
//        } else if (x == 3) {
//            dia = "terça";
//        } else if (x == 4) {
//            dia = "quarta";
//        } else if (x == 5) {
//            dia = "quarta";
//        } else if (x == 6) {
//            dia = "quarta";
//        } else if (x == 7) {
//            dia = "quarta";
//        } else {
//            dia = "valor inválido!";
//        }
        sc.close();

    }
}
