

package desafio.de.banco;

public abstract class Conta implements IConta {
        protected int numero;
        protected int agencia;
        protected double saldo;
        protected Cliente cliente;
        
        private static final int AGENCIA_PADRAO = 1;
        private static  int SEQUENCIAL = 1;
        public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
        
        
        public int getNumero(){
            return numero;
        }
        public int getAgencia(){
            return agencia;
        }
        public double getSaldo(){
            return saldo;
        }

        @Override
    public void sacar(double valor) {
        saldo-=valor;
    }

        @Override
    public void depositar(double valor) {
        saldo+= valor;
    }

    public void transferir(double valor, Conta contaDestino) {
      this.sacar(valor);
      contaDestino.depositar(valor);
    }
    protected void infomacoesComuns(){
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("agencia: %d",this.agencia));
        System.out.println(String.format("numero: %d",this.numero));
        System.out.println(String.format("saldo: %.2f",this.saldo));
    }

}
