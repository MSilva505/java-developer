
package aula.sobre.no2;

public class Main {

    public static void main(String args[]) {
        
        
    Fila<String> minhaFila = new Fila<>();
    minhaFila.enqueue("primeiro");
    minhaFila.enqueue("segundo");
    minhaFila.enqueue("terceiro");
    minhaFila.enqueue("quarto");
    minhaFila.enqueue("quinto");
    minhaFila.enqueue("ultimo");
  
    
    System.out.println(minhaFila);
    
    System.out.println(minhaFila.dequeue());
    
    System.out.println(minhaFila);
    
    System.out.println(minhaFila.first());
    
    
    }
}
