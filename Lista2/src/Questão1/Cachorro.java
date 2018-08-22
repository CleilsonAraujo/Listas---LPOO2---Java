package Questão1;

public class Cachorro extends Animal {
    String nome, raça;
    public Cachorro(String nome, String raça, String tipo, String cor) {
        super(tipo, cor);
        this.nome = nome;
        this.raça = raça;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaça() {
        return raça;
    }
    public void setRaça(String raça) {
        this.raça = raça;
    }
    @Override
    public String toString() {
        return "nome = " + nome + "\nraça = " + raça;
    }
    
}
