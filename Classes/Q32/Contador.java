package Q32;

/* Escreva a classe Contador que encapsule um valor usado para contagem de eventos.
Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo
com que o acesso ao valor seja feito através de métodos que devem zerar, incrementar
e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as
capacidades da classe criada. */

public class Contador {
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        if (estado < 0) {
            System.out.println("Insira um valor válido!");
        } else {
            this.estado = estado;
        }
    }

    public int zerarEstado () {
        return estado = 0;
    }

    public int incrementarEstado () {
        return estado++;
    }

    public void imprimirEstado () {
        System.out.println("O valor do contador é: " + estado);
    }
}
