package Questão6;

import java.util.Scanner;

public class InverteVetorTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double a[] = new double[100];
        System.out.println("atribua 100 valores ao vetor!");
        for(int i=0; i < 100; i++){
            double n2 = leia.nextInt();
            a[i] = n2;
        }
        InverteVetor inv = new InverteVetor();
        System.out.println(inv.invertevetor(a, 0, 99));
    }
}
