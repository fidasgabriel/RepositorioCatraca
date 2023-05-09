import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catraca catraca = new Catraca();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número do seu crachá:");
        int numCracha = scan.nextInt();
        System.out.println("Digite seu nome:");
        String donoCracha = scan.next();

        Cracha cracha = new Cracha(numCracha, donoCracha);

    }
}