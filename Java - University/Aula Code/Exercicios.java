class Exercicios{

    public void contador(int x){
        while(x <= 300)
            System.out.println(x++);
    }

    public void imprimePares(int x){
        if(x < 0)
            System.out.println("[ERRO] Valor negativo!");
        else {
            int i = 0;
            while (i <= x) {
                if(i % 2 == 0)
                    System.out.println(i);
                i++;
            }
        }
    }

    public boolean verificaPrimo(int x) {
        if (x <= 1)
            return false;

        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
    
    public void testandoSwitchComTimes() {
        System.out.println("Escolha um dos times da Série A do Brasileirão!");
        System.out.println("1 - Botafogo\n" +
                "2 - Palmeiras\n" +
                "3 - Grêmio\n" +
                "4 - Bragantino\n" +
                "5 - Fluminense\n" +
                "6 - Athletico-PR\n" +
                "7 - Flamengo\n" +
                "8 - Fortaleza\n" +
                "9 - Atlético-MG\n" +
                "10 - São Paulo\n" +
                "11 - Corinthians\n" +
                "12 - Cuiabá\n" +
                "13 - Cruzeiro\n" +
                "14 - Internacional\n" +
                "15 - Vasco\n");
        int x = Teclado.leInt("Escolha a opção: ");
        switch (x) {
            case 1:
                System.out.println("Apanhou pro Corinthians");
                break;
            case 2:
                System.out.println("E A COPA DO RIO DE 1951??? PALMEIRAS TEM MUNDIAL");
                break;
            case 3:
                System.out.println("Rir do grêmio é fácil, quero ver parar de rir");
                break;
            case 4:
                System.out.println("Vontade de tomar RedBull");
                break;
            case 5:
                System.out.println("Espancando o Internacional");
                break;
            case 6:
                System.out.println("Tomou do Bolívar 3 x 1");
                break;
            case 7:
                System.out.println("PERDEU A COPA DO BRASIL PRO SÃO PAULO KKKKKKKKKK");
                break;
            case 8:
                System.out.println("Vai ganhar do GRÊMIO dia 30 de Setembro, valendo uma coca-cola ");
                break;
            case 9:
                System.out.println("Pátetico Mineiro Grande Time!");
                break;
            case 10:
                System.out.println("SALVE O TRICOLOR PAULISTA!");
                break;
            case 11:
                System.out.println("Bateu no Botafogo!");
                break;
            case 12:
                System.out.println("Camisa feia");
                break;
            case 13:
                System.out.println("O time do vovô não sobe mais...");
                break;
            case 14:
                System.out.println("Melhor que o Grêmio");
                break;
            case 15:
                System.out.println("Foi de Vasco!");
                break;
            default:
                System.out.println("Time não reconhecido. Por favor, escolha um número válido.");
        }
    }
}
