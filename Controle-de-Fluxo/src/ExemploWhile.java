import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

    public static void main (String[]args ){
        double mesada = 50.00;
        double valorDoDoce;
        while ( mesada > 0){
            valorDoDoce = valorAletorio();

            if(valorDoDoce > mesada ){
                valorDoDoce = mesada ;
            }
            System.out.println("valor do doce:"+valorDoDoce +"adicionando doce no carrinho" );
            mesada = mesada - valorDoDoce;
            
        }
        System.out.println("mesada: "+ mesada);
        System.out.println("joaozinho gastou toda sua mesada");
    }
    private static double valorAletorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}