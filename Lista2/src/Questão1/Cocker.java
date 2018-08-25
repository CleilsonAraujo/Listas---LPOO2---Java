package Questão1;

public class Cocker extends Cachorro {
    boolean tosa = false;
    public Cocker(){}
    public Cocker(String nome, String raça, String tipo, String cor) {
        super(nome, raça, tipo, cor);
    }
    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    public String precisaTosa(){
        return "\ntosa necessaria: "+tosa;
    }
}
