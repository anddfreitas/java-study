package Q28;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time();

        time.nome = "Fluflas";
        time.setQntJogadores(16);
        time.setQntVitorias(8);
        time.setQntEmpates(7);
        time.setQntDerrotas(0);

        System.out.println("Nome: " + time.nome + "\nQuantidade de jogadores: " + time.getQntJogadores() + "\nQuantidade de vitórias: " + time.getQntVitorias() + "\nQuantidade de empates: " + time.getQntEmpates() + "\nQuantidade de derrotas: " + time.getQntDerrotas() + "\nPontos: " + time.calculaPontos());

    }
}
