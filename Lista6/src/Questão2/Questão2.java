package Questão2;
import javax.swing.JOptionPane;

public class Questão2 {
    
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Digite números para serem somados até o máximo de 100\nQuando chegar a 100, a aplicação é encerrada!");
        boolean verificar = false; double soma = 0, cont = 0, media = 0;
        do{
            try{
                String num = JOptionPane.showInputDialog(null, "Digite um número");
                double num1 = Double.parseDouble(num);
                soma = soma+num1;
                if(soma < 100){
                    cont++;
                    media = soma/cont;
                    JOptionPane.showMessageDialog(null, "Valor somado atual: "+soma+"\nQuantidade de números somados: "+cont+"\nMédia do valor somado atual: "+media);
                    verificar = false;
                }else{
                    verificar = true;
                }
            }catch(NumberFormatException e){
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Apenas números são válidos nesse campo. Tente novamente!");
                verificar = false;
            }
        }while(verificar == false);
        JOptionPane.showMessageDialog(null, "Seu número chegou a 100");
    }
}
