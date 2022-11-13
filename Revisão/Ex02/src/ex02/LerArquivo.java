package ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
        
    public static void leitor(String path) throws IOException {
        try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
            String linha = "";
            while (true) {
                if (linha != null) {
                    System.out.println(linha);
                } else
                    break;
                linha = buffRead.readLine();
                
            }
        }
    }
    
}
