import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i=0, contador;

        System.out.println("Este é um contador de números exceto múltiplos de 3!");
        System.out.println("Digite até quanto deseja que o contador conte: ");
        contador = scanner.nextInt();

        do{
            if(i % 3 != 0){
                System.out.println(i);
            }
            i++;
        }while(i <= contador);
    }
}