
package matrizex04;

import java.util.Scanner;

public class MatrizEx04 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        // percorre a matriz para setar os valores
        for(int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
                System.out.print("Entre com o valor da posição [" + i + "," + j + "] : ");
                numeros[i][j] = scan.nextInt();
            }
        }

        int qtdPares = 0;
        int qtdImpares = 0;

        // percorre a matriz para exibir e verificar os valores
        for(int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++) {

                System.out.print(numeros[i][j] + " "); //exibe a matriz

                if(numeros[i][j] % 2 == 0){
                    qtdPares ++;
                }else {
                    qtdImpares ++;
                }
            }
            System.out.println();
        }

        System.out.println("Quantidade de números pares: "+ qtdPares);
        System.out.println("Quantidade de números ímpares: "+ qtdImpares);
    }
    
}
