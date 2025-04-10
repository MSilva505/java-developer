
package aula.sobre.no;

public class Pilha {
    private No refNoEntradaPilha;
    public Pilha(){
        this.refNoEntradaPilha = null;
}
    public No Pop(){
        if(this.isEmpty()){
        No noPoped = refNoEntradaPilha;
        refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        return noPoped;
        }
       return null; 
    }
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
        public No top(){
            return refNoEntradaPilha;

}
    
    public boolean isEmpty(){
       /*pode ser usado dessa forma if(refNoEntradaPilha == null){
            return true;
        }else{
            return false;
        } ou desssa.*/
        return refNoEntradaPilha == null ? true : false;
    }
    @Override
    public String toString(){
        String stringRetorno="-----------------\n";
        stringRetorno += "Pilha\n";
        stringRetorno += "-------------------\n";
       
        No noAuxiliar =refNoEntradaPilha;
        
        while(true){
            if(noAuxiliar!=null){
                stringRetorno += "[NO{dado=" + noAuxiliar.getDadoNo()+"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============================\n";
       return stringRetorno; 
    }
}
