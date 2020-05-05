package operadorternario;
public class OperadorTernario {
    public static void main(String[] args) {
       int n1,n2,r;
       n1 = 4;
       n2 = 8;
       r = (n1>n2)?0:1;
       /* se o n1 for maior que n2 o que esta depois da interrogação sera execultado,
       se n2 for maior que n1, o que está depois daos dois pontos sera execultado.
       */
       System.out.println(r);
       //Com strings
       String nome1 = "italo";
       String nome2 = "italo";
       String nome3 = new String("Italo");
       String res;
       res = (nome1.equals(nome3))?"igual":"Diferene";/*A vaiavel nome3 foi declarada como um objeto então apesar de
       ter o mesmo conteudo da variavel nome2 elas continuam sendo diferentes, então para verificar a igualdade do conteudo
       das variaveis utiliza-se a class equals da seguinte forma: "variavel".equals("objeto");*/
        System.out.println(res);
       
    }
    
}
