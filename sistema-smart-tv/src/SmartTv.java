public class SmartTv {
    boolean ligada = false;
    int volume = 3;
    int canal = 1;

    public void ligar(){
        if(ligada == true){
            System.out.println("A SmartTV já está ligada!");
        }else{
            ligada = true;
            System.out.println("A SmartTV está ligada!");
        }
    }

    public void desligar(){
        if(ligada == false){
            System.out.println("A SmartTV já está desligada!");
        }else{
            ligada = false;
            System.out.println("A SmartTV está desligada!");
        }
    }

    public void aumentarVolume(){
        if(volume == 100){
            System.out.println("A SmartTV está no volume máximo: " + volume);
        }else{
            volume++;
            System.out.println("Volume da SmartTV: " + volume);
        }
    }

    public void diminuirVolume(){
        if(volume == 0){
            System.out.println("A TV está no volume mínimo (mudo): " + volume);
        }else{
            volume--;
            System.out.println("Volume da SmartTV: " + volume);
        }
    }

    public void avancarCanal(){
        if(canal == 30){
            canal = 1;
        }else{
            canal++;
        }
        System.out.println("Novo canal: " + canal);
    }

    public void voltarCanal(){
        if(canal == 1){
            canal = 30;
        }else{
            canal--;
        }
        System.out.println("Novo canal: " + canal);
    }

    public void mudarCanal(int novoCanal){
        if(novoCanal > 30 || novoCanal < 1){
            System.out.println("Canal inválido!");
        }else{
            canal = novoCanal; 
            System.out.println("Novo canal: " + canal);
        }
    }

}