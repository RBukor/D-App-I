/*
Aprovado e Reprovado .... início da orientação a objeto
 */
package Aula3.Condicionais;
import java.util.Scanner;

public class Aprovado {
    String nome;
    double nota1, nota2, nota3;
    
    
    static Scanner ler = new Scanner(System.in);


    public static void main(String[] args) {
        
        System.out.println("Digite o nome do aluno(a): ");
        String nome = ler.nextLine();
        
        System.out.println("Digite a nota 1 do aluno(a): ");
        double nota1 = ler.nextDouble();
        
        System.out.println("Digite a nota 2 do aluno(a): ");
        double nota2 = ler.nextDouble();
        
        System.out.println("Digite a nota 3 do aluno(a): ");
        double nota3 = ler.nextDouble();
        
        double media = (nota1 + nota2 + nota3) /3;
        
        //condicionais
        
        if(media >= 6)  {
            System.out.println("O aluno(a) está Aprovado");
        }else{
            System.out.println("O aluno(a) está Reprovado");
        }
    }
    
}
