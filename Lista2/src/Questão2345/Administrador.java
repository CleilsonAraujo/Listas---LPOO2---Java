package Questão2345;

public class Administrador extends Empregado {
    double ajudasDeCusto;
    public Administrador(double salario, String nome, int idade, double altura, char sexo, double lucro) {
        super(salario, nome, idade, altura, sexo, lucro);
    }
    public double getAjudasDeCusto() {
        return ajudasDeCusto;
    }
    public void setAjudasDeCusto(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }
    @Override
    public void obterLucros() {
        super.lucro = lucro+ajudasDeCusto;
    }
}
