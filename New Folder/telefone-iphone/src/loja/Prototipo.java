
package loja;

import appsdoiphone.iphone.Iphone;

public class Prototipo {

    
    public static void main(String args[]) {
        Iphone meuIphone = new Iphone();
        
       // Testando Reprodutor Musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Testando Aparelho Telefônico
        meuIphone.ligar("1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
