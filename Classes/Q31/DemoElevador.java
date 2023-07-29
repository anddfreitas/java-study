package Q31;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 4);

        elevador.entra();
        elevador.entra();
        elevador.sobe();

        System.out.println("Quantidade de pessoas: " + elevador.getQuantidadePessoas());
        System.out.println("Andar atual: " + elevador.getAndarAtual());
    }
}
