import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class aboutMe {
    public static void main( String []args ){
        try{
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("digite seu nome:");
        String nome = scanner.next();

        
        System.out.println("digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("digite sua idade:");
        double idade = scanner.nextDouble();

        System.out.println("digite sua altura: ");
        double altura = scanner.nextDouble();
        
        System.out.println("meu nome é"+nome.toUpperCase() +" "+ "e o meu sobrenome é " +sobrenome.toUpperCase()+ " " +"minha idade " + idade + " e minha altura é "+altura + ".");
       scanner.close();
    }
        catch(InputMismatchException e){
            System.err.println(" os campos de idade e altura deve ser preenchidos conforme o padrao americano");
        }
    }
    
}
