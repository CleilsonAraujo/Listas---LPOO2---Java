package Questão8;

import java.util.Scanner;

public class MultSomaTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite 2 numeros para a multiplicação");
        int n = leia.nextInt();
        int m = leia.nextInt();
        MultSoma mult = new MultSoma();
        System.out.println(mult.Multip_Rec(n, m));
    }
}
