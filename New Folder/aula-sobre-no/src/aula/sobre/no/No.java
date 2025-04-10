
package aula.sobre.no;

public class No {
    
    private int dadoNo; 
    private No refNo= null;
    
    @Override
    public String toString() {
        return "No{" + "dadoNO=" + dadoNo+ '}';
    }
   
    
    public No(){
    }

    public void setDadoNo(int dadoNo) {
        this.dadoNo = dadoNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public int getDadoNo() {
        return dadoNo;
    }

    public No getRefNo() {
        return refNo;
    }

    public No(int dadoNo) {
        this.dadoNo = dadoNo;
    }
}
