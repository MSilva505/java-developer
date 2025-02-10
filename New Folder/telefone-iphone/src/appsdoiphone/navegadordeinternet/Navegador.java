
package appsdoiphone.navegadordeinternet;

public class Navegador implements NavegadorDeInternet {
    String URL = "www.linkedin.com/in/marcelo-junior-8b041826b";

public void exibirpagina (String pagina ){
    pagina = URL;
    System.out.println("exibindo a pagina de candidato para vaga: "+pagina);
}  
public void adicionarNovaAba(){
    System.out.println("estou adicionando uma nova aba");
}
public void atualizarPagina(){
    System.out.println(" atualizando a pagina");
}

}
