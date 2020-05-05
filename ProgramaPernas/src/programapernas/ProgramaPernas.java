
package programapernas;

import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isto é um(a): ");
        /*O swicth não funciona com numeros reais e nem em intervalos, em caso de intervalo use "else if"*/
        
        switch (perna){
            case 1:
                tipo ="Saci";
                break;
            case 2:
                tipo="Bípede";
                break; //sem o break o 2 fica com o tripé ou seja a variavel vai pegar a ultima coisa antes do break
            case 3:
                tipo="Tripé";
                break;
            case 8:
                tipo="Aranha";
                break;
            default:
                tipo ="ET de Varginha";
 
        }
           System.out.println(tipo);
             
        
        }
            
        
    }
    

