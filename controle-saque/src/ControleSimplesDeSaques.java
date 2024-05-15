import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        double saque;
        System.out.println("Digite o limite diario de saque");
        double limiteDiario = scanner.nextDouble();
        
        for(;;){
          System.out.println("Valor a sacar");
          saque = scanner.nextDouble();
          limiteDiario = limiteDiario - saque;
          if(saque == 0 || limiteDiario < 0) {
            if (saque == 0 ){
              System.out.println("Transacoes encerradas.");
              break;
            } else {
              System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
              break;
            }
          } else {
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
          }
        }
        scanner.close(); 
    }
}