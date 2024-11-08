public class AplicacaoTestaEcommerce {
    public static void main(String[] args) {
        //Aqui eu estou instanciando os produtos
        Produto cookie = new Produto("Cookie", 2.0, 23);
        Produto melancia = new Produto("Melancia", 10.0, 35);
        Produto pao = new Produto("Pão", 5.0, 22);
        Produto queijo = new Produto("Queijo", 35.0, 44);

        //Aqui eu estou instanciando a venda
        Venda venda = new Venda("123.456.789-10", "07/11/2024");

        venda.registraProduto(cookie, 5);
        venda.registraProduto(melancia, 3);
        venda.registraProduto(pao, 4);
        venda.registraProduto(queijo, 2);

        venda.finalizaVenda(5);

        venda.imprimeRecibo();
    }
}