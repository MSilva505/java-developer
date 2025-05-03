
package lista.circulares;

public class ListaCirculares {

    public static void main(String[] args) {
     ListaCircular <String> minhalistaencadeada = new ListaCircular<>();
         minhalistaencadeada.add("c5");
     System.out.println(minhalistaencadeada.get(0));
     System.out.println(minhalistaencadeada);
     minhalistaencadeada.remove(0);
     System.out.println(minhalistaencadeada);
     minhalistaencadeada.add("c7");
     System.out.println(minhalistaencadeada);
     /*for(int i = 0; i <20; i++){
         System.out.println(minhalistaencadeada); 
     } */
     
    }
    
}
