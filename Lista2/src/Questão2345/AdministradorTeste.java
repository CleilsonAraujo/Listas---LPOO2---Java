package Questão2345;
import javax.swing.JOptionPane;

public class AdministradorTeste {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        String altura = JOptionPane.showInputDialog("Digite sua altura");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo");
        String salario = JOptionPane.showInputDialog("Digite o valor do seu salario");
        String ajudasDeCusto = JOptionPane.showInputDialog("Digite o valor de suas ajudas de custo");
        Pessoa pes = new Pessoa(); Empregado emp = new Empregado(); Administrador adm = new Administrador();
        int idade1 = Integer.parseInt(idade);double altura1 = Double.parseDouble(altura);
        double salario1 = Double.parseDouble(salario);double ajudasdeCusto1 = Double.parseDouble(ajudasDeCusto);
        emp.setSalario(salario1);pes.setNome(nome);pes.setIdade(idade1);
        pes.setSexo(sexo);pes.setAltura(altura1);adm.setAjudasDeCusto(ajudasdeCusto1);
        adm.obterLucros1();
        JOptionPane.showMessageDialog(null, "Seu nome: "+nome+"\nSua idade: "+idade1+"\nSua altura: "+altura1+"\nSeu sexo: "+sexo+adm.obterLucros());
    }
}
