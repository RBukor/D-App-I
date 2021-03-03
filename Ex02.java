/*

 */
package Aula2;
import java.util.Scanner;



public class Ex02 {

    Double raio;
    
    static Scanner ler = new Scanner(System.in);
   
  
    public static void main(String[] args) {
        
        System.out.println("Digite o raio da circunferência: ");
        Double raio = ler.nextDouble();
        
        System.out.println("O valor do diâmetro da circunferência é " + (raio * 2));
        
        System.out.println("o valor de um quadrante da circunferência é " + (raio / 2));

        
    }
    
}
