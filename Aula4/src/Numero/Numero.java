/*
Criar uma classe "numero" 
retornando uma String 
Atributos:
Valor (tipo Int)
método get e set
verificar valor com a String

 */
package Numero;

/**
 *
 * @author Ricardo
 */
public class Numero {
    private int valor;

    
    //métodos acessores
    //get é obter e tem retorno
    public int getValor() {
        return valor;
    }
    //set é gravar é sem retorno
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //método para verificar se o numero que foi digitado é positivo ou negativo
    public String verificarNumero() {
        String resposta;
        
        if(this.valor >= 0) {
            resposta = "Este número é positivo";
        }else{
            resposta = "Este número é negativo";
        }
        return resposta;
        
    }
    
}
