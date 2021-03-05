/*
O usuário terá que digitar o nome, idade e a renda, o programa retornará se ele é rico ou pobre, maior ou menor de idade.
 */
package Ex01;
import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        Cliente c1 = new Cliente();
        
        
        System.out.println("Digite seu nome: ");
        c1.setNome(ler.nextLine());
        
        System.out.println("Digite sua idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite sua renda: ");
        c1.setRenda(ler.nextDouble());
        
        
        System.out.println(c1.verificarIdade());
        
        System.out.println(c1.verificarRenda());
    }
    
}
