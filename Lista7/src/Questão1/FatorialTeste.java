package Questão1;

import java.util.Scanner;

public class FatorialTeste {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero para fazer seu calculo fatorial");
        int n = leia.nextInt();
        Fatorial fat = new Fatorial();
        System.out.println(fat.fatorial(n));
    }
    
}
