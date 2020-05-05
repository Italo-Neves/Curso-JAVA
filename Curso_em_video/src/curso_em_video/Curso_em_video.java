package curso_em_video;
import java.util.Scanner;
public class Curso_em_video {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();//nextLine serve para ler strings, cada tipo primitivo possui next diferente
        System.out.println("Digite a nota do aluno");
        float nota =teclado.nextFloat();
        System.out.printf("%s Sua nota é %.1f\n",nome,nota);//o format pode substituir o printf
    }
    
}
