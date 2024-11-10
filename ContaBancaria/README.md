## O codigo ContaBanco
import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
       // TODO: conhecer e importar a classe Scanner
       // exibir as messagens para nosso usuario 
       // obter pela scanner os valores digitados pelo terminal 
       //exibir a messagem conta criada 
        int numero;
        String agencia;
        String nomeCliente;
        double saldo=216.36;
        System.out.println("qual o seu nome?");
        nomeCliente = sc.nextLine();
        System.out.println("qual é agencia");
        agencia = sc.nextLine();
        System.out.println("qual numero da conta");
        numero = sc.nextInt();
        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo" +saldo+ "já está disponível para saque");
       System.out.println("seu saldo é de  "+saldo);

    } 
}