
package ex06;
import java.util.Random;

public class GeraArray {

    public static void gerarRandom(){
        Random r = new Random();
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        for( int c = 0; c < array.length; c++){
          array[c] = r.nextInt(100);
        }  
         for (int i = 0; i < array.length; i++) {
            System.out.println("Indice " + i + " = " + array[i]);
        }
        
    }
    
}
