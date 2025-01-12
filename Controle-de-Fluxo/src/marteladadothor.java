import java.util.Scanner;

public class marteladadothor {
    public static void main(String []args){
        // Abaixo segue um exemplo de código que você pode ou não utilizar
		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		String nome;
		int N;

// TODO: complete os espaços em branco com sua solução para o problema

		for (int i = 0; i <   C  ; i++) {
			nome = leitor.next();
			N = leitor.nextInt();
        if (nome.equals("Thor")) System.out.println( "Y"       );
			else System.out.println(       "N"    );
		}
    }
	
}

