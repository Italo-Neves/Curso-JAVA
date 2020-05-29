import java.util.Random;

public class ex1 {
    public static void main(String[] args) {

        int [][] numerosAleatorios = new int [4][4];

        Random numeroRandom = new Random(); // classe para gerar números aleatórios

        //For para setar os valores
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++ ){
                numerosAleatorios[i][j] = numeroRandom.nextInt(9); //seta um número aleatório entre 0-9
            }
        }

        int maior = 0;
        int linha = 0;
        int col = 0;

        //For para verificar os valores e identificar o maior
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++ ){
                if (numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }

        /* For para exibir os valores
           Exemplo de for encadeado com matriz */
        for (int[] numerosAleatorio : numerosAleatorios) {
            for (int i : numerosAleatorio) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha); // lembre que a contagem começa do zero
        System.out.println("Coluna = " + col);  // lembre que a contagem começa do zero
    }
}
