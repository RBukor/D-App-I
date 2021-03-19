/*

 */
package Ex11;

import java.util.Scanner;


public class Animal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int animais;
        
        Cachorro c = new Cachorro();
        Papagaio p = new Papagaio();
        Mosca m = new Mosca();
       
    do {
        
        System.out.println("Escolha uma opção");
        System.out.println("1 >> Cachorro");
        System.out.println("2 >> Papagaio");
        System.out.println("3 >> Mosca");
        System.out.println("0 >> Sair");
        
        animais = ler.nextInt();

      switch (animais) {

            case 1:
                System.out.println("Digite a cor do pelo do cachorro: ");
                c.corPelo = ler.nextLine();
                System.out.println("Digite o tamanho: ");
                c.tamanho = ler.nextLine();
            case 2:          
                System.out.println("Digite a cor das penas do papagaio: ");
                p.corPena = ler.nextLine();
                System.out.println("Digite o tamanho: ");
                p.tamanho = ler.nextLine();
            break;
            case 3:
                System.out.println("Digite a quantidade de patas: ");
                m.qtdPatas = ler.nextInt();
            break;
            case 0:
                System.out.println("Programa Encerrado");
            break;

            default:
                System.out.println("Esse número não dá irmão, tenta outro aí");
     }

        } while (animais != 8);

    }
}