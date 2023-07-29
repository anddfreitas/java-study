import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe o numero 1: ");
        float n1 = sc.nextFloat();
        System.out.print("Informe o numero 2: ");
        float n2 = sc.nextFloat();
        System.out.print("Informe o numero 3: ");
        float n3 = sc.nextFloat();

        System.out.println("A média aritmética é: " + (n1 + n2 + n3) / 3);
        sc.close();
    }
}
