package Questão2345;
import javax.swing.JOptionPane;

public class EmpregadoTeste {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        String altura = JOptionPane.showInputDialog("Digite sua altura");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo");
        String salario = JOptionPane.showInputDialog("Digite o valor do seu salario");
        Pessoa pes = new Pessoa(); Empregado emp = new Empregado();
        int idade1 = Integer.parseInt(idade);double altura1 = Double.parseDouble(altura);
        double salario1 = Double.parseDouble(salario);
        emp.setSalario(salario1);pes.setNome(nome);pes.setIdade(idade1);
        pes.setSexo(sexo);pes.setAltura(altura1);
        JOptionPane.showMessageDialog(null, "Seu nome: "+nome+"\nSua idade: "+idade1+"\nSua altura: "+altura1+"\nSeu sexo: "+sexo+emp.obterLucros());
    }
}
