package lista3;

public class DispositivoDeTelefone {
    String cor, formato;
    public DispositivoDeTelefone(){}
    public DispositivoDeTelefone(String cor, String formato) {
        this.cor = cor;
        this.formato = formato;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    
}
