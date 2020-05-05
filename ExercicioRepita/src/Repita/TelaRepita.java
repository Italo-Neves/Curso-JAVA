package Repita;
import javax.swing.JOptionPane;
public class TelaRepita {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Olá mundo!");// Onde está escrito null é o espaço reservado apara o nome da janela.
        int s = 0, n,maior =0, par = 0,impar = 0,c = 0,media;
        
        do { 
           n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um número: <br><em>(O valor zero interrompe)</em></html>"));
           if(n>100) {
            maior++;
           }
           if(n%2== 0){
              par++;
           } else{
             impar++;  
           }
           s += n;
           c++;
          media = s/c;
        }while(n!=0);
        JOptionPane.showMessageDialog(null,"<html>Resultado Final <br><hr>"+
                  "<br>Somatorio vale: "+s
                + "<br>Total de valores: "+c
                + "<br>Total de Impáres: "+impar
                + "<br>Total de pares: "+par
                + "<br>Média: "+media
                + "</html>");
    }
    
}
