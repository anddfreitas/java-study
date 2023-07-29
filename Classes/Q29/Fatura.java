package Q29;

public class Fatura {
    public int numeroID;
    public String desc;
    private double quantidade;
    private double preco;
    
    public Fatura() {
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.quantidade = 0;
        }
    }

    public double calculaTotal () {
        return quantidade * preco;
    }
}
