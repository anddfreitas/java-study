import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int c, d, u;
        System.out.print("Informe um número de 3 digítos no formado CDU: ");
        int valor = sc.nextInt();
        
        u = valor % 10;
        valor /= 10;
        d = valor % 10;
        valor /= 10;
        c = valor % 10;
        valor /= 10;

        System.out.println("CDU = " + c + d + u + "\nUCD = " + u + c + d);
        sc.close();
    }
}
