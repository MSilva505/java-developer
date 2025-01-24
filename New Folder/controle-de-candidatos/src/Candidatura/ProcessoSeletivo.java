package Candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

@SuppressWarnings("empty-statement")
public class ProcessoSeletivo {
    public static void main(String[] args) {
         String [] candidatos = {"FELIPE","JOAO","RENATO","LUCAS", "LUIZA"};
       for (String candidato: candidatos){
           entrandoEmContato(candidato);
       }
       
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
        
    }
    static void entrandoEmContato (String candidatos){
        int tentativasRealizadas = 1;
        boolean continuarTentando= true;
        boolean atendeu = false;
        
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("contato realaizado com sucesso");
            }
        }while(continuarTentando && tentativasRealizadas < 3);
        
        if(atendeu){ 
            System.out.println(" conseguimos contato com "+ candidatos +" na "+ tentativasRealizadas+ " tenativa");
        }else{
            System.out.println(" não conseguimos entra em contato com "+ candidatos + " numero maximo de tentativas realizas:" +tentativasRealizadas );
        }
        
    }
     static void analisarCandidato(double salarioPretendido){
            double salarioBase = 2000.0;
            if(salarioPretendido < salarioBase){
                System.out.println("LIGAR PARA CANDIDATO");
            }else if(salarioBase == salarioPretendido ){
                System.out.println("LIGAR PARA CONTRA PROPOSTA");
            }else{
                System.out.println("esperando candidatos");
            }
        } 
     static void selecaoCandidatos(){
    String [] candidatos = {"FELIPE","JOAO","RENATO","LUCAS", "LUIZA", "ANA","Romario"," GUILHERME"};
    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    
    while( candidatosSelecionados < 5 && candidatosAtual <candidatos.length){
        String candidato = candidatos[candidatosAtual];
       double salarioPrentedido = valorPretendido ();
       
       System.out.println(" o candidato "+ candidato +" solicitou esse salario "+ salarioPrentedido );
       if(salarioBase >= salarioPrentedido){
           System.out.println(" O candidato " +candidatosSelecionados + " foi selecionado para vaga");
           candidatosSelecionados++;
       }
       candidatosAtual++;  
    }
}
     static double valorPretendido(){
         return ThreadLocalRandom.current().nextDouble(1800,2200);
     }
     static void imprimirSelecionados(){
         String [] candidatos = {"FELIPE","JOAO","RENATO","LUCAS", "LUIZA"};
         System.out.println(" imprimindo a lista de candidatos e informando o indice de elemento ");
         
         for (int indice = 0; indice< candidatos.length; indice++){
             System.out.println("O candidato de N° "+ (indice+1)+ " é o "+ candidatos[indice]);
             /* system.out.println ("forma abreviada de interacao for each")
             for (string candidato: candidatos ){
             system.out.println("o candidato foi selecionado foi " +candidato);*/
             
         }
         
     }
}
