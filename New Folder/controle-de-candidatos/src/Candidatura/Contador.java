
package Candidatura;
import java.util.Scanner;
public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scanner.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem quando a exceção é lançada
            System.err.println(e.getMessage());
        } finally {
            scanner.close(); // Fechar o scanner
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é maior que parametroDois e lançar a exceção personalizada
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo número: " + (parametroUm + i));
        }
    }

    // Classe da exceção personalizada
    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }
}
