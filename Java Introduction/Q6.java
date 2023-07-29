import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe um período em minutos: ");
        int min = sc.nextInt();
        int dias, horas;

        dias = min / 1440;
        min = min - (dias * 1440);
        horas = min / 60;
        min = min - (horas * 60);

        System.out.println(dias + " dias, " + horas + " horas e " + min + " minutos");

        sc.close ();
    }
}
