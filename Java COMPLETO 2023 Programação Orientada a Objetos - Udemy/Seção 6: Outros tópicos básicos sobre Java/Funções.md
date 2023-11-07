# Funções
- Representam um processamento que possui um significado
    * Math.sqrt(double)
    * System.out.println(string)
    
- Principais vantagens: modularização, delegação e reaproveitamento

- Dados de entrada e saída
   * Funções podem receber dados de entrada (parâmetros ou argumentos)
   * Funções podem ou não retornar uma saída

- Em orientação a objetos, funções em classes recebem o nome de
"métodos"

```
package course;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int higher = max(a, b, c);
        showResult(higher);
        sc.close();
}
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
```