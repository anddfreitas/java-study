import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Defina o enésimo termo: ");
        int valor = sc.nextInt();

        int primeiro = 0, segundo = 1, resultado;

        for (int i = 0; i < valor; i++) {
            resultado = primeiro + segundo;
            System.out.println(primeiro +  " + " + segundo + " = " + resultado);
            primeiro = segundo;
            segundo = resultado;
        }

        sc.close();
    }
}
