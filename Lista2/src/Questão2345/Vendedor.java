package Questão2345;

public class Vendedor extends Empregado {
    double valorVendas, comissao;
    public Vendedor(){}
    public Vendedor(double salario, String nome, int idade, double altura, String sexo) {
        super(salario, nome, idade, altura, sexo);
    }
    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    @Override
    public String obterLucros() {
        return "\nSeu salario: "+soma;
    }
    double soma, porcem;
    public void obterLucros1(){
        this.porcem = (valorVendas*comissao)/100;
        this.soma = super.salario+porcem;
    }
}
