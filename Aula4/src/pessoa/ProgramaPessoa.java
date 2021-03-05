/*
Criando a interface main para a classe pessoa
O usuário deverá digitar o nome, a idade e o peso da pessoa.
O programa retornará as informações 
 */
package pessoa;
import java.util.Scanner;

public class ProgramaPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //instancia da classe Pessoa na classe main
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite o nome: ");
        p1.nome = ler.nextLine();
        
        //invocaçao dos métodos getter e setters que protegem os 
        //dados privados da classe
        System.out.println("Digite a idade: ");
        p1.setIdade(ler.nextInt());
        
        System.out.println("Digite o peso ");
        p1.setPeso(ler.nextDouble());
       
        //configuração de saída
        System.out.println("Visualizando dados!");
        //buscando a info gravada no atribudo público
        System.out.println("Nome: " + p1.nome);
        //buscando a info gravada nos atributos privados;
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Peso: " + p1.getPeso());
    } 
}
