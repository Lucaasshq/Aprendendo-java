package metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV Ligada ? " + smartTv.ligada);

        System.out.println(" Canal Atual :" + smartTv.canal);

        System.out.println(" Volume Atual :" + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(50);
    }
}
