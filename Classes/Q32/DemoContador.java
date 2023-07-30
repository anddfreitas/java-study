package Q32;

public class DemoContador {
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.setEstado(10);
        contador.imprimirEstado();
        contador.incrementarEstado();
        contador.imprimirEstado();
        contador.zerarEstado();
        contador.imprimirEstado();
        contador.incrementarEstado();
        contador.imprimirEstado();
    }
}
