package ExemploList;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
     List<Temperaturas> temperatura = new ArrayList<>();
    temperatura.add(new Temperaturas("janeiro", 23));
    temperatura.add(new Temperaturas("fevereiro", 30));
    temperatura.add(new Temperaturas("marco", 22));
    temperatura.add(new Temperaturas("abril", 25));
    temperatura.add(new Temperaturas("maio", 31));
    temperatura.add(new Temperaturas("junho", 32));
    
    System.out.println(temperatura);
   }
}

class Temperaturas{
   private String mes;
   private int graus;

   public Temperaturas (String mes, int graus ){
       this.graus = graus;
       this.mes = mes;
   }
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getGraus() {
        return graus;
    }

    public void setGraus(int graus) {
        this.graus = graus;
    }

    @Override
    public String toString() {
        return "Temperaturas{" + "mes=" + mes + ", graus=" + graus + '}';
    }
   
   
}