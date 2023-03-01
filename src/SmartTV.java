public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;

    }

    public void aumentarCanal() {
        canal++;

    }

    public void dimunirCanal() {
        canal--;

    }

    public void aumentarVolume() {
        System.out.println("Aumentando o volume para : " + volume);
        volume++;
    }

    public void diminuirVolume() {
        System.out.println("diminuir o volume para : " + volume);
        volume--;
    }

    public void ligada() {
        ligada = true;
    }

    public void delisgar() {
        ligada = false;
    }
}
