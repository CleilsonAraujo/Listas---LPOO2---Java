package Questão7;

public class NumeroDeNumeros {
    int cont;
    public int numerodenumeros(int n, int m){
        if(n == 0){
            return cont;
        }else{
            if(n%10 == m){
                cont++;
            }
            return numerodenumeros(n/10, m);
        }
    }
}