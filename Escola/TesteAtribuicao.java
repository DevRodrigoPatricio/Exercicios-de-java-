package atv1;

import javax.swing.*;

public class TesteAtribuicao {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome do professor?");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do professor ?"));
        String nomedisciplina = JOptionPane.showInputDialog("Nome da disciplina?");
        boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("É pratica ?true/false"));
        Professor professor = new Professor(nome , idade);
        Disciplina disciplina = new Disciplina(nomedisciplina , pratica);
        Atribuicao atribuicao = new Atribuicao(professor,disciplina);
        JOptionPane.showMessageDialog(null,atribuicao.toString());
    }
}
