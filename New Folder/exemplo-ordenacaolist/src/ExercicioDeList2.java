
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExercicioDeList2 {

    public static boolean ehSim(String resposta) {
        return resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>();
        perguntas.add("1. Telefonou para a vítima?");
        perguntas.add("2. Esteve no local do crime?");
        perguntas.add("3. Mora perto da vítima?");
        perguntas.add("4. Devia para a vítima?");
        perguntas.add("5. Já trabalhou para a vítima?");

        List<String> respostas = new ArrayList<>();
        int contagemSim = 0;

        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println("Responda com 'sim' ou 'não': " + perguntas.get(i));
            String resposta = scanner.nextLine();
            respostas.add(resposta);

            if (ehSim(resposta)) {
                contagemSim++;
            }
        }

        // Classificação baseada nas respostas "sim"
        if (contagemSim == 2) {
            System.out.println("Classificação: SUSPEITO");
        } else if (contagemSim >= 3 && contagemSim <= 4) {
            System.out.println("Classificação: CÚMPLICE");
        } else if (contagemSim == 5) {
            System.out.println("Classificação: ASSASSINO");
        } else {
            System.out.println("Classificação: INOCENTE");
        }

        scanner.close();
    }
}
