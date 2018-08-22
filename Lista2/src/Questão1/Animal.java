package Questão1;

public class Animal {
    String tipo, cor;
    public Animal(){}
    public Animal(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "tipo = " + tipo + "\ncor = " + cor;
    }
    
}
