import javax.swing.JOptionPane;

public class UsandoVetores {

    public static void main(String[] args) {
        int numPessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pessoas deseja cadastrar?"));
        String[] cpfs = new String[numPessoas];
        String[] nomes = new String[numPessoas];
        int[] idades = new int[numPessoas];
        String[] estadosCivis = new String[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            cpfs[i] = JOptionPane.showInputDialog(null, "Digite o CPF da pessoa " + (i + 1) + ":");
            nomes[i] = JOptionPane.showInputDialog(null, "Digite o nome da pessoa " + (i + 1) + ":");
            String inputIdade = JOptionPane.showInputDialog(null, "Digite a idade de " + nomes[i] + ":");
            idades[i] = Integer.parseInt(inputIdade);
            estadosCivis[i] = JOptionPane.showInputDialog(null, "A pessoa " + nomes[i] + " é casada? (sim/não)").toLowerCase();
            while (!estadosCivis[i].equals("sim") && !estadosCivis[i].equals("não")) {
                estadosCivis[i] = JOptionPane.showInputDialog(null, "Por favor, responda 'sim' ou 'não'. A pessoa " + nomes[i] + " é casada?").toLowerCase();
            }
        }

        exibirFolhaInformacoes(cpfs, nomes, idades, estadosCivis);
        exibirMensagemHackeado();
    }

    public static void exibirFolhaInformacoes(String[] cpfs, String[] nomes, int[] idades, String[] estadosCivis) {
        StringBuilder mensagem = new StringBuilder("Folha de Informações:\n\n");
        for (int i = 0; i < cpfs.length; i++) {
            mensagem.append("CPF: ").append(cpfs[i]).append("\n");
            mensagem.append("Nome: ").append(nomes[i]).append("\n");
            mensagem.append("Idade: ").append(idades[i]).append(" anos\n");
            mensagem.append("Estado civil: ").append(estadosCivis[i].equals("sim") ? "Casado" : "Solteiro").append("\n\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString() + "Obrigado pelas suas informações pessoais.");
    }

    public static void exibirMensagemHackeado() {
        for (int i = 0; i < 4; i++) {
            JOptionPane.showMessageDialog(null, "VOCÊ FOI HACKEADO");
        }
    }
    
}
