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
        im1.aluguel = true;
        im1.valorVenda = 142000;

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

        // Aplicação de um novo conceito, Operador de condição ternária

        String verfica_garagem = temGaragem ? "Possui garagem\n" : "Não possui garagem\n";
        System.out.print(verfica_garagem);

        String verifica_aluguel = aluguel ? "Pode ser alugada\n" : "Não pode ser alugada\n";
        System.out.print(verifica_aluguel);
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
