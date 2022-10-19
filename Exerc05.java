import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {

        double nota1;
        double nota2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a primeira nota?");
        nota1 = sc.nextDouble();

        System.out.println("Qual a segunda nota?");
        nota2 = sc.nextDouble();

        sc.close();

        System.out.printf("A média entre %.2f e %.2f é igual a %.2f", nota1, nota2, ((nota1 + nota2) / 2));

    }
}
