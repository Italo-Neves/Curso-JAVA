
package vetor05;

import java.util.Arrays;

public class Vetor05 {
    public static void main(String[] args) {
    int v[] =new int[20];
    Arrays.fill(v, 0);//Metodo para preencher um vetor manualente, o primeiro parametro recebe o vetor e o segundo recebe o valor que sera preenchido em todos os espaços do vetor
    
    
    for(int valor: v){
        System.out.println(valor + " ");
    }
    }
    
}
