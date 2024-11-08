public class Venda {
    static final int maxProdutos = 15;
    static final int maxParcelas = 10;

    static int numeroNFeInc = 1;
    int numeroNFe;
    String cpf;
    String data;

    Produto[] produtos = new Produto[maxProdutos];
    Pagamento[] parcelas = new Pagamento[maxParcelas];
    int[] quantidades = new int[maxProdutos];

    int contadorProdutos = 0;

    //Inicio o contador de parcelas em 0, mas incremento ele na hora de mostrar o recibo

    int contadorParcelas = 0;

    public Venda(String cpf, String data){
        this.cpf = cpf;
        this.data = data;
        this.numeroNFe = numeroNFeInc++;
    }

    //Aqui é possível gerenciar o contador de parcelas e de produtos

    public int getContadorProdutos(){
        return contadorProdutos;
    }

    public int getContadorParcelas(){
        return contadorParcelas;
    }

    public void setContadorProdutos(int contadorProdutos){
        this.contadorProdutos = contadorProdutos;
    }

    public void setContadorParcelas(int contadorParcelas){
        this.contadorParcelas = contadorParcelas;
    }

    public boolean registraProduto(Produto produto, int quantidade) {
        if (contadorProdutos < maxProdutos && produto.getQuantidadeEstoque() >= quantidade) {
            produtos[contadorProdutos] = produto;
            quantidades[contadorProdutos] = quantidade;

            produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);

            contadorProdutos++;

            return true;
        } 
        else 
        {
            System.out.println("Não é possível adicionar mais produtos.");
            return false;
        }
    }

    public double calculaValorTotal() {
        double total = 0;

        for (int i = 0; i < contadorProdutos; i++) {
            total += produtos[i].getValor() * quantidades[i];
        }
        return total;
    }

    public void finalizaVenda(int numeroParcelas) {
        if (numeroParcelas > 0 && numeroParcelas <= maxParcelas) {

            double valorParcela = calculaValorTotal() / numeroParcelas;
            
            for (int i = 0; i < numeroParcelas; i++) {
                registraPagamento(data, valorParcela);
            }
        }
        else
        {
            System.out.println("Número de parcelas inválido.");
        }
    }

    public boolean registraPagamento(String data, double valor) {
        if (contadorParcelas < maxParcelas) {
            Pagamento pagamento = new Pagamento(data, valor);
            parcelas[contadorParcelas++] = pagamento;
            return true;
        } 
        else
        {
            System.out.println("Não é possível adicionar mais parcelas.");
            return false;
        }
    }

    public void imprimeRecibo() {
        System.out.println("Dados da Venda:");
        System.out.println("NFe: " + numeroNFe);
        System.out.println("CPF: " + cpf);
        System.out.println("Data: " + data);
        System.out.println("Total de produtos: " + contadorProdutos);
        for (int i = 0; i < contadorProdutos; i++) {
            System.out.println((i + 1) + " " + produtos[i].getDescricao() + " " + quantidades[i] + " " + (produtos[i].getValor() * quantidades[i]));
        }
        System.out.println("Valor total: R$: " + calculaValorTotal());
        System.out.println("Total de parcelas: " + contadorParcelas);
        for (int i = 0; i < contadorParcelas; i++) {
            //Aqui eu deveria implementar a lógica para incrementar o mês.
            System.out.print((i + 1) + " " + parcelas[i].getData());
            System.out.printf(" R$ %.2f\n", parcelas[i].getValor());
        }
    }
}
