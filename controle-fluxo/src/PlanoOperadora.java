import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        String plano;

        System.out.println("Temos três opções de planos telefônicos existentes: T, M e B.");
        System.out.println("Digite uma opção e descubra os benefícios:");

        plano = scanner.next();

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
                break;
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default:
                System.out.println("Opção inexistente!");
        }
    }
}