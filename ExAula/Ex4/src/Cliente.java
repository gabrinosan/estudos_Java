public class Cliente {
    private int id = 0;
    private String dataCadastro;

    public Cliente(String dataCadastro) {
        this.dataCadastro = dataCadastro;
        id++;
    }

    public void imprimirDados() {
        System.out.println("Cliente: " + id);
        System.out.println("Data de cadastro: " + dataCadastro);
    }

    public int getID() {
        return id;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }
}
