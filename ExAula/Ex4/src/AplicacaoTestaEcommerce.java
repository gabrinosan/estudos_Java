public class AplicacaoTestaEcommerce {
    public static void main(String[] args) {

        boolean flag = false;

        //Aqui eu estou instanciando os produtos
        Produto cookie = new Produto("Cookie", 2.0, 23);
        Produto melancia = new Produto("Melancia", 10.0, 35);
        Produto pao = new Produto("Pão", 5.0, 22);
        Produto queijo = new Produto("Queijo", 35.0, 44);

        //Aqui eu estou instanciando a venda e o cliente PF
        Cliente clienteRef = new ClientePF("02/05/2008", "Joaquim", "111.222.333-44");
        Venda venda = new Venda(clienteRef);

        //Aqui eu estou instanciando a venda e o cliente PJ
        //Cliente clienteRef = new ClientePJ("05/02/2010", "Acer", "111.222.333/0001-44");
        //Venda venda = new Venda(clienteRef);

        if (clienteRef instanceof ClientePF) {
            flag = true;
        }

        venda.registraProduto(cookie, 5);
        venda.registraProduto(melancia, 3);
        venda.registraProduto(pao, 4);
        venda.registraProduto(queijo, 2);

        venda.finalizaVenda(5);

        venda.imprimeRecibo(flag, new ClientePF("02/05/2008", "Joaquim", "111.222.333-44"), new ClientePJ("05/02/2010", "Acer", "111.222.333/0001-44"));
    }
}