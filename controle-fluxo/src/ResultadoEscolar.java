import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        double nota;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Sistema de verificação de aprovação escolar.");
        System.out.println("Aprovado se nota for maior que 7.\nRecuperação se maior que maior ou igual a 5 e menor que 7.\nCaso contrário, reprovado.");
        System.out.println("Digite a sua nota para verificar se está aprovado:");
        nota = scanner.nextDouble();

        if (nota >= 7){
            System.out.println("Você está aprovado!");
        }else if(nota >= 5 && nota < 7){
            System.out.println("Você está de recuperação!");
        }else{
            System.out.println("Você não foi aprovado!");
        }

        // String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
    }
}
