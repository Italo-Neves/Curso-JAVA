
package testefuncao;
public class TesteFuncao {
    /*
    //método sem retorno    
    public static void soma(int a,int b){
    int s = a +b;
        System.out.println("A soma é "+s);
    }
    */
    
    //método com retorno
    static int  soma(int a,int b){
    int s = a +b;
    return s;
    }
    public static void main(String[] args) {
        System.out.println("o programa começou ");
        int sm = soma(5,4);
    }
    
}
