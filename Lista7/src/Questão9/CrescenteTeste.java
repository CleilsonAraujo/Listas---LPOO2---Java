package Questão9;

import java.util.Scanner;

public class CrescenteTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero positivo para ser mostrado os numeros de 0 até ele em ordem crescente");
        int n = leia.nextInt();
        Crescente cres = new Crescente();
        System.out.println(cres.crescente(0, n));
    }
}
