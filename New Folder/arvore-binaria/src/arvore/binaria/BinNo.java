
package arvore.binaria;

public class BinNo <T extends comparable<T>>{
    private T conteudo;
    private BinNo <T> noEsq;
    private BinNo <T> noDir;

    public BinNo() {
    }
    
    
    
    public BinNo(T conteudo){
        this.conteudo = conteudo;
        this.noEsq=this.noDir =null;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "BinNo{" + "conteudo=" + conteudo + '}';
    }
    
}
