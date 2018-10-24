package Questão9;

public class Crescente {
    public int crescente(int n, int m){
        if(m == 0){
            return n;
        }else{
            System.out.println(n);
            return crescente(n+1, m-1);
        }
    }
}
