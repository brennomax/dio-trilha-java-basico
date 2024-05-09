public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 2500;
        double valorSolicitado = 2700;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println("Você sacou " + valorSolicitado + " e o seu novo saldo é: " + saldo);
    }
}