package Questão4;

public class SomaVetor {
    int somatotal;
    public int soma(int a[], int cont){
        if(cont == -1){
            return somatotal;
        }else{
            this.somatotal = somatotal+a[cont];
            return soma(a, cont-1);
        }
    }
}
