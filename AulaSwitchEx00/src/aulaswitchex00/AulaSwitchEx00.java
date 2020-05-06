
package aulaswitchex00;

import java.util.Scanner;



public class AulaSwitchEx00 {

    public static void main(String[] args) {
        int npernas;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de pernas do ser vivo ");
        npernas = input.nextInt();
        switch(npernas){
            case 1: 
                System.out.println("Saci");
                break;
            case 2: 
                System.out.println("Bipede");
               break;
            case 3:
                System.out.println("Tripé");
                break;
            case 4:
                System.out.println("Quadrupede");
                break;
            case 6:
                System.out.println("Inseto");
                break;
            case 8:
                System.out.println("aranha");
                break;
            
            default:
                System.out.println("ET Varginha");
                 
             
        }
    }
    
}
