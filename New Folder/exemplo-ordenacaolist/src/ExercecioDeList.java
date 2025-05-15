/* faca um programa que receba a temperatura media dos primeiros meses do ano e armazene-as em uma lista
apos isto, calcule a media semestral das temperatura e mostre todas as temperaturas acima desta media , e 
em que mes elas ocorreram( mostrar o mes por extenso: 1 - janieor, 2 - fevereiro ......*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercecioDeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista com os nomes dos meses
        List<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");

        // Lista para armazenar as temperaturas
        List<Double> temperaturas = new ArrayList<>();
        double soma = 0;

        // Receber as temperaturas
        for (int i = 0; i < meses.size(); i++) {
            System.out.print("Digite a temperatura média de " + meses.get(i) + ": ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
            soma += temp;
        }

        // Calcular média
        double media = soma / temperaturas.size();
        System.out.printf("\nMédia semestral: %.2f°C\n", media);

        // Exibir temperaturas acima da média
        System.out.println("\nMeses com temperatura acima da média:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                System.out.printf("%s - %.2f°C\n", meses.get(i), temperaturas.get(i));
            }
        }

        scanner.close();
    }
}
