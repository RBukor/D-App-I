/*
A condição estabelecida é média 6.
 */
package Aula3.Condicionais;
import java.util.Scanner;


public class NotaFinal {

    String nome;
    double media;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
      System.out.println("Digite o nome do aluno: ");
      String nome = ler.nextLine();
      
      System.out.println("Digite a média do aluno: ");
      double media = ler.nextDouble();
      
      //teste lógico simples
      
     if(media >= 6) {
         System.out.println("O aluno está Aprovado");
         
     }else{
         System.out.println("O aluno está reprovado");
     }  
      
    }
    
}
