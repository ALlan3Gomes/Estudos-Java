import javax.swing.JOptionPane;

public class UsandoJOptionPane {
    
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Meu primeiro programa grafico!!"
//        + "\n Obrigado, Java!!!");
           String nome;
           

           
           nome = JOptionPane.showInputDialog("Informe seu nome");
          
           JOptionPane.showConfirmDialog(null,"Ola," + nome + "\n Seja nem vindo(a)!!");
           
    }
    
}
