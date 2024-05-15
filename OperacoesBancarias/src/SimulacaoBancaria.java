import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0, saque;

        while (true) {
            System.out.println("1. Depositar\n2. Sacar\n3. Consultar Saldo\n0. Encerrar");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Programa encerrado.");
                break;
            }else{
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valorr a ser depositado");
                        saldo = scanner.nextDouble();
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser sacado");
                        saque = scanner.nextDouble();
                        if(saque > saldo) {
                            System.out.println("Saldo insuficiente.");
                            break;
                        } else {
                            saldo = saldo - saque;
                            System.out.println("Saldo atual: " + saldo);
                            break;
                        }
                    case 3:
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }            
            }
        }
    }
}
