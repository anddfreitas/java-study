import java.util.Scanner;
import java.lang.Math;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("N1: ");
        int n1 = sc.nextInt(); 
        System.out.print("N2: ");
        int n2 = sc.nextInt(); 
        System.out.print("N3: ");
        int n3 = sc.nextInt();
        
        int min = Math.min(n1, Math.min(n2, n3));
        int max = Math.max(n1, Math.max(n3, n2));

        System.out.println("Menor: " + min + "\nMaior: " + max);

        sc.close();
    }
}
