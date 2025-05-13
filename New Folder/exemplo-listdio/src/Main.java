
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Main {

    public static void main(String args[]) {
    List<Double> notas = new ArrayList<Double>();
    notas.add(7.0);
    notas.add(4.5);
    notas.add(2.7);
    notas.add(5.0);
    notas.add(0.2);
    notas.add(8.3);
    notas.add(12.3);
    System.out.println(notas.toString());//vai exibir a lista
    System.out.println("exiba a posicao da nota 5.0"+ notas.indexOf(5d));// vai exibir a posicao da nota 5.0
    System.out.println("adicione 3.0 na posicao 4");
    notas.add(4, 3.0); // adicionei 3 na posicao 4 na array
    System.out.println(notas);
    System.out.println("Substitua a nota 7.0 pela nota 9.5");
    notas.set(notas.indexOf(7.0), 9.0);// substituir a nota 7.0 pela 9.0 
    System.out.println(notas.toString());
    System.out.println("veja se tem a nota 7.0 na lista:"+ notas.contains(7.0));// vou ver se tem a nota 7 na list, porem nao tem mais
    System.out.println("exiba todas as notas na ordem que foram informados: ");
    /*for(Double nota : notas) System.out.print(notas);*/
    System.out.println("exiba a nota na posicao tres:"+ notas.get(2));
    System.out.println(notas.toString());
    System.out.println("exiba a menor nota:"+ Collections.min(notas));
    System.out.println("exiba a maior nota:"+ Collections.max(notas));
    
    Iterator<Double> iterator = notas.iterator();
    Double soma =0d;
    while(iterator.hasNext()){
        Double next = iterator.next();
        soma += next;
  
        }
    System.out.println("exiba a soma dos valores:"+ soma);
    System.out.println("exiba a media da minha list: "+ soma/notas.size());
    System.out.println("remova a nota 0:"+ notas.remove(0.2));
    System.out.println(notas.toString());
    System.out.println("remova a posicao 0: " + notas.remove(0));
    System.out.println(notas.toString());
    
    Iterator<Double> iterator1 = notas.iterator();
    while(iterator1.hasNext()){
        Double next = iterator1.next();// ele vai em cada elemento
        if(next < 7){// e vai pergutando se ele é menor que 7
            iterator1.remove();// se for ele remove
        }
    }
    
    System.out.println(notas.toString());
    System.out.println("apague toda minha list");
    notas.clear();
    System.out.println(notas.toString());
    /*System.out.println("confira se a lista está vazia": notas.isEmpty());*/
    



    }
}
