
package ex04;

public class ForEach {
    
    public static void  Spell(String name){
        for (char letter: name.toCharArray()){
            System.out.println(letter);
        }
    }
}
