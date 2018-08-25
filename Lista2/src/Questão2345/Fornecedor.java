package Questão2345;

public class Fornecedor extends Pessoa {
    double creditoMaximo, valorEmDivida;
    public Fornecedor(){}
    public Fornecedor(double creditoMaximo, double valorEmDivida, String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.creditoMaximo = creditoMaximo;
        this.valorEmDivida = valorEmDivida;
    }
    public double getCreditoMaximo() {
        return creditoMaximo;
    }
    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }
    public double getValorEmDivida() {
        return valorEmDivida;
    }
    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }
    double saldo;
    public void obterSaldo(){
        this.saldo = creditoMaximo-valorEmDivida;
    }
    public String obterSaldo1(){
        return "\nSeu saldo: "+saldo;
    }
}
