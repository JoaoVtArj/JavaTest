import java.util.Scanner;
public class Main {
 
     public static void main(String[] args) {
        // Declaração das variáveis
        int T;
        int A, B, C, D, E;

        // Entrada
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();
        E = scanner.nextInt();

        // Processamento
        int acertos = 0;
        if (T == A) {
            acertos++;
        }
        if (T == B) {
            acertos++;
        }
        if (T == C) {
            acertos++;
        }
        if (T == D) {
            acertos++;
        }
        if (T == E) {
            acertos++;
        }

        // Saída
        System.out.println(acertos);
    }
}
