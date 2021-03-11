
package biblioteca;


public class Livro {
    private String titulo;
    private double preco;
    
    public Livro(){
        
       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularPreco() {
        if(this.preco >= 120) {
            preco = (preco - (preco * 0.5));
        }else{
            preco = preco;
        }
        return preco;
    }
    
    @Override
    public String toString() {
        return "Segue as informações do livro solicitado" + "\n"
                + "O Título do livro é " + this.titulo + "\n"
                + "O preço do livro é " + this.preco + "\n";
    }
    }
    
    

