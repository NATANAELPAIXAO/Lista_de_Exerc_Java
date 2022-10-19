import java.util.Scanner;

public class Exerc03 {
public static void main(String[] args) {

    String nome;
    double salario;

    Scanner sc = new Scanner(System.in);

    System.out.println("Qual seu nome?");
    nome = sc.nextLine();

    System.out.println("Qual seu Salario?");
    salario = sc.nextDouble();

    sc.close();

    System.out.printf("O funcionário %s tem um salário de %.2f em Junho.", nome, salario);
}



}
