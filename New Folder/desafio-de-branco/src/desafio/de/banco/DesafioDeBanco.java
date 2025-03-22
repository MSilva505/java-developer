

package desafio.de.banco;

public class DesafioDeBanco {

    public static void main(String[] args) {
      Cliente marcelo = new Cliente();
      marcelo.SetNome("Marcelo");
      Conta cc = new ContaCorrente(marcelo);
      Conta poupanca = new ContaPoupanca(marcelo);
      
      cc.depositar(13280);
      cc.transferir(50, poupanca);
      cc.imprimirInfoExtrato();
      poupanca.imprimirInfoExtrato();
      
    }
    
}
