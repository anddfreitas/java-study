package Q29;

public class FaturaMain {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        
        fatura.numeroID = 12;
        fatura.desc = "Colônia";
        fatura.setPreco(182.5);
        fatura.setQuantidade(3);

        System.out.println("Nome: " + fatura.desc + "\nID: " + fatura.numeroID + "\nQuantidade: " + fatura.getQuantidade() + "\nPreço: " + fatura.getPreco() + "\nPreço em estoque: " + fatura.calculaTotal());
    }
}
