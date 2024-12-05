public class ClientePF extends Cliente{
    private String Nome;
    private String cpf;

    public ClientePF(String dataCadastro, String Nome, String cpf) {
        super(dataCadastro); //Herdando com o super, pois já possui um dataCadastro na classe Cliente.
        this.Nome = Nome;
        this.cpf = cpf;
    }

    public void imprimirDadosPF(){
        super.imprimirDados(); //Chamando o método imprimirDados da classe Cliente.
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + cpf);
    }
}
