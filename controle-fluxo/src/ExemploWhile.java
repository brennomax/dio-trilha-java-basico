import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i=0, contador;

        System.out.println("Este é um contador de números pares!");
        System.out.println("Digite até quanto deseja que o contador conte: ");
        contador = scanner.nextInt();

        while(i <= contador){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}