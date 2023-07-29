package Q31;

/* Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), o total de
andares no prédio (desconsiderando o térreo), a capacidade do elevador e quantas pes-
soas estão presentes nele. Outras classes não devem ter acesso direto aos atributos de
Elevador. A classe deve também disponibilizar os seguintes métodos:
• construtor : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (um elevador sempre começa no térreo e vazio);
• entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
• sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
• sobe : para subir um andar (não deve subir se já estiver no último andar);
• desce : para descer um andar (não deve descer se já estiver no térreo).
4Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja,
execute todos os métodos da classe. */

public class Elevador {
    private int andarAtual = 0;
    private int quantidadePessoas = 0;
    public int totalAndares;
    public int capacidadeElevador;

    public Elevador(int totalAndares, int capacidadeElevador) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
    
    public void entra () {
        if (quantidadePessoas < capacidadeElevador) {
            quantidadePessoas++;
        }
    }

    public void sai () {
        if (quantidadePessoas != 0) {
            quantidadePessoas--;
        }
    }

    public void sobe () {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void desce () {
        if (andarAtual > 0) {
            andarAtual--;
        } 
    }
    
}



    
    

