

package Ex01questaoA;


public class Produto {
    
    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double calcularDesconto() {    
        return valor * 0.025;
        
    }
    
    @Override
    public String toString() {
        return "Informações " + "\n"
                + "O nome do produto é " + this.nome + "\n"
                + "o valor atual do produto é " + this.valor;
    }
    
}
