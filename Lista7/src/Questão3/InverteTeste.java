package Questão3;

import java.util.Scanner;

public class InverteTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero que deseja inverter");
        int n = leia.nextInt();
        Inverte inv = new Inverte();
        System.out.println(inv.inverte(n));
    }
}
