package Q28;

public class Time {
    public String nome;
    private int qntJogadores;
    private int qntVitorias;
    private int qntEmpates;
    private int qntDerrotas;
    
    public Time() {
    }

    public int getQntJogadores() {
        return qntJogadores;
    }

    public void setQntJogadores(int qntJogadores) {
        if (qntJogadores > 0) {
            this.qntJogadores = qntJogadores;
        } else {
            System.out.println("Informe uma quantidade válida");
        }
    }

    public int getQntVitorias() {
        return qntVitorias;
    }

    public void setQntVitorias(int qntVitorias) {
        if (qntVitorias >= 0) {
            this.qntVitorias = qntVitorias;
        } else {
            System.out.println("Informe uma quantidade válida");
        }
    }

    public int getQntEmpates() {
        return qntEmpates;
    }

    public void setQntEmpates(int qntEmpates) {
        if (qntEmpates >= 0) {
        this.qntEmpates = qntEmpates;
        } else {
            System.out.println("Informe uma quantidade válida");
        }
    }

    public int getQntDerrotas() {
        return qntDerrotas;
    }

    public void setQntDerrotas(int qntDerrotas) {
        if (qntDerrotas >= 0) {
        this.qntDerrotas = qntDerrotas;
        } else {
            System.out.println("Informe uma quantidade válida");
        }
    }

    public int calculaPontos () {
        return (qntVitorias * 3) + (qntEmpates * 1); 
    }
    
}
