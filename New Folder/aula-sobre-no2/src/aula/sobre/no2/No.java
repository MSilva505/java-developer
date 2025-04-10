
package aula.sobre.no2;

public class No<T> {
   
    
    private  T object;
    private No<T> refNo;
    @Override
    public String toString() {
        return "No{" + "obeject=" + object + '}';
    }
    

    public void setObject(T obeject) {
        this.object = obeject;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public T getObject() {
        return object;
    }

    public No getRefNo() {
        return refNo;
    }
    
    public No(){
    }
    
    public No(T obeject){
        this.refNo = null;
        this.object = obeject;
    }
        
}

    

