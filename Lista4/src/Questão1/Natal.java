package Questão1;

public class Natal extends CartaoWeb {
    String nome;
    public Natal(){}
    public Natal(String nome, String destinatario) {
        super(destinatario);
        this.nome = nome;
    }
    @Override
    public String retornarMensagem(String nome){
        this.nome = nome;
        return "Feliz Natal "+nome+"!\nQue este ano você receba muitos presentes e o principal "
                + "seja o amor e a união da sua família!\nCom amor, "+super.destinatario+"!\n";
    }
}
