
package vetores;
public class Vetores {
    public static void main(String[] args) {
      //O cochete pode ser posicionado na frente ou atraz do nome do vetor
      
      
        int n[] = {3,2,8,7,4,5};// declarando o vetor com valores predefinidos
        //int n2[] = new int [4]; //declarando um vetor vazio de 4 posições
        System.out.println("Total da casas de N "+n.length);
        for(int c=0; c<=n.length-1; c++){
            System.out.println("Na posição "+c+" temos o valor:"+n[c]);//mostra n na posição c
        }
    }
    
}
