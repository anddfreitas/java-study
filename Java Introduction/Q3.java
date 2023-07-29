import java.util.Scanner;
import java.lang.Math;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe o ângulo em graus: ");
        double graus = sc.nextFloat();
        double rad = graus * Math.PI / 180;
        double sen = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        double cotan = Math.tanh(rad);
        double coss = Math.cosh(rad);
        double sec = Math.sinh(rad);

        System.out.println(graus + "° = " + rad + "\nSen = " 
        + sen + "\nCos = " + cos + "\nTan = " + tan + 
        "\nCossecante = " + coss + "\nSecante = " + sec 
        + "\nCotangente = " + cotan);
        sc.close();
    }
}
