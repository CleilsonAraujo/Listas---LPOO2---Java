package Questão1;

public class DiaDosNamorados extends CartaoWeb {
    String nome;
    public DiaDosNamorados(){}
    public DiaDosNamorados(String nome, String destinatario) {
        super(destinatario);
        this.nome = nome;
    }
    @Override
    public String retornarMensagem(String nome){
        this.nome = nome;
        return "Querida "+nome+",Feliz Dia dos Namorados!\nEspero que esse tenha "
                + "sido o único cartão do dia dos namorados que tenha recebido nessa data!\n"
                + "De todo meu coração, "+super.destinatario+"!\n";
    }
}
