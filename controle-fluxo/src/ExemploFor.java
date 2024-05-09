import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int contador;

        System.out.println("Este é um contador!");
        System.out.println("Digite até quanto deseja que o contador conte: ");
        contador = scanner.nextInt();

        for (int i = 0; i <= contador; i++) {
            System.out.println(i);
        }
    }
}