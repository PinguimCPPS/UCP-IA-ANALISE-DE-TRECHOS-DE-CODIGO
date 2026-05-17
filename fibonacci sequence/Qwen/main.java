// O SonarQube aconcelhou que trocasse os System.out por Logger.
// Disse tambem para declarar a variavel 'Segundo Termo' em uma linha separada.

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos da sequência: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
            return;
        }

        int primeiroTermo = 0, segundoTermo = 1;
        System.out.println("Sequência de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiroTermo + " ");
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
