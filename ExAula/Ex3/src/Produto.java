public class Produto {

    private String nome;
    private double preco;
    private String categoria;
    private int codigo;
    static private int contador = 0; //contador deve ser static, caso contrário será resetado a cada vez que passar pelos construtores.

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

        contador += 1;
        codigo = contador;
        categoria = "Sem Categoria";
    }
    
    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;

        contador += 1;
        codigo = contador;
    }
    
    public void exibirDetalhes(){
        System.out.print("Código: " + codigo + "\nNome: " + nome + "\nPreço: " + preco + "\nCategoria: " + categoria + "\n");
        System.out.println();
    }

    public boolean verificarCod(int valor){
        if (valor == codigo)
            return true;
        return false;
    }

}
