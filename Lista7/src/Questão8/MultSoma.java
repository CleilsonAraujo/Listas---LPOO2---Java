package Questão8;

public class MultSoma {
    int soma;
    public int Multip_Rec(int n, int m){
        if(m == 0){
            return this.soma;
        }else{
            this.soma = soma+n;
            return Multip_Rec(n, m-1);
        }
    }
}
