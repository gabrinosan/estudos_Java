package teste;

import java.util.Scanner; //import da classe Scanner de java.util.

import posicoes.PosicaoMapa4x4; //import da classe PosicaoMapa4x4 para uso de atributos. 

public class AplicacaoTestaPosicoes{
       public static void main(String[] args){

        PosicaoMapa4x4 p1, p2;
        p1 = new PosicaoMapa4x4();
        p2 = new PosicaoMapa4x4();
       
        Scanner ler = new Scanner(System.in); //Instanciação da classe Scanner.
        int px, py, px2, py2; //Persistência de X e Y dos pontos 1 e 2, para ao final do código serem plotados.
        
        do{
            System.out.print("Informe a coordenada x do ponto 1: ");
            px = ler.nextInt();

            System.out.print("Informe a coordenada y do ponto 1: ");
            py = ler.nextInt();
        //Aqui eu inverto o return de setX e setY até o valor corretor ser inserido, quando ambos 1, sai do loop.
        //Pela lógica booleana OU entradas negadas, !0 ou !0 = 1, !1 ou !0 = 1, !0 ou !1 = 1, !1 ou !1 = 0.
        } while(!p1.setX(px) || !p1.setY(py));

        //Se saiu do loop então os valores estão ok e podem ser impressos.
        p1.imprime();

        do{
            System.out.print("Informe a coordenada x do ponto 2: ");
            px2 = ler.nextInt();

            System.out.print("Informe a coordenada y do ponto 2: ");
            py2 = ler.nextInt();

        } while(!p2.setX(px2) || !p2.setY(py2));

        //Se saiu do loop então os valores estão ok e podem ser impressos.
        p2.imprime();

        System.out.println("A distância é de: " + p1.distancia(p2) + " U.C\n"); //U.C = Unidade de Comprimento.
        
        int MAXY = 4, MAXX = 4;
        for (int i = 0; i < MAXY; i++){
            for (int j = 0; j < MAXX; j++){
                if (px == j && py == i || px2 == j && py2 == i) //Se px == linha (j) e py == coluna (i), então marca o ponto.
                    System.out.print(" x ");
                else
                    System.out.print(" - ");
                }
            System.out.println("");
        }
    }
}