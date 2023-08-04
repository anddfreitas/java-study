package Q34;

/* Escreva uma classe para representar um número complexo. Essa classe deve conter
três construtores. Um construtor deverá receber os dois valores (parte real e parte imaginária)
como argumentos, o outro somente o valor real, considerando o imaginário como
sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e
imaginária do número complexo como sendo iguais a zero. Escreva um método toString
que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um
aplicativo de teste que demonstre as capacidades da classe criada. */

public class Complexo {
    public int real;
    public int imaginario;

    public Complexo() {
    }

    public Complexo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complexo(int real) {
        this.real = real;
    }

    public String toString () {
        return String.format (real + " + " + imaginario + "i");
    }
    
}
