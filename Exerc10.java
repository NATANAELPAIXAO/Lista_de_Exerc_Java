import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {

        double altura;
        double largura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual altura da parede em metros: ");
        altura = sc.nextDouble();

        System.out.println("Qual a largura da parede em metros: ");
        largura = sc.nextDouble();

        sc.close();

        System.out.printf("A área a ser pintada é : %.2f \n", (largura * altura));

        /* sabendo que cada litro de tinta pinta uma área de 2 metros quadrados */
        System.out.printf("A Quantidade de tinta a ser usada é: %.2f litros \n", ((altura * largura)/2));
    }
}
