
package vetor04;

import java.util.Arrays;

public class Vetor04 {

 
    public static void main(String[] args) {
      int vet[] ={3,7,6,1,9,4,2};
      for(int v: vet){
          System.out.println(v +" ");
      }
      
      int p = Arrays.binarySearch(vet,1);
        System.out.println("Encontei o valor na posição: "+p);//como não se exite indice negativo todo elemento que não for encontrado no vetor será negativado
    }
    
}
