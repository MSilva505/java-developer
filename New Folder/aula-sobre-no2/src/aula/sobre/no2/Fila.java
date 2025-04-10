

package aula.sobre.no2;

public class Fila<T> {
    private No<T> refNoEntradaFila;
    
    public Fila(){
         this.refNoEntradaFila = null;
    }
    
    public boolean isEmpty(){
        return refNoEntradaFila == null ? true:false;
    }
 
   public void enqueue(T object) {
    No<T> novoNo = new No<>(object); // Cria um No com o objeto

    if (isEmpty()) {
        refNoEntradaFila = novoNo;
    } else {
        No<T> noAuxiliar = refNoEntradaFila;
        while (noAuxiliar.getRefNo() != null) {
            noAuxiliar = noAuxiliar.getRefNo();
        }
        noAuxiliar.setRefNo(novoNo); // Corrigido: agora seta um novo No
    }
}


    
 public No<T> dequeue() {
    if (!isEmpty()) {
        No<T> primeiroNo = refNoEntradaFila;

        if (refNoEntradaFila.getRefNo() != null) {
            refNoEntradaFila = refNoEntradaFila.getRefNo();
        } else {
            refNoEntradaFila = null;
        }

        return primeiroNo;
    }
    return null;
}


    
  public No first() {
    return refNoEntradaFila;
}

    @Override
public String toString() {
    String stringRetorno = "";
    No noAuxiliar = refNoEntradaFila;

    if (refNoEntradaFila != null) {
        while (noAuxiliar != null) {
            stringRetorno += "[No{Object=" + noAuxiliar.getObject() + "}] -------> ";
            noAuxiliar = noAuxiliar.getRefNo(); // avança apenas uma vez
        }
        stringRetorno += "null";
    } else {
        stringRetorno = "null";
    }

    return stringRetorno;
}

/*
deu algum erro 
public String toString(){
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        
        if(refNoEntradaFila != null){
            while(true){
                 stringRetorno += "[No{Object" + noAuxiliar.getObject() + "}] ------->\n";
                 noAuxiliar = noAuxiliar.getRefNo();
                 if(noAuxiliar.getRefNo() != null){
                     noAuxiliar = noAuxiliar.getRefNo();
                 }else{
                     stringRetorno = "null";
                     break;
                 }
            }
                   
        }else{
              stringRetorno = "null";
        }
      
        return stringRetorno;
    }
    */

    
    
    



}
