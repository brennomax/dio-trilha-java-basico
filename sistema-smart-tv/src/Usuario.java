import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        int valor, i = 0;
        SmartTv smartTv1 = new SmartTv();
        Scanner sc = new Scanner(System.in);

        System.out.println("A TV está ligada? " +smartTv1.ligada);

        do { 
            System.out.println("Qual ação você deseja realizar?\n");
            System.out.println("Ligar SmartTV: 1 | Desligar SmartTV: 2");
            System.out.println("Aumentar volume: 3 | Diminuir volume: 4");
            System.out.println("Avançar canal: 5 | Voltar canal: 6");
            System.out.println("Escolher canal: 7");
            System.out.println("Sair: 0");

            valor = sc.nextInt();

            switch (valor) {
                case 0:
                    i = -1;
                    break;
                case 1:  
                    smartTv1.ligar();
                    break;
                case 2:  
                    smartTv1.desligar();
                    break;
                case 3:  
                    smartTv1.aumentarVolume();
                    break;
                case 4:  
                    smartTv1.diminuirVolume();
                    break;
                case 5:  
                    smartTv1.avancarCanal();
                    break;
                case 6:
                    smartTv1.voltarCanal();
                    break;
                case 7:
                    System.out.println("Digite o canal: ");
                    valor = sc.nextInt();
                    smartTv1.mudarCanal(valor);
                    break;
            }
            
            if(i<0){
                break;
            }

            i++;
        } while (i>=0);
    }
}
