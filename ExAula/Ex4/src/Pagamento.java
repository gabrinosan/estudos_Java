public class Pagamento {
    String data;
    double valor;

    public Pagamento(String data, double valor){
        this.data = data;
        this.valor = valor;
    }

    //Apenas será possível visualizar a data e o valor, sem alterá-los.

    public String getData(){
        return data;
    }

    public double getValor(){
        return valor;
    }
}
