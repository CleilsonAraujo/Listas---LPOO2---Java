package Questão6;

public class InverteVetor {
    double temp;
    public String invertevetor(double a[], int n, int m){
        if(n > m){
            return "Vetor invertido com sucesso";
        }else{
            temp = a[n];
            a[n] = a[m];
            a[m] = temp;
            return invertevetor(a, n+1, m-1);
        }
    }
}
