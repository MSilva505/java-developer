package lista.duplamente.encadeada;

public class ListaDuplaEncadeada<T> {

    private DuploNo<T> primeiroNo;
    private DuploNo<T> ultimoNo;
    
    private int tamanhoLista;
    public ListaDuplaEncadeada(){
        this.primeiroNo =null; 
        this.ultimoNo = null;
        this.tamanhoLista= 0;
    }
        public int size(){
            return this.tamanhoLista;
    }
        
       private DuploNo <T> getNo (int index){
           DuploNo<T>  noAuxiliar = primeiroNo;
           for(int i = 0;(i<index)&&(noAuxiliar!= null);i++){
               noAuxiliar = noAuxiliar.getNoProximo();
           }
           return noAuxiliar;
       }  
       public T get(int index){
        return this.getNo(index).getConteudo();
       }
       
       public void add( T elemento){
           DuploNo<T> novoNo = new DuploNo<>(elemento);
           novoNo.setNoProximo(null);
           novoNo.setNoProximo(ultimoNo);
           if(primeiroNo == null){
               primeiroNo = novoNo;
           }
           if(ultimoNo != null){
               ultimoNo.setNoProximo(novoNo);
           }
           ultimoNo = novoNo;
           tamanhoLista++;
       }
       
       public void add(int index, T elemento){
           DuploNo <T> noAuxiliar = getNo(index);
           DuploNo<T> novoNo= new DuploNo<>(elemento);
           novoNo.setNoProximo(noAuxiliar);
           if(novoNo.getNoProximo()!= null){
               novoNo.setNoPrevio(noAuxiliar.getNoProximo());
               novoNo.getNoProximo().setNoPrevio(novoNo);
           }else{
               novoNo.setNoPrevio(ultimoNo);
               ultimoNo = novoNo;
           }
           if(index == 0){
               primeiroNo = novoNo;
           }else{
               novoNo.getNoPrevio().setNoProximo(novoNo);
           }
           tamanhoLista++;
       }
       
       public void remove( int index){
           if(index == 0){
               primeiroNo = primeiroNo.getNoProximo();
               if(primeiroNo != null){
                   primeiroNo.setNoPrevio(null);
               }
           }else{
               DuploNo<T> noAuxiliar = getNo(index);
               noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
               if(noAuxiliar != ultimoNo){
                   noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoProximo());
               }else{
                   ultimoNo= noAuxiliar;
               }
               
           }
           this.tamanhoLista--;
       }

    @Override
    public String toString() {
      String strRetorno = "";
      DuploNo<T> noAuxiliar = primeiroNo;
      for (int i =0; i<size()-1;i++){
          strRetorno = "[No{conteudo "+noAuxiliar.getConteudo()+"}]--->";
          noAuxiliar = noAuxiliar.getNoProximo();
      }
      strRetorno += "null";
      return strRetorno;
    }
       
       
       
       
}
