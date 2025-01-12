import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array para armazenar os 10 nomes
        String[] nomes = new String[10];

        // Lendo os 10 nomes
        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine(); // Cada nome é lido e armazenado no array
        }

        // Imprimindo o terceiro, sétimo e nono nomes
        System.out.println(nomes[2]); // Terceiro nome (índice 2)
        System.out.println(nomes[6]); // Sétimo nome (índice 6)
        System.out.println(nomes[8]); // Nono nome (índice 8)

        sc.close();
    }
}
