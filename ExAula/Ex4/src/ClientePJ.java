public class ClientePJ extends Cliente{
    private String razaoSocial;
    private String cnpj;

    public ClientePJ(String dataCadastro, String razaoSocial, String cnpj) {
        super(dataCadastro);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public void imprimirDadosPJ(){
        super.imprimirDados();
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
    }
}
