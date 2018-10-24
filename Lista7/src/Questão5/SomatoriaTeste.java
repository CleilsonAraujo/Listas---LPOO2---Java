package Questão5;

import java.util.Scanner;

public class SomatoriaTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero para fazer a soma de 1 até ele");
        int n = leia.nextInt();
        Somatoria soma = new Somatoria();
        System.out.println(soma.somatoria(n));
    }
}
