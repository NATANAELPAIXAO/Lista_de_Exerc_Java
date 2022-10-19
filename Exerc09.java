import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {

        double real;
        double dolar = 3.45;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quanto você possui na carteira em R$ ");
        real = sc.nextDouble();

        sc.close();

        /* Considere US$1,00 = R$3,45. */
        System.out.printf("Eu tenho na carteira R$ %.2f, você pode comprar US$ %.2f", real, (real / dolar));

    }
}
