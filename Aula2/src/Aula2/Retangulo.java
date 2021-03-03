/*
Crie um algoritmo em que o user digite os lados de um retângulo
e o programa retorna a área e o perímetro da forma geométrica
 */
package Aula2;
//Classe scanner é responsável pela leitura dos dados digitados no teclado
//A classe Scanner é predefinida no Java
import java.util.Scanner;

public class Retangulo {
    //declaração das variáveis - atributos da classe
    int lado1, lado2;
    //criando e instanciando a classe Scanner
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite  o lado 1 do retângulo: ");
        int lado1 = ler.nextInt();
        
        System.out.println("Digite o lado 2 do retângulo: ");
        int lado2 = ler.nextInt();
    }
}
