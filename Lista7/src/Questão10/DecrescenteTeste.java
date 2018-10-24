package Questão10;

import java.util.Scanner;

public class DecrescenteTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero positivo para ser mostrado os numeros dele até 0 em ordem decrescente");
        int n = leia.nextInt();
        Decrescente decres = new Decrescente();
        System.out.println(decres.decrescente(n));
    }
}
