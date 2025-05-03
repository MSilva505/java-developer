
package lista.duplamente.encadeada;

public class DuploNo<T> {
    private T conteudo;
    private DuploNo <T> noProximo;
    private DuploNo <T> noPrevio; 
    
    public DuploNo(T conteudo){
    this.conteudo = conteudo;
    }

    public DuploNo<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(DuploNo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public DuploNo<T> getNoPrevio() {
        return noPrevio;
    }

 
    public void setNoPrevio(DuploNo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "DuploNo{" + "conteudo=" + conteudo + '}';
    }
    
    
}
