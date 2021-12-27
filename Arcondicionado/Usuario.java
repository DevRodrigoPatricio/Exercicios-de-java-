package atv3;

import javax.swing.*;

public class Usuario {
    public static void main(String[] args) {
        int menu=0;
        String n;
        CondicionadorDeAr condicionador = new CondicionadorDeAr();
        Termostato termostato = new Termostato(20);
        int temperatura = termostato.getTemperatura();

        do{

            boolean ligado = condicionador.getLigado();
            if(ligado == false){

                n = "OFF";
            }else{
                n = "ON";
            }

            Object[] options = { "Aumentar temperatura", "Diminuir temperatura", "Ligar", "Desligar", "Encerrar Programa"};

            int op_index = JOptionPane.showOptionDialog(null, "STATUS CONDICIONADOR DE AR: " + n + "  |   "
                    + condicionador.toString() + "\nO que deseja fazer?", "Informe a opção desejada",
                    0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (op_index == 0){

                condicionador.aumentarTemperatura();

                menu = 1;
            }

            if (op_index == 1){

                condicionador.reduzirTemperatura();

                menu = 1;

            }

            if (op_index == 2){

                boolean lig = condicionador.getLigado();
                if(lig == false){

                    condicionador.ligar();
                    JOptionPane.showMessageDialog(null, "Condicionador de ar ligado com sucesso!", "Atenção!",2);

                }else{

                    JOptionPane.showMessageDialog(null, "O condicionador já está ligado!", "Atenção!",0);
                }

                menu = 1;
            }

            if(op_index == 3){

                boolean lig = condicionador.getLigado();
                if(lig == false){

                    JOptionPane.showMessageDialog(null, "O condicionador já está desligado!", "Atenção!",0);

                }else{

                    condicionador.desligar();
                    JOptionPane.showMessageDialog(null, "Condicionador de ar desligado com sucesso!", "Atenção!",2);
                }

                int op = JOptionPane.showConfirmDialog(null, "Deseja voltar ao menu?", "Voltar ao início?", JOptionPane.YES_NO_OPTION);
                if (op == JOptionPane.YES_OPTION){
                    menu = 1;
                }else {
                    menu = 0;
                }

            }

            if (op_index == 4){

                System.exit(0);
            }


        } while(menu == 1);
    }

}
