import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        int passa = 2;
        sc.close();

        primo (num, passa);
    }

    public static int primo (int num, int passa) {
        if (num%passa == 0 && passa != num) {
            System.out.println(num + " não é primo!");
            return 0;
        } else if (passa == num) {
            System.out.println(num + " é primo!");
            return 0;
        } else {
            return primo (num, passa+1);
        }
    }
}
