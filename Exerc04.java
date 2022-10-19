import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        
        double numero1;
        double numero2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número");
        numero2 = sc.nextDouble();

        sc.close();

        System.out.printf("A soma entre %.2f e %.2f é igual a %.2f.", numero1, numero2, numero1+numero2);


    }
}
