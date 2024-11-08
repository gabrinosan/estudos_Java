public class Produto {
    private String descricao;
    private double valor;
    private int quantidadeEstoque;

    public Produto(String descricao, double valor, int quantidadeEstoque){
        this.descricao = descricao;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //Aqui é possível ter um maior controle sobre as informações do produto, podendo editá-las.

    public String getDescricao(){
        return descricao;
    }

    public double getValor(){
        return valor;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
