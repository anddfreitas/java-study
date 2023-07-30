package Q33;

public class DemoLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.contador.setEstado(10);
        lampada.acende();
        lampada.contador.imprimirEstado();
        lampada.mostraEstado();
        lampada.estaLigada();
        lampada.apaga();
        lampada.mostraEstado();
    }
}
