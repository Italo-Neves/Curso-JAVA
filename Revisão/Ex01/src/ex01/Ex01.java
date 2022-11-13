package ex01;

import java.util.Scanner;
public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String your_sex;
        int age;
        String name;
        String status;
        
        System.out.print("Digite o seu nome: ");
        name = input.nextLine();
        
        System.out.print("Digite sua data de nascimento: (dd/mm/yyyy)");
        String dta_nasc = input.nextLine();
        
        System.out.print("Digite o seu sexo (M/F): ");
        char sex = input.next().charAt(0);
        
        age = Utils.calculaIdade(dta_nasc,"ddMMyyyy");
        
        your_sex = switch (sex) {
            case 'M', 'm' -> "Masculino";
            case 'F', 'f' -> "Feminino";
            default -> "Indefinido";
        };
        
        if(age >= 18){
           status = "Maior de idade";
        }else{
           status = "Menor de idade";
        }
        System.out.println("\n Nome: "+ name + 
                           "\n Idade: "+ age +
                           "\n Sexo: " + your_sex +
                           "\n Status: " +status);
     
    }
}
