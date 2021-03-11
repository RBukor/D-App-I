/*

 */
package biblioteca;

public class Cliente {
    
    private String nome;
    private int idade;
    
    public Cliente(){
        
    }

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
    
    public String calcularBrinde() {
        String resposta;
        if(this.idade >= 20) {
            resposta = "Você vai ganhar uma bocha no olho";
        } else {
            resposta = "Você vai ganhar um carinho na orelha";
        }
        return resposta;
         }
    
    @Override
    public String toString() {
        return "Segue suas informações" + "\n"
                + "Seu nome é " + this.nome + "\n"
                + "Sua idade é " + this.idade + "\n";
    }
}
    

