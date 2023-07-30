package Q33;

public class Lampada {
    private boolean estadoDaLampada;
    Contador contador = new Contador();

    public boolean isEstadoDaLampada() {
        return estadoDaLampada;
    }

    public void setEstadoDaLampada(boolean estadoDaLampada) {
        this.estadoDaLampada = estadoDaLampada;
    }

    public void acende () {
        contador.incrementarEstado();
        estadoDaLampada = true;
    }

    public boolean apaga () {
        return estadoDaLampada = false;
    }

    public void mostraEstado () {
        if (estadoDaLampada == true) {
            System.out.println("A lâmpada está ligada!");
        } else {
            System.out.println("A lâmpada está desligada!");
        }
    }

    public boolean estaLigada () {
        if (estadoDaLampada == true) {
            return true;
        } else {
            return false;
        }
    }

}
