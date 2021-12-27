package atv3;

public class Termostato {
    private int temperatura;

    public Termostato(int temperatura) {

        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        return temperatura;
    }
}