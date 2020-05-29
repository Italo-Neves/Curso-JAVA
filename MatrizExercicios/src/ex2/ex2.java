package ex2;

import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        int [][] numerosAleatorios = new int [10][10];

        Random numeroRandom = new Random(); // classe para gerar números aleatórios

        //For para setar os valores
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++ ){
                numerosAleatorios[i][j] = numeroRandom.nextInt(9); //seta um número aleatório entre 0-9
            }
        }

        // For para exibir os valores
        for (int[] numerosAleatorio : numerosAleatorios) {
            for (int i : numerosAleatorio) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 0;
        int linh5 = 5;
        //percorre a linha 5 da matriz
        for(int i=0; i<numerosAleatorios[linh5].length; i++){

            // seta os primeiros valores como padrões iniciais
            if(i==0){
                maiorL5 = numerosAleatorios[linh5][i];
                menorL5 = numerosAleatorios[linh5][i];
            }

            if(numerosAleatorios[linh5][i] > maiorL5){
                maiorL5 = numerosAleatorios[linh5][i];
            }
            if(numerosAleatorios[linh5][i] < menorL5){
                menorL5 = numerosAleatorios[linh5][i];
            }
        }

        System.out.println("\nMaior valor da linha 5: "+maiorL5);
        System.out.println("Menor valor da linha 5: "+menorL5);
    }
}
