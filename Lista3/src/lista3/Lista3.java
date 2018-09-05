package lista3;
import javax.swing.JOptionPane;

public class Lista3 {

    public static void main(String[] args) {
        DispositivoDeTelefone disp = new DispositivoDeTelefone();
        TelefoneCelular cel = new TelefoneCelular();
        TelefoneResidencial res = new TelefoneResidencial();
        String cor = JOptionPane.showInputDialog("Qual a cor do aparelho?");
        String formato = JOptionPane.showInputDialog("Qual o formato do aparelho?");
        disp.setCor(cor);disp.setFormato(formato);
        Object[] opçaotel = {"celular","residencial"};
        Object resposta = JOptionPane.showInputDialog(null,"Qual seu dispositivo?","Aparelho",JOptionPane.QUESTION_MESSAGE,null,opçaotel,"celular");
        if (resposta.equals("celular")){
            String duracaobateria = JOptionPane.showInputDialog("Qual a duração da bateria em horas?");
            String frequenciatransmissao = JOptionPane.showInputDialog("Qual a frequência de transmissão em Hz?");
            int duracaobateria1 = Integer.parseInt(duracaobateria);
            int frequenciatransmissao1 = Integer.parseInt(frequenciatransmissao);
            cel.setDuracaobateria(duracaobateria1);cel.setFrequenciatransmissao(frequenciatransmissao1);
            Object[] opçaocel = {"sim","não"};
            Object resposta1 = JOptionPane.showInputDialog(null,"Possui touchscreen?","Touch",JOptionPane.QUESTION_MESSAGE,null,opçaocel,"sim");
            if (resposta1.equals("sim")){
                cel.setTouchscreen(true);
            }else{
                cel.setTouchscreen(false);
            }
            Object resposta2 = JOptionPane.showInputDialog(null,"Possui reprodutor de áudio?","Áudio",JOptionPane.QUESTION_MESSAGE,null,opçaocel,"sim");
            if (resposta2.equals("sim")){
                cel.setReprodutoraudio(true);
            }else{
                cel.setReprodutoraudio(false);
            }
            Object resposta3 = JOptionPane.showInputDialog(null,"Possui rádio?","Rádio",JOptionPane.QUESTION_MESSAGE,null,opçaocel,"sim");
            if (resposta3.equals("sim")){
                cel.setRadio(true);
            }else{
                cel.setRadio(false);
            }
            JOptionPane.showMessageDialog(null, "Seu aparalho foi registrado como:\ncor: "+cor+"\nformato: "+formato+"\nbateria: "+cel.duracaobateria+"H\nfrequencia de transmissão: "+cel.frequenciatransmissao+"Hz\ntouchscreen: "+cel.touchscreen+"\nreprodutor de audio: "+cel.reprodutoraudio+"\nradio: "+cel.radio);
        }else{
            String comprimentocabo = JOptionPane.showInputDialog("Qual o comprimento do cabo em metros?");
            double comprimentocabo1 = Double.parseDouble(comprimentocabo);
            res.setComprimentocabo(comprimentocabo1);
            Object[] opçaores = {"sim","não"};
            Object resposta4 = JOptionPane.showInputDialog(null,"Possui fixamento na parede?","Parede",JOptionPane.QUESTION_MESSAGE,null,opçaores,"sim");
            if (resposta4.equals("sim")){
                res.setFixaparede(true);
            }else{
                res.setFixaparede(false);
            }
            JOptionPane.showMessageDialog(null, "Seu aparalho foi registrado como:\ncor: "+cor+"\nformato: "+formato+"\ncomprimento do cabo: "+res.comprimentocabo+"M\nfixação na parede: "+res.fixaparede);
        }
    }
    
}
