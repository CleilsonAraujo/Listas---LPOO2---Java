package cnh;
import javax.swing.JOptionPane;

public class CNH {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome!");
        String idade = JOptionPane.showInputDialog("Digite sua idade!");
        int idade2 = Integer.parseInt(idade);
        if (idade2 >= 18){
            JOptionPane.showMessageDialog(null, nome+" você já pode tirar a CNH!");
        }else{
            JOptionPane.showMessageDialog(null, nome+" você ainda não pode tirar a CNH, você tem apenas "+idade+" anos!");
        }
    }
    
}
