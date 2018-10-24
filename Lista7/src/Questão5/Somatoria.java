package Questão5;

public class Somatoria {
    int soma=1;
    public int somatoria(int n){
        if(n == 1){
            return soma;
        }else{
            soma = soma+n;
            return somatoria(n-1);
        }
    }
}
