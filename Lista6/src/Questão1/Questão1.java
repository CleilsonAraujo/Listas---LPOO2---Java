package Questão1;

public class Questão1 {

    public static void main(String[] args) {
        try{
            int[]x=new int[10];
            for(int i=0;i<x.length;i++){
                x[i]=i;
            }//laço para preencher o array
            for(int i=0;i<=x.length;i++){
                System.out.println(x[i]);
            }//laço para mostrar o array
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
            System.out.println("o array só tem 10 posições e o segundo for está indo até 11");
        }
    }
    
}
