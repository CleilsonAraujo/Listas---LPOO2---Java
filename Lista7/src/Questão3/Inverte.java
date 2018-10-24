package Questão3;

public class Inverte {
    
    /*public int invertecalc(int n, int m){
        if(n == 0){
            return invertcalc2(m);
        }else{
            return invertecalc(n/10, n%10);
        }
    }
    public int inverte(int n){
        return invertecalc(n/10, n%10);
    }
    public int invertecalc2(m){
        
    }*/
    int x;
    public int inverte(int n){
        if(n == 0){
            return this.x;
        }else{
            this.x = x*10;
            this.x = x+(n%10);
            return inverte(n/10);
        }
    }
}
