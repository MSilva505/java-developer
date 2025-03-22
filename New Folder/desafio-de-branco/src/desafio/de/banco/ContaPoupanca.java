

package desafio.de.banco;


public class ContaPoupanca extends Conta {
    
       public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
       @Override
       public void imprimirInfoExtrato(){    
        System.out.println("--- imprimindo extrato da Conta Corrente ---");
        super.infomacoesComuns();
        
    }
}
