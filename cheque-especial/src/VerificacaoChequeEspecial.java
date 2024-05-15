import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteChequeEspecial = 500;
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o valor a ser sacado");
        double saque = scanner.nextDouble();

        if (saque <= saldo + limiteChequeEspecial) {
            if (saque <= saldo){
                System.out.println("Transacao realizada com sucesso.");
            } else {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            }
        } else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }
        scanner.close();
    }
}