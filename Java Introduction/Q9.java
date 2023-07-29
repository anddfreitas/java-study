import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe o valor da carta: ");
        int valor = sc.nextInt();
        System.out.print("Informe o naipe: ");
        int naipe = sc.nextInt();

        switch (valor) {
            case 1:
                System.out.print("Ás de ");
            break;
            case 2:
                System.out.print("Dois de ");
            break;
            case 3:
                System.out.print("Três de ");
            break;
            case 4:
                System.out.print("Quatro de ");
            break;
            case 5:
                System.out.print("Cinco de ");
            break;
            case 6:
                System.out.print("Seis de ");
            break;
            case 7:
                System.out.print("Sete de ");
            break;
            case 8:
                System.out.print("Oito de ");
            break;
            case 9:
                System.out.print("Nove de ");
            break;
            case 10:
                System.out.print("Dez de ");
            break;
            case 11:
                System.out.print("Valete de ");
            break;
            case 12:
                System.out.print("Rainha de ");
            break;
            case 13:
                System.out.print("Rei de ");
            break;
            default: 
                System.out.println("Carta inválida.");
        }
        
        switch(naipe) {
            case 1:
                System.out.print("Ouros");
            break; 
            case 2:
                System.out.print("Paus");
            break; 
            case 3:
                System.out.print("Copas");
            break; 
            case 4:
                System.out.print("Espadas");
            break;
            default:
                System.out.println("Naipe inválido.");
        } 
        sc.close();
    }
}
