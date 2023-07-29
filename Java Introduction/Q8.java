import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe o código do setor: ");
        int cod = sc.nextInt();
        System.out.print("Informe o valor do produto: ");
        double valor = sc.nextDouble();

        String setor = "";

        switch (cod) {
            case 222:
                setor = "Setor de eletros";
                if (valor > 500) {
                    valor = valor - (valor * 0.10);
                }
            break;
            case 111:
                setor = "Setor de Cama, Mesa e Banho";
                if (valor < 50) {
                    valor = valor - (valor * 0.10);
                } else if (valor >= 50 && valor <= 100) {
                    valor = valor - (valor * 0.20);
                } else {
                    valor = valor - (valor * 0.40);
                }
            break;
            default:
                System.out.println("Setor inválido.");
        }

        System.out.println(setor + "\nValor = " + valor);

        sc.close();
    }
}
