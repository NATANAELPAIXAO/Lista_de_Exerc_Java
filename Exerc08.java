import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {

        double distancia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma distância em metros:");
        distancia = sc.nextDouble();

        sc.close();

        System.out.printf("A distância de %.2f corresponde a  %.2f KM\n", distancia, (distancia / 1000));
        System.out.printf("A distância de %.2f corresponde a  %.2f Hm\n ", distancia, (distancia / 100));
        System.out.printf("A distância de %.2f corresponde a  %.2f Dam\n ", distancia, (distancia / 10));
        System.out.printf("A distância de %.2f corresponde a  %.2f dm\n ", distancia, (distancia / 10));
        System.out.printf("A distância de %.2f corresponde a  %.2f cm\n ", distancia, (distancia / 100));
        System.out.printf("A distância de %.2f corresponde a  %.2f mm\n ", distancia, (distancia / 1000));

    }
}
