/*
Criar uma classe "Cliente" com as seguintes informações:
Atributos:
Nome (de tipo String) Idade (de tipo int) renda (de tipo double)
Métodos: getNome (método acessor)
setNome (método acessor) getIdade (método acessor) setIdade (método acessor) getRenda (método acessor) setRenda (método acessor)
classificarIdade (com retorno String informando se o cliente é maior de idade ou não)
classificarRenda (com retorno String informando se o cliente é rico (renda superior a 15000) ou não).
 */
package Ex01;

public class Cliente {
    String nome;
    int idade;
    double renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    public String verificarIdade() {
    String resposta1;
    
    if(idade >= 18) {
        resposta1 = "Você é maior de idade!";
    }else{
        resposta1 = "Você é um neném!";
    }
    return resposta1;
    }
    public String verificarRenda() {
        String resposta2;
        
        if(renda >= 15000) {
            resposta2 = "Você é cheio da grana";
        }else{
            resposta2 = "Você é um pé rapado!";
        }
        return resposta2;
    }
}
