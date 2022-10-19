import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {

        double numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        numero = sc.nextDouble();

        sc.close();

        System.out.printf("O dobro de %.2f é %.2f\n", numero, (numero * 2));
        System.out.printf("A terça parte de %.2f é %.6f", numero, numero / 3);
    }
}
