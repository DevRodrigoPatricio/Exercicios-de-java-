package atv3;

import javax.swing.*;

public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr(){
        this.termostato = new Termostato(20);
        this.ligado = false;
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public boolean getLigado() {
        return ligado;
    }

    public boolean ligar(){

        ligado = true;
        return ligado;
    }

    public boolean desligar(){

        ligado = false;
        return ligado;
    }

    public int aumentarTemperatura(){

        int temperatura = termostato.getTemperatura();

        if (ligado == false){
            JOptionPane.showMessageDialog(null, "O condicionador está desligado!","Atenção!",0);
            return 0;

        }else{

            if (temperatura < 28) {
                termostato.setTemperatura(++temperatura);
            }else{
                JOptionPane.showMessageDialog(null, "Temperatura máxima atingida!","Atenção!",0);
            }
            return temperatura;
        }
    }

    public int reduzirTemperatura(){

        int temperatura = termostato.getTemperatura();

        if (ligado == false){
            JOptionPane.showMessageDialog(null, "O condicionador esta desligado!","Atenção!",0);
            return 0;

        }else{

            if (temperatura > 15) {
                termostato.setTemperatura(--temperatura);
            }else{
                JOptionPane.showMessageDialog(null, "Temperatura mínima atingida!","Atenção!",0);
            }
            return temperatura;
        }
    }

    @Override
    public String toString() {

        int temperatura = termostato.getTemperatura();
        return "TEMPERATURA ATUAL: " + temperatura + "°C";
    }
}
