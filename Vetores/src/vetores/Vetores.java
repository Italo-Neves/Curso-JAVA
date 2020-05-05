
package vetores;
public class Vetores {
    public static void main(String[] args) {
        
        /*
        int n[] = {3,2,8,7,5,4};
        System.out.println("Total de casas de N"+n.length);// length mostra o indice dos vetores
        for (int c =0;c<=n.length-1;c++) {
            System.out.println("na posição "+c+" Encontramos o valoe "+n[c]+" ");
        }*/
    String mes[]={"Jan","Fev","Mar","Abr","Mai"
            ,"Jun","Jul","Ago","Set","Out","Nov","Dez"};
            int tot[]={31,28,31,30,31,30,31,31,30,31,30,31};
            for (int c= 0;c<mes.length;c++) {
                System.out.println("O mês de "+mes[c] +" tem "+tot[c]+" dias ao todo.");
            }
    
    
    
    }
    
}
