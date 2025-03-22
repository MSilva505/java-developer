
package desafio.de.banco;
import java.util.List;

public class Banco {
      private String nome;
      private List<Conta> contas;
   
    public String getNome(){
        return nome;
    }
    public void SetNome(String nome){
        this.nome = nome;
    }   
    public List<Conta> getcontas(){
        return contas;
    }
    public void setcontas (List<Conta> contas){
       this.contas = contas; 
    }
    
}
