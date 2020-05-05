
package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
         float m = (n1+n2)/2;
         System.out.println("Sua média foi: "+m);
         if(m>6){
             System.out.println("A média do aluno é " + m + "e ele está aprovado");
         }else{
             System.out.println("A média do aluno é "+m+" e ele está REPROVADO!");
         }
         
    }
    
}
