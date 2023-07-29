import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o valor do lado do quadrado: ");
        float lado = sc.nextFloat();

        System.out.println("O valor da área do quadrado é: " + lado*lado);

        sc.close();
    }
}
