public class Imovel {

    int nQuartos;
    int nBanheiros;
    boolean temGaragem;
    String endereco;
    boolean aluguel;
    double valorVenda;
    public static void main(String[] args) {
        
        Imovel im1, im2; // declaracao do objeto1 e objeto2
        im1 = new Imovel(); // instanciacao do objeto1
        im2 = new Imovel(); // instanciacao do objeto2
        
        im1.nQuartos = 2;
        im1.nBanheiros = 1;
        im1.temGaragem = false;
        im1.endereco = "Rua dos Fulanos, n. 0";
        im1.aluguel = false;
        im1.valorVenda = 142000;

        /* Implementação da parte #5, conforme visto em aula os objetos não tem relação entre si, quando se instancia um novo objeto, 
        este já é encapsulado, portanto, um objeto não é capaz de saber o que tem dentro do outro, o que corrobora para o resultado 
        visto nesse item, "Imoveis distintos!" */

        /* im2.nQuartos = 2;
        im2.nBanheiros = 1;
        im2.temGaragem = false;
        im2.endereco = "Rua dos Fulanos, n. 0";
        im2.aluguel = false;
        im2.valorVenda = 142000;

        if (im1 == im2){
            System.out.println("Mesmos imoveis!");
        }else{
            System.out.println("Imoveis distintos!");
        } */
        
        /* Parte #6 Aqui é possível ver um ponteiro valorVenda do im3 que aponta para im1, assim, quando mudo im3.valorVenda, este muda im1.valorVenda
           Em python acontece a mesma coisa quando apontamos dessa forma, a solução seria usar o método copy(), assim mantenho íntegro o conteúdo de
           im1.valorVenda, e posso mudar sem problemas im3.valorVenda */

        /* Imovel im3 = im1;
        im3.valorVenda = 0; // imovel com perda total
        im3.imprimeDados();
        System.out.println("\n");
        im1.imprimeDados(); */

        System.out.println("--------------------------------------------------------------------------------");
        im1.imprimeDados();
        System.out.print("--------------------------------------------------------------------------------");
        im1.valoriza(2.5);
        System.out.println();
        im1.imprimeDados();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(im1.calculaImposto());
        System.out.println("--------------------------------------------------------------------------------");
    }
    
    public void imprimeDados() {
        System.out.println("Quartos: " + nQuartos + 
                           "\nBanheiros: " + nBanheiros +
                           "\nEndereço: " + endereco + 
                           "\nValor de venda: " + valorVenda);

        if (temGaragem){System.out.println("Possui garagem");}
        else{System.out.print("Não possui garagem\n");}

        if (aluguel){System.out.println("Pode ser alugada");}
        else{System.out.print("Não pode ser alugada\n");}
    }
    
    public void valoriza(double perc){
        valorVenda *= (1 + (perc / 100));
    }
    
    // Aqui eu mudo o tipo do método calculaImposto para que eu possa retornar uma string mostrando a situação do imóvel, além do imposto incidente

    public String calculaImposto(){
        if (aluguel == false){
            return "Imóvel disponível apenas para venda, valor dos impostos incidentes: R$" + 0.18 * valorVenda;
        }
        else{
            return "Imóvel disponível apenas para aluguel, valor dos impostos incidentes: R$" + valorVenda * 0.06;
        }
    }
}
