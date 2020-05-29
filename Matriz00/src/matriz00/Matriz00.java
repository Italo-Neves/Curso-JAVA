/* Vetores bidimenssionais/Matrizes
 
*Vetores
    int numeros[3];
    numeros[0] = 3;
    numeros[0] = 2;
    numeros[0] = 5;

*Matriz
[linhas][colunas]
int numeros[3][3]

numeros[0][0] = 1;
numeros[0][1] = 2;
numeros[0][2] = 4;
numeros[1][0] = 7;
numeros[1][2] = 5;
numeros[2][0] = 3;
numeros[2][1] = 6;
numeros[2][2] = 8;
 */
package matriz00;

public class Matriz00 {
    public static void main(String[] args) {
        //Declaração
        int numeros [][];
        //Declaração e definindo tamanhos
        int numeros2[][] = new int[3][3];
        //Declara, definir o tamanho e inicializar
        int mais_numeros[][] = {{1,2,3},{4,5,6},{7,8,9}};
        //Declara um a matriz informando somente linhas
        int matriz[][] = new int[2][]; // pode-se informar a quantidade de colunas posteriomente.
        int nova_matriz[][] = {{1,2},{3,45,5,7,6},{5,6,9}};
//--------------------------------------------------------------------------------------------------------------------------------------
        numeros2[0][0] = 1;
        numeros2[0][1] = 2;
        numeros2[0][2] = 6;
        numeros2[1][0] = 8;
        numeros2[1][1] = 7;
        numeros2[1][2] = 4;
        numeros2[2][0] = 9;
        numeros2[2][1] = 3;
        numeros2[2][2] = 0;
        
        System.out.println(numeros2[1][2]);//imprimindo um elemento da matriz
        
        
        // A quantidade de linhas podem ser diferentes da
        // quantidade de colunas por isso colocamos [i].length
        for(int i =0;i < numeros2.length;i++){
            for(int j =0;j < numeros2[i].length;j++){       
                numeros2[i][j] = i + j *2;//preenchendo uma matriz
            }
        }
        //escrevendo os valores
         for(int i =0;i < numeros2.length;i++){
            for(int j =0;j < numeros2[i].length;j++){    
                System.out.println("Numeros ["+i+"]"+"["+j+"]"+" = "+ numeros2[i][j]);     
                
            }
        }
        
        




    }
    
}
