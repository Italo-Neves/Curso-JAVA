package aulaswichex01;

import java.util.Scanner;

/**
 *
 * @author keldor
 */
public class AulaSwichEx01 {

    public static void main(String[] args) {
        System.out.println("Que dia da semana é hoje? ");
        Scanner input = new Scanner(System.in);
        int dia = input.nextInt();
        switch(dia){
            case 2:
                System.out.println("Hoje é segunda-feira");
                break;
            case 3:
                System.out.println("Hoje é terça-feira");
                break;
            case 4:
                System.out.println("Hoje é quarta-feira");
                break;
            case 5:
                System.out.println("Hoje é quinta-feira");
                break;
            case 6:
                System.out.println("Hoje é sexta-feira");
                break;
            case 7:
                System.out.println("Hoje é sabado");
                break;
            case 1:
                System.out.println("Hoje é Domingo");
                break;
        
        }
        
    }
    
}
