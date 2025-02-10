
package appsdoiphone.aparelhotelefonico;

public class Telefone implements AparelhoTelefonico  { 
    
    String numero = "1198081100";
    
    public void ligar (String numeroParaLigar){
        numeroParaLigar = numero;
        System.out.println("ligando para o numero: "+ numero);
    }
      @Override
    public void atendeu() {
          System.out.println("voce atendeu!!");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void correioDeVoz() {
           System.out.println(" o numero que voce ligou caiu no correio de voz");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
