package Questão10;

public class Decrescente {
    public int decrescente(int n){
        if(n == 0){
            return n;
        }else{
            System.out.println(n);
            return decrescente(n-1);
        }
    }
}
