import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe um dia entre 1 e 28: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
            case 8:
            case 15:
            case 22: 
                System.out.println("O dia " + dia + " será um Domingo.");
            break;
            case 2:
            case 9:
            case 16:
            case 23:
                System.out.println("O dia " + dia + " será uma Segunda.");
            break;
            case 3:
            case 10:
            case 17:
            case 24:
                System.out.println("O dia " + dia + " será uma Terça.");
            break;
            case 4:
            case 11:
            case 18:
            case 25:
                System.out.println("O dia " + dia + " será uma Quarta.");
            break;
            case 5:
            case 12:
            case 19:
            case 26:
                System.out.println("O dia " + dia + " será uma Quinta.");
            break;
            case 6:
            case 13:
            case 20:
            case 27:
                System.out.println("O dia " + dia + " será uma Sexta.");
            break;
            case 7:
            case 14:
            case 21:
            case 28:
                System.out.println("O dia " + dia + " será um Sábado.");
            break;
            default:
                System.out.println("Informe um dia válido");
        }

        sc.close();
    }
}
