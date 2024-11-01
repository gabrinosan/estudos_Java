public class AplicacaoTestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 10, "Alimentos");
        Produto p2 = new Produto("Feijão", 15, "Alimentos");
        Produto p3 = new Produto("Parque", 20, "Lazer");
        Produto p4 = new Produto("Carro", 1000);
        Produto p5 = new Produto("Moto", 500);
        
        p1.exibirDetalhes();
        p2.exibirDetalhes();
        p3.exibirDetalhes();
        p4.exibirDetalhes();
        p5.exibirDetalhes();

        //É possível observar que não existe código 10, isso pois foi realizada apenas 1 atribuição por objeto, então o retorno será false.
        //No objeto p5, teremos o código 5, por exemplo.
        System.out.println(p1.verificarCod(10));
    }
}
