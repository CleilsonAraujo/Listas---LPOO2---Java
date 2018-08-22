package Questão2345;

public class Vendedor extends Empregado {
    double valorVendas, comissao;
    public Vendedor(double salario, String nome, int idade, double altura, char sexo, double lucro) {
        super(salario, nome, idade, altura, sexo, lucro);
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
    public void obterLucros() {
        super.lucro = comissao+salario;
    }
    
}
