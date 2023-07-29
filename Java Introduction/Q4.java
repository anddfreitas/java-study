import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe a temperatura em C°: ");
        float temp = sc.nextFloat();
        System.out.println(temp + "C° = " + (temp * 1.8 + 32) + "F");
        sc.close();
    }
}
