import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número");
        numero = sc.nextInt();

        sc.close();

        System.out.printf("O antecessor de %d é %d\n", numero, numero-1);
        System.out.printf("O sucessor de %d é %d\n", numero, numero+1);
    }
}
