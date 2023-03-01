public class Usuario {
    public static void main(String[] args) {
        SmartTV SmartTV = new SmartTV();

        SmartTV.diminuirVolume();
        SmartTV.diminuirVolume();
        SmartTV.diminuirVolume();
        SmartTV.aumentarVolume(); // 23

        SmartTV.mudarCanal(13);
        System.out.println("canal atual: " + SmartTV.canal);

        System.out.println("volume atual: " + SmartTV.volume);

        System.out.println("TV ligada ? " + SmartTV.ligada);
        System.out.println("canal atual: " + SmartTV.canal);
        System.out.println("volume a tual: " + SmartTV.volume);

        SmartTV.ligada();
        System.out.println("Novo Status -> TV ligada ? " + SmartTV.ligada);

        SmartTV.delisgar();
        System.out.println("Novo Status -> TV ligada ? " + SmartTV.ligada);

    }
}
