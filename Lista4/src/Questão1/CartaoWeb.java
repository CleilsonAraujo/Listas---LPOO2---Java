package Questão1;

public abstract class CartaoWeb {
    String destinatario;
    public CartaoWeb(){}
    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public abstract String retornarMensagem(String remetente);
}
