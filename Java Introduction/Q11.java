import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Coordenada x1: ");
        int x1 = sc.nextInt();
        System.out.print("Coordenada y1: ");
        int y1 = sc.nextInt();
        System.out.print("Coordenada x2: ");
        int x2 = sc.nextInt();
        System.out.print("Coordenada y2: ");
        int y2 = sc.nextInt();

        if (x2 > x1) {
            System.out.print("O segundo ponto está a Direita do primeiro e ");
        } else if (x2 < x1) {
            System.out.print("O segundo ponto está a Esquerda do primeiro e ");
        } else {
            System.out.print("O segundo ponto está Alinhado ao primeiro e ");
        }

        if (y2 > y1) {
            System.out.print("Acima dele.");
        } else if (y2 < y1) {
            System.out.print("Abaixo dele.");
        } else 
            System.out.print("Na mesma altura.");
        
        sc.close();
    }
}
