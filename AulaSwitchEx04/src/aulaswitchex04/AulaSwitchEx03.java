package aulaswitchex04;

import java.util.Scanner;
/*
11	Rondônia	RO
12	Acre            AC
13	Amazonas	AM
14	Roraima         RR
15	Pará            PA
16	Amapá           AP
17	Tocantins	TO
21	Maranhão	MA
22	Piauí           PI
23	Ceará           CE
24	Rio Grande do Norte	RN
25	Paraíba	PB
26	Pernambuco	PE
27	Alagoas         AL
28	Sergipe         SE
29	Bahia           BA
31	Minas Gerais	MG
32	Espírito Santo	ES
33	Rio de Janeiro	RJ
35	São Paulo	SP
41	Paraná          PR
42	Santa Catarina	SC
43	Rio Grande do Sul	RS
50	Mato Grosso do Sul	MS
51	Mato Grosso             MT
52	Goiás                   GO
53	Distrito Federal	DF
*/
public class AulaSwitchEx03 {
    public static void main(String[] args) {
        int uf;
        Scanner input = new Scanner(System.in);
        System.out.println("Lista de Estados ");
        System.out.println("\n"
          + "11 -> RO\n" +
            "12 -> AC\n" +
            "13 -> AM\n" +
            "14 -> RR\n" +
            "15 -> PA\n" +
            "16 -> AP\n" +
            "17 -> TO\n" +
            "21 -> MA\n" +
            "22 -> PI\n" +
            "23 -> CE\n" +
            "24 -> RN\n" +
            "25 -> PB\n" +
            "26 -> PE\n" +
            "27 -> AL\n" +
            "28 -> SE\n" +
            "29 -> BA\n" +
            "31 -> MG\n" +
            "32 -> ES\n" +
            "33 -> RJ\n" +
            "35 -> SP\n" +
            "41 -> PR\n" +
            "42 -> SC\n" +
            "43 -> RS\n" +
            "50 -> MS\n" +
            "51 -> MT\n" +
            "52 -> GO\n" +
            "53 -> DF\n\n"
                + "Em qual estado você mora? ");
        uf = input.nextInt();
        switch(uf){
            case 11:
                System.out.println("Você mora em Rôndonia ");
                break;
            case 12:
                System.out.println("Você mora no Acre ");
                break;
            case 13:
                System.out.println("Você mora no Amazonas ");
                break;
            case 14:
                System.out.println("Você mora no Roraima ");
                break;
            case 15:
                System.out.println("Você mora no Pará ");
                break;
            case 16:
                System.out.println("Você mora no Amapá ");
                break;
            case 17:
                System.out.println("Você mora em Tocantins ");
                break;
            case 21:
                System.out.println("Você mora no Maranhão ");
                break;
            case 22:
                System.out.println("Você mora no Piauí ");
                break;
            case 23:
                System.out.println("Você mora no Ceará ");
                break;
            case 24:
                System.out.println("Você mora no Rio Grande do Norte ");
                break;
            case 25:
                System.out.println("Você mora na Paraíba");
                break;
            case 26:
                System.out.println("Você mora no Pernambuco");
                break;
            case 27:
                System.out.println("Você mora em Alagoas ");
                break;
            case 28:
                System.out.println("Você mora em Sergipe ");
                break;
            case 29:
                System.out.println("Você mora na Bahia ");
                break;
            case 31:
                System.out.println("Você mora em Minas Gerais ");
                break;
            case 32:
                System.out.println("Você mora em Espirito Santo ");
                break;
            case 33:
                System.out.println("Você mora no Rio de Janeiro ");
                break;
            case 35:
                System.out.println("Você mora em São Paulo ");
                break;
            case 41:
                System.out.println("Você mora no Paraná ");
                break;
            case 42:
                System.out.println("Você mora em Santa Catarina ");
                break;
            case 43:
                System.out.println("Você mora no Rio Grande do Sul ");
                break;
            case 50:
                System.out.println("Você mora no Mato Grosso do sul ");
                break;
            case 51:
                System.out.println("Você mora no mato Grosso ");
                break;
            case 52:
                System.out.println("Você mora no Goiás ");
                break;
            case 53:
                System.out.println("Você mora no Distrito Federal ");
                break;
            
            default:
                    System.out.println("Estado Inexistente!");
            
        }
    }
    
}
