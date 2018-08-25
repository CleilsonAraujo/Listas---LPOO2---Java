package Questão2345;
import javax.swing.JOptionPane;

public class VendedorTeste {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        String altura = JOptionPane.showInputDialog("Digite sua altura");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo");
        String salario = JOptionPane.showInputDialog("Digite o valor do seu salario");
        String valorVendas = JOptionPane.showInputDialog("Digite o valor de suas vendas");
        String comissao = JOptionPane.showInputDialog("Digite a porcentagem(em numeros apenas) de sua comissao");
        Pessoa pes = new Pessoa(); Empregado emp = new Empregado(); Vendedor ven = new Vendedor();
        int idade1 = Integer.parseInt(idade);double altura1 = Double.parseDouble(altura);
        double salario1 = Double.parseDouble(salario);double valorVendas1 = Double.parseDouble(valorVendas);
        double comissao1 = Double.parseDouble(comissao);
        emp.setSalario(salario1);pes.setNome(nome);pes.setIdade(idade1);ven.setComissao(comissao1);
        pes.setSexo(sexo);pes.setAltura(altura1);ven.setValorVendas(valorVendas1);
        ven.obterLucros1();
        JOptionPane.showMessageDialog(null, "Seu nome: "+nome+"\nSua idade: "+idade1+"\nSua altura: "+altura1+"\nSeu sexo: "+sexo+ven.obterLucros());
    }
}
