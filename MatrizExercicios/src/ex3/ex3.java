import java.util.Random;

public class ex3 {
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

        int maiorC7 = 0;
        int menorC7 = 0;
        int coluna7 = 7;
        //percorre a coluna 7 da matriz
        for(int i=0; i<numerosAleatorios.length; i++){

            // seta os primeiros valores como padrões iniciais
            if(i==0){
                maiorC7 = numerosAleatorios[i][coluna7];
                menorC7 = numerosAleatorios[i][coluna7];
            }

            if(numerosAleatorios[i][coluna7] > maiorC7){
                maiorC7 = numerosAleatorios[i][coluna7];
            }
            if(numerosAleatorios[i][coluna7] < menorC7){
                menorC7 = numerosAleatorios[i][coluna7];
            }
        }

        System.out.println("\nMaior valor da coluna 7: "+maiorC7);
        System.out.println("Menor valor da coluna 7: "+menorC7);
    }
}
