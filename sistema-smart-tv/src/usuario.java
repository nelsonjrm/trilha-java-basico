public class usuario {
    public static void main(String[] args) throws Exception {
        smartTv smartTv = new smartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo método -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo método -> A TV está ligada? " + smartTv.ligada);
    }
}
