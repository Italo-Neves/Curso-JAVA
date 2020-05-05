
package vetor02;

import java.util.Arrays;

public class Vetor02 {
    public static void main(String[] args) {
        /*
        double v[] ={3.5,2.75,9,-4.5};
        Arrays.sort(v);// sort serve para deixar o vetor em ordem
        for (double valor: v) {
            System.out.print(valor + " ");
        
        //Busca Binaria:
        
        int vet[]= {3,7,6,1,9,4,2};
        for (int v: vet) {
            System.out.println(v+" ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet,1);
        System.out.print("Encontrei o valor na posição "+p);
         */
        int v[] = new int[20];
        Arrays.fill(v, 0);//preenche todos os indices do vetor com o valor do segundo parametro
        for(int valor: v) {
            System.out.print(valor+" ");
        }
    
    
    }
  }

