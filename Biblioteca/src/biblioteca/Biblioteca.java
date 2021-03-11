
package biblioteca;

import java.util.Scanner;


public class Biblioteca {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Livro l1 = new Livro();
        Cliente cl = new Cliente();
        
        System.out.println("Bem vindo ao programinha Feliz" + "\n");
        
        System.out.println("Digite seu nome: ");
        cl.setNome(ler.nextLine());
        
        System.out.println("Digite sua idade: ");
        cl.setIdade(ler.nextInt());
        
        System.out.println("Digite o nome do livro: ");
        l1.setTitulo(ler.nextLine());
        
        System.out.println("Digite o preço do livro: ");
        l1.setPreco(ler.nextDouble());
        
        
        System.out.println(l1);
        System.out.println(cl);
        System.out.println(cl.calcularBrinde());
        System.out.println("O valor final é: " + l1.calcularPreco());
    }
    
}
