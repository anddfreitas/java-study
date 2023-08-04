package Arrays.Q38;

/* Crie uma classe EntradaEmAgenda que contenha:
• os dados necessários para armazenar uma entrada de agenda (hora, dia, mês, ano
e assunto);
• um construtor;
• um método toString;
• um método ehNoDia que recebe valores de dia, mês e ano e retorna true se o dia,
mês e ano daquela instância da classe forem iguais aos argumentos passados. */

public class EntradaEmAgenda {
    private int hora;
    private int dia;
    private int mes;
    private int ano;

    public EntradaEmAgenda() {
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        }
        else {
            System.out.println("Forneça uma hora compatível!");
        }
    }
        
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia < 31) {
            this.dia = dia;
        } else {
            System.out.println("Forneça um dia válido!");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Forneça um mês válido!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 0) {
            this.ano = ano;
        } else {
            System.out.println("Forneça um ano válido!");
        }
    }

    public String toString() {
        if (verificaValores() == true) {
            return "EntradaEmAgenda [hora=" + hora + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
        } else {
            return "Implemente valores válidos!";
        }
    }

    public boolean verificaValores () {
        if (dia == 0 || mes == 0 || hora == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ehNoDia (int d, int m, int a) {
        if (d == dia && m == mes && a == ano) {
            return true;
        } else {
            return false;
        }
    }
}
