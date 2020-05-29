
package exmplomatriz;
public class ExmploMatriz {
    public static void main(String[] args) {
        int [][] numerosAleatorios = new int [2][2]; // matriz 2x2

        for (int i=0; i<numerosAleatorios.length; i++){ // percorre as linhas
            for (int j=0; j<numerosAleatorios[i].length; j++ ){ // percorre as colunas
                System.out.print("posição [" + i + "," + j + "] "); // exibe a posição específica do vetor
            }
            System.out.println();
    }
    
}
}