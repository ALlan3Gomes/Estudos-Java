import javax.swing.JOptionPane;

public class CaixaDialogo {

    public static void main(String[] args) {
        String nome;
        int resposta;

        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Olá " + nome + "!!");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Por favor, digite o seu nome novamente.");
        } else if (resposta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
        } else if (resposta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Janela fechada.");
        }
    }
}
