import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);
        int numeroConta;
        double saldo;
        String nome, sobrenome, agencia;

        System.out.println("Por favor, digite o seu nome:");
        nome = scanner.next();

        System.out.println("Agora digite o seu sobrenome:");
        sobrenome = scanner.next();

        System.out.println("Digite a sua agencia:");
        agencia = scanner.next();

        System.out.println("Agora digite o numero da sua conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Gentileza digitar o saldo:");
        saldo = scanner.nextDouble();

        System.out.println("Ola " + nome + " " + sobrenome +", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque.");
    }
}