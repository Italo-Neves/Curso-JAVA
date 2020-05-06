package aulaswitchex02;

import java.util.Scanner;

public class AulaSwitchEx02 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int op;
        int calc;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número ");
        n2 = input.nextInt();
        System.out.println("\n Digite qual operção você deseja reaizar"
                         + "\n '1' para somar "
                         + "\n '2' para subtrair"   
                         + "\n '3' para multiplicar "
                         + "\n '4' para dividir");
        op = input.nextInt();
        switch(op){
            case 1:
                calc = n1+n2;
                System.out.println("O valor de "+n1+" + "+n2+" = "+calc);
                break;
            case 2:
                calc = n1-n2;
                System.out.println("O valor de "+n1+" - "+n2+" = "+calc);
                break;
            case 3:
                calc = n1*n2;
                System.out.println("O valor de "+n1+" * "+n2+" = "+calc);
                break;
            case 4:
                calc = n1/n2;
                System.out.println("O valor de "+n1+" / "+n2+" = "+calc);
                break;
                        
        }
    }
    
}
