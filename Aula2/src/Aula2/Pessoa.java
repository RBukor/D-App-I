/*
Criar um programa onde o usuário precisa digitar o nome, idade, altura, 
peso e cidade da pessoa. O programa irá mostrar estes dados
 */
package Aula2;
import java.util.Scanner;

public class Pessoa {
    //declaração dos atributos(variáveis) da classe pessoa
    String nome, cidade;
    int idade;
    double altura, peso;
    
    static Scanner leitura = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("**** Seja Bem Vindo****");
        
        System.out.println("Digite o seu nome: ");
        String nome = leitura.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = leitura.nextInt();
        
        System.out.println("Digite sua altura: ");
        double altura = leitura.nextDouble();
        
        System.out.println("Digite seu peso: ");
        double peso = leitura.nextDouble();
        
        System.out.println("Digite sua cidade: ");
        String cidade = leitura.nextLine();
        
        
    }
    
}
