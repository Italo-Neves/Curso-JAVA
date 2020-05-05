package contador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
       /*
        
        int cc = 1;
        while(cc<=4) {
            System.out.println(cc+"º Cambalhota");//o continue pode modficar fluxo da repetição fazendo o laço voltar para a condição
            cc++;
        }
    */
    int n, s=0;
    String resp;
    Scanner teclado = new Scanner(System.in);
    do {
        System.out.println("Digite  um número");
        n = teclado.nextInt();
        s +=n;
        System.out.println("Deseja continuar?[s/n]");
        resp = teclado.next();
    } while(resp.equals("s"));
        System.out.println("A soma de todos os valores é: "+s);
   }
}