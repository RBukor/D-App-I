/*

 */
package Lacos_Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class ListaPessoas {


    public static void main(String[] args) {
        
        ArrayList<String> alunos = new ArrayList<>();
        
        alunos.add("Marcela");
        alunos.add("Ana");
        alunos.add("Beto");
        alunos.add("Tonho");
        alunos.add("Zé");
        alunos.add("Josefa");
        
        System.out.println("A lista de alunos é: " + alunos);
        
        Collections.sort(alunos);
        System.out.println("A lista de alunos é: " + alunos);
        System.out.println("O Array List possui: " + alunos.size() + " elementos");
        System.out.println("O índice 04 possui o elemento: " + alunos.get(4));
        
        
        
        
       
    }
    
}
