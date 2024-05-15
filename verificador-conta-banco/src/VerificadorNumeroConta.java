import java.util.Scanner; 

public class VerificadorNumeroConta { 
    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner(System.in);
        String numeroConta;
        
        do {
            System.out.println("Digite o número da conta");
            numeroConta = scanner.next();

            try {
                verificarNumeroConta(numeroConta);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage()); 
            }
        } while (numeroConta.length() != 8);
        scanner.close();
    }

    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Número de conta inválido.\nDigite exatamente 8 dígitos.");
        } else {
            System.out.println("Número de conta válido.");
        }            
    }
}