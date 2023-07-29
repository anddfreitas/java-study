import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira a base: ");
        double base = sc.nextDouble();
        System.out.println("Insira o expoente: ");
        double exp = sc.nextDouble();

        double valorFinal = potencia (base, exp);

        System.out.println(valorFinal);

        sc.close();
    }

    public static double potencia (double base, double exp) {
        if (exp > 2) {
            return base * potencia (base, exp-1);
        } else if (exp == 2) {
            return base = base * base;
        } else if (exp == 1) {
            return base;
        } else {
            return 1;
        }
    }
}

