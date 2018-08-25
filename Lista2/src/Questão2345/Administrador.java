package Questão2345;

public class Administrador extends Empregado {
    double ajudasDeCusto;
    public Administrador(){}
    public Administrador(double salario, String nome, int idade, double altura, String sexo) {
        super(salario, nome, idade, altura, sexo);
    }
    public double getAjudasDeCusto() {
        return ajudasDeCusto;
    }
    public void setAjudasDeCusto(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }
    @Override
    public String obterLucros() {
        return "\nSeu salario: "+soma;
    }
    double soma;
    public void obterLucros1(){
        this.soma = super.salario-this.ajudasDeCusto;
    }
}
