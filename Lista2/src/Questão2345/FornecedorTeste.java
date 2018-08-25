package Questão2345;
import javax.swing.JOptionPane;

public class FornecedorTeste {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        String altura = JOptionPane.showInputDialog("Digite sua altura");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo");
        String creditoMaximo = JOptionPane.showInputDialog("Digite o credito maximo atribuido ao fornecedor");
        String valorEmDivida = JOptionPane.showInputDialog("Digite o valor de divida com o fornecedor");
        Pessoa pes = new Pessoa(); Fornecedor forn = new Fornecedor();
        int idade1 = Integer.parseInt(idade);double altura1 = Double.parseDouble(altura);
        double creditoMaximo1 = Double.parseDouble(creditoMaximo);
        double valorEmDivida1 = Double.parseDouble(valorEmDivida);
        forn.setCreditoMaximo(creditoMaximo1);pes.setNome(nome);pes.setIdade(idade1);
        pes.setSexo(sexo);pes.setAltura(altura1);forn.setValorEmDivida(valorEmDivida1);
        forn.obterSaldo();
        JOptionPane.showMessageDialog(null, "Seu nome: "+nome+"\nSua idade: "+idade1+"\nSua altura: "+altura1+"\nSeu sexo: "+sexo+forn.obterSaldo1());
    }
}
