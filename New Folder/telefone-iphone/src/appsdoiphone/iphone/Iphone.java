
package appsdoiphone.iphone;

import appsdoiphone.aparelhotelefonico.AparelhoTelefonico;
import appsdoiphone.navegadordeinternet.NavegadorDeInternet;
import appsdoiphone.reprodutormusical.ReprodutorMusical;

public class Iphone implements NavegadorDeInternet,ReprodutorMusical,AparelhoTelefonico {

     public void ligar (String numeroParaLigar){
        System.out.println("ligando para o numero: "+ numeroParaLigar);
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
    public void exibirpagina (String pagina ){
    System.out.println("exibindo a pagina de candidato para vaga: "+pagina);
}  
    public void adicionarNovaAba(){
    System.out.println("estou adicionando uma nova aba");
}
    public void atualizarPagina(){
    System.out.println(" atualizando a pagina");
}
    public void tocar(){
        System.out.println("está tocando uma musica ");
    }
    
    public void pausar(){
        System.out.println(" pausou a musica que estava tocando");
    }
    
    public void selecionarMusica(String musicaescolhida){ 
        System.out.println(" a musica que voce escolheu foi: "+ musicaescolhida);
        
    }
}
