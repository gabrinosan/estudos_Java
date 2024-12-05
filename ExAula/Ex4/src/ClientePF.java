public class ClientePF extends Cliente{
    private String Nome;
    private String cpf;

    public ClientePF(String dataCadastro, String Nome, String cpf) {
        super(dataCadastro);
        this.Nome = Nome;
        this.cpf = cpf;
    }

    public void imprimirDadosPF(){
        super.imprimirDados();
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + cpf);
    }
}
