
package Ex11;


public class Papagaio {
    
    String corPena;
    String tamanho;
    
    @Override
    public String toString(){
        return 
                "Cor das Penas: " + this.corPena + "\n"
                + "Tamanho: " + this.tamanho;
    }
}