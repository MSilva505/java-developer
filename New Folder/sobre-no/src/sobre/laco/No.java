package sobre.laco;

public class No { // Nome corrigido para iniciar com maiúscula
    private String conteudo;
    private No proximoNo;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) { // Certifique-se de que o nome está correto!
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" + "conteudo='" + conteudo + "'}";
    }
}
