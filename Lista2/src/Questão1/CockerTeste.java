package Questão1;
import javax.swing.JOptionPane;

public class CockerTeste {

    public static void main(String[] args) {
        boolean tosado = true;
        String tipo = JOptionPane.showInputDialog("Qual o tipo de animal?");
        String cor = JOptionPane.showInputDialog("Qual a cor do animal?");
        String nome = JOptionPane.showInputDialog("Qual o nome do cachorro?");
        String raça = JOptionPane.showInputDialog("Qual a raça do cachorro?");
        Cachorro dog = new Cachorro(); Cocker cao = new Cocker(); Animal an = new Animal();
        dog.setNome(nome);dog.setRaça(raça);an.setTipo(tipo);an.setCor(cor);
        String tosa = JOptionPane.showInputDialog("O cachorro precisa de tosa?\ndigite 1 para sim");
        int tosa1 = Integer.parseInt(tosa);
        if (tosa1 == 1){
            cao.setTosa(tosado);
        }
        JOptionPane.showMessageDialog(null, an.toString()+dog.toString()+cao.precisaTosa());
    }
    
}
