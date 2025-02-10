
package appsdoiphone.reprodutormusical;

public class Musicas implements ReprodutorMusical {
    String musica = "tempo perdido";
    
    public void tocar(){
        System.out.println("está tocando uma musica ");
    }
    
    public void pausar(){
        System.out.println(" pausou a musica que estava tocando");
    }
    
    public void selecionarMusica(String musicaescolhida){
        musicaescolhida = musica; 
        System.out.println(" a musica que voce escolheu foi: "+ musicaescolhida);
        
    }
}
