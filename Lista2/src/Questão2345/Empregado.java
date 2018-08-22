package Questão2345;

public class Empregado extends Pessoa {
    double salario;
    double lucro;
    public Empregado(double salario, String nome, int idade, double altura, char sexo, double lucro) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
        this.lucro = lucro;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void obterLucros() {
        this.lucro = lucro+salario;
    }
}
