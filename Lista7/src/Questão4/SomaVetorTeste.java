package Questão4;

import java.util.Scanner;

public class SomaVetorTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("qual o tamanho do vetor?");
        int n = leia.nextInt();
        int a[] = new int[n];
        System.out.println("atribua os valores ao vetor!");
        for(int i=0; i < n; i++){
            int n2 = leia.nextInt();
            a[i] = n2;
        }
        SomaVetor soma = new SomaVetor();
        System.out.println(soma.soma(a, n-1));
    }
}
