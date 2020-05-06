package aulaswitchex03;

import java.util.Scanner;

public class AulaSwitchEx03 {
    public static void main(String[] args) {
        int n;
        int ip;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        n = input.nextInt();
        
        if(n % 2 ==0){
            ip = 0;
        }else{
            ip = 1;
        }
        
        switch(ip){
            case 0:
                System.out.println("Par");
                break;
            case 1:
                System.out.println("Impar");
                break;
        }
    }
    
}
