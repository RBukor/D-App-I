/*

 */
package Ex01questaoA;

import java.util.Scanner;


public class MainProduto {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Produto p = new Produto();
        
        
        System.out.println("Digite o nome do produto: ");
        p.setNome(ler.nextLine());
        
        System.out.println("Digite o valor do produto: ");
        p.setValor(ler.nextDouble());
        
        System.out.println(p);
        System.out.println("O preço final é: " + p.calcularDesconto());
        

    }
    
}
