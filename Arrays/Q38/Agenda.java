package Arrays.Q38;

import java.util.Scanner;

/* Crie também uma classe Agenda que:
• encapsule uma agenda de compromissos representada por um ArrayList de instâncias
da classe EntradaEmAgenda;
• implemente um método construtor;
• possua um método para adicionar um novo compromisso à lista de compromissos;
• tenha um método listaDia que recebe valores de dia, mês e ano e lista todas as
instâncias de EntradaEmAgenda que caem naquele dia, mês e ano.

Por fim, escreva uma classe executável que crie uma Agenda, adicione a ela 5 compromissos
e, usando o método listaDia, liste as entradas da agenda tem a mesma da data
do seu aniversário.*/

public class Agenda {

    private int tam;

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        if (tam >= 0) {
            this.tam = tam;
        } else {
            System.out.println("Informe um tamanho válido!");
        }
    }

    EntradaEmAgenda entrada[] = new EntradaEmAgenda[tam];


    public void construtor () {
        for (int i = 0; i < tam; i++) {
            //if (entrada[i].getHora() == 0 && entrada[i].getDia() == 0 && entrada[i].getMes() == 0 && entrada[i].getAno() == 0) {
                Scanner sc = new Scanner (System.in);
                // Hora
                System.out.print("Informe a hora: ");
                int guarda = sc.nextInt();
                entrada[i].setHora(7); 
                // Dia
                System.out.print("Informe o dia: ");
                int guarda2 = sc.nextInt();
                entrada[i].setDia(guarda2); 
                // Mês
                System.out.print("Informe o mês: ");
                guarda = sc.nextInt();
                entrada[i].setMes(guarda); 
                // Ano
                System.out.print("Informe o ano: ");
                guarda = sc.nextInt();
                entrada[i].setAno(guarda); 

                sc.close();
            //}
        }
    }

    public int adicionTam () {
        return tam++;
    }

    public void listaDia (int d, int m, int a) {
        for (int i = 0; i < tam; i++) {
            if (entrada[i].getDia() == d && entrada[i].getMes() == m && entrada[i].getAno() == a) {
                System.out.println("Instância " + i);
            }
        }
    }
    
}
