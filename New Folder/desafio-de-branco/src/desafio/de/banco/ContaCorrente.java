
package desafio.de.banco;

public class ContaCorrente extends Conta {
   
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
       @Override
       public void imprimirInfoExtrato(){     
        System.out.println("--- imprimindo extrato da Conta Corrente ---");
        super.infomacoesComuns();
    }
       
}

