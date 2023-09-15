package EstruturaCondicional;

public class Ternaria {
    public static void main(String[] args) {
        // Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição

        // Sintaxe:
        // ( condição) ? valor_se_verdadeiro : valor_se_falso

        // Ex: ( 2 > 4) ? 50 : 80                 Output: 80

        double preco = 34.5;
        double desconto = ( preco < 20 ) ? preco * 0.1 :  preco * 0.05;

        /*if (preco < 20) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }*/



    }
}
