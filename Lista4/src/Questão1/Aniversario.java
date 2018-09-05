package Questão1;

public class Aniversario extends CartaoWeb {
    String nome;
    public Aniversario(){}
    public Aniversario(String nome, String destinatario) {
        super(destinatario);
        this.nome = nome;
    }
    @Override
    public String retornarMensagem(String nome){
        this.nome = nome;
        return "Felicitações "+nome+"! Que seu dia seja completo de paz, amor e felicidade.\n" +
                "Não esqueça de sorrir, pois sua alegria é contagiante.\n" +
                "Parabéns e Felicidades!\nCom carinho "+super.destinatario+"!\n";
    }
}
