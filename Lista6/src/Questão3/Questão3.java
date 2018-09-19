package Questão3;
import javax.swing.JOptionPane;

public class Questão3 {
    
    public static void main(String[] args){
        int ar[] = new int[10];int cont = 0, cont2 = 0;
        for(int x=0;x<ar.length;x++){
            do{
                try{
                    do{
                        try{
                            cont = 0; cont2 = 0;
                            String posição = JOptionPane.showInputDialog(null, "Digite a posição no array (deve ser entre 0 e 9)");
                            int pos = Integer.parseInt(posição);
                            String numero = JOptionPane.showInputDialog(null, "Digite o numero que deseja colocar nessa posição");
                            int num = Integer.parseInt(numero);
                            ar[pos]=num;
                        }catch(ArrayIndexOutOfBoundsException e){
                            System.err.println(e);
                            cont2 = 1;
                            JOptionPane.showMessageDialog(null, "O número não corresponde aos padrões do array, tente novamente");
                        }
                    }while (cont2 == 1);
                }catch(NumberFormatException e){
                    System.err.println(e);
                    cont = 1;
                    JOptionPane.showMessageDialog(null, "Algum numero foi informado de forma errada, tente novamente");
                }
            }while(cont == 1);
        }
        JOptionPane.showMessageDialog(null, "Os numeros registrados (de acordo com a posição informada) foram:\n"+ar[0]+", "+ar[1]+", "+ar[2]+", "+ar[3]+", "+ar[4]+", "+ar[5]+", "+ar[6]+", "+ar[7]+", "+ar[8]+", "+ar[9]);
    }
}
