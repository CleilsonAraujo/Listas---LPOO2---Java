package Questão2;

import java.util.Scanner;

public class FibonacciTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero da posição de Fibonacci que deseja retornar");
        int n = leia.nextInt();
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacci(n));
    }
}
