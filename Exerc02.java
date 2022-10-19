import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String nome;

    System.out.println("Qual é o seu nome?");
    nome = sc.nextLine();

    sc.close();

    System.out.printf("Olá %s, é um prazer te conhecer!",nome);

    }
}
