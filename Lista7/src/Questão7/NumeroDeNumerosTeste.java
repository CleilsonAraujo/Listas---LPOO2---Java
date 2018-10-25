package Questão7;

import java.util.Scanner;

public class NumeroDeNumerosTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = leia.nextInt();
        System.out.println("Digite um numero para que seja verificado a quantidade desse numero no numero anterior");
        int m = leia.nextInt();
        NumeroDeNumeros num = new NumeroDeNumeros();
        System.out.println(num.numerodenumeros(n, m)+" numeros "+m);
    }
}
