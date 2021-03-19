

package Ex11;


public class Cachorro {
    
    String corPelo;
    String tamanho;
    
    @Override
    public String toString(){
        return 
                "Cor do pelo: " + this.corPelo + "\n"
                + "Tamanho: " + this.tamanho;
    }
}
