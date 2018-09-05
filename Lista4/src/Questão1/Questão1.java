package Questão1;
import javax.swing.JOptionPane;

public class Questão1 {

    public static void main(String[] args) {
        int verif1 = 0;
        do{
        String nome = JOptionPane.showInputDialog("Digite o nome do destinatario");
        String remetente = JOptionPane.showInputDialog("Digite o nome do remetente");
        Aniversario ani = new Aniversario(nome, remetente);
        DiaDosNamorados ddm = new DiaDosNamorados(nome, remetente);
        Natal nat = new Natal(nome, remetente);
        CartaoWeb[] arr = {ani, ddm, nat};
        JOptionPane.showMessageDialog(null, ani.retornarMensagem(nome));
        JOptionPane.showMessageDialog(null, ddm.retornarMensagem(nome));
        JOptionPane.showMessageDialog(null, nat.retornarMensagem(nome));
        String verif = JOptionPane.showInputDialog("Digite 1 para informar dados\nDigite 2 para parar");
        verif1 = Integer.parseInt(verif);
        }while(verif1 != 2);
    }
    
}
