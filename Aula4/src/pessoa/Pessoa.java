/*
Criar uma classe com nome Pessoa
nome publico
idade privado
peso privado
métodos acessores
(getters e setters)
 */
package pessoa;


public class Pessoa {
    //atributos da classe
    
    public String nome;
    private int idade;
    private double peso;
    
    //métodos da classe
    //método set responsável por "gravar" o dado no atributo
    public void setIdade(int idade) {
        this.idade = idade;
    }    
    
    //método get, para obter o dado gravado
    //método com retorno, pois "exibe" o que foi digitado no atributo
    public int getIdade() {
        return idade;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return peso;
    }
}
