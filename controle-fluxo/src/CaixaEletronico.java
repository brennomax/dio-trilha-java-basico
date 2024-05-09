import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 2500;
        double valorSolicitado;
        Scanner scanner = new Scanner (System.in);

        valorSolicitado = scanner.nextDouble();

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Você sacou " + valorSolicitado + " e o seu novo saldo é: " + saldo);
        }else{
            System.out.println("Slado insuficiente.");
        }        
    }
}